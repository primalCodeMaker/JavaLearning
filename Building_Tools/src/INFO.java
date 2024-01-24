public class INFO {

/*

Maven i Gradle - narzedzia do budowania projektow
Stosuje zasade konwencja ponad konfiguracja - chodzi o standaryzacje struktury folderow i plikow w projekcie

aby ustawic konfiguracje w glownym folderze projekty umieszczamy nowy plik: pom.xml
oraz katalog .mvn w ktrym umiescimy plik jvm.config
w ktorym byly by zawarte ustawienia z ktorych bedzie kozystal Maven np: ile maven moze zuzyc pamieci podczas Buildu

Struktura katalogow:
src
    > main
        > java          (nasz katalog roboczy)
        > resources     (pliki ktore sa odpowiedzialne za konfiguracje aplikacji)
    > test
        > java          (kod odpowiedzialny za testy w naszym projekcie)
        > resources     (pliki ktore sa odpowiedzialne za konfiguracje aplikacji)

Jak zaczniemy budować dodatkowo pojawi sie pomaranczowy katalog: target w glownym katalogu projektu
w ktorym beda umieszczane wyprodukowane przez mavena rezultaty
    mozna je czyscic komendą mvn -clean

maven jest domyslnie dodany do inteliJa
jesli chcemy kzystac z niego z poziomu terminala trzeba go sciagnac i folder bin dodac do patha

po uzyciu opcji install w mavenie w systemowym katalogu uzytkownika tworzy sie plik .jar z nasza biblioteka

w pliku pom.xml jest opcja aby ustawic dziedziczenie z innego pliku pom.xml
gdy kozystamy z dziedziczenia i  pogubimy sie co jest naszym pomem wynikowym (co jest efektem pracy),
mozna uzyc komendy w terminalu mvn help:effective-pom
to nam zwroci finalny pom ktory jest ostateczna konfiguracja tego co w projekcie bedzie sie dzialo na etapie budowania


Maven dodatkowo daje mozliwosc zapisu roznych konfiguracji uruchomieniowych dla programu
    (np: debiging - w comand line wpisujemy clean package -X)

-------------------------------------------------------------------------------------------------------------------
budowa minimalnego pliku POM.xml:

project
        xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>


powyzsze dane bedza zazwyczaj kopiowane z projektu
modelVersion mowi nam, ze wersja pliku POM jest kompatybilna z mavenem w odpowiedniej wersji. To tez kopiujemy
-----------------------------------------------------------------------------------------------------------------


    <groupId>pl.zajavka</groupId>
    <artifactId>java-maven-examples</artifactId>
    <version>1.8.0</version>


powyzsze dane wpisujemy recznie
groupID - zazwyczaj nazwa organizacji dla ktorej robimy projekt
        odpowaiada hierarhi katalogowej gdzie znajduja sie pliki do projektu

artifactID - nazwa projektu np: java-maven-examples

version - jesli wydajemy nasz kod w postaci pliku JAR, wpisujemy w jakiej wersji jest nsz plik
          Pozwala prowadzic dokumentacje i wersjonowanie w nsaszym projekcie jesli dochodza zmiany

-------------------------------------------------------------------------------------------------------------

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

powyzej ustalamy wersje Javy z jaka nasz program ma dzialac. Musi sie zgrywac z wersja mavena z ktora kozystamy

---------------------------------------------------------------------------------------------------------------
<dependencies>
        <dependency>
            <groupId>org.jsoup</groupId>        <<< tu wpisujemy zaleznosc jaka pobieramy
            <artifactId>jsoup</artifactId>      <<< te dane kopiujemy z internetu
            <version>1.14.2</version>           <<< tu wpisujemy wersje biblioteki jaka pobieramy
            <scope>compile</scope>                     <<< tu wpisujemy zakres dzialania [runtime / compile / provided + inne]
        </dependency>
    </dependencies>

scope jest ustawiany domyslnie na wartosci compile (dziala na etapie kompilacji oraz uruchomienia programu)
provided - na etapie kompilacji zaleznosc ma byc dodana ale na etapie uruchomienia programu juz nie
    (np: dana biblioteke dostarczy nam serwer i nie musimy tego robic lokalnie (np: biblioteka Lombook))
runtime - na etapie kompilacji biblioteka nie jest porzebna tylko na etapie dzialania programu
test - dana zaleznosc ma dzialac tylko w testach

SNAPSHOT - dependencja w fazie alfa, moze sie zmienic wiec nie waro uzywac do projektu

-----------------------------------------------------------------------------------------------------------------


   <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>8</source>
                    <target>8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>

compiler plugin - pozwala na automatyczne dostosowanie kompilacji javy, nie zmieniajac naszego domyslnego sourca w propertisach
    np: jak ustawimy compile na jave 7 i w projekcie napiszemy lambde, ktora weszla w javie 8 to do pluginu zostanie
    dodana opcja <configuration> ktora odpali jave w odpowiedniej wersji

w <configuration> ustasiamy 2 parametry
    source - jaka java na etapie kompilacji
    target - jaka java na etapie uruchamiania

z wersja 9 javy zamiast tego mozemy uzyc ustawienia <release>9</release>
i ustawic ten parametr jednoczesnie dla kompilacji i uruchamiania

Compiler Plugin jesli go nie nadpisujemy jest dodawany domyslnie w pom.xml

------------------------------------------------------------------------------------------------------------------


komendy w terminalu:
mvn -v - sprawdza wersje

mvn - clean
    usowa katalog target

FAZY LIFECYCLE:
mvn validate - nie buduje projektu, prawdza czy wsystko sie kompiluje zgodnie z naszymi ustaleniami
                np: czy ilosc linijek kodu lub ich dlugosc jest ok

mvn compie - wykonuje kompilacje kodu, buduje katalog target

mvn -test uruchamia testy automatyczne

mvn - package przygotuje paczke do wydania nie tworzy katalogu na dysku

mvn - verify sprawdza pokrycie kodu testami

mvn -install tworzy katalog na dysku z plikami projektu

mvn - deploy pozwala wydac paczke do otwartego repozytorum dla spolecznosci

(jesli odpalimy samo mvn -install to podspodem zostana pociagniete wszyskie poprzednie FAZY LIFECYCLE automatycznie.
    tak jest ze wszystkimi fazmi)

mvn help:effective-pom
    wyswietla cala konfiguracje dla ustawien pom.xml w projekcie
    oraz jakie pluginy zostaly uzyte


Rodzaje repozytorium do bibliotek:
Lokalne - czylo to co mamy sciagniete na dysku
Centralne  - na www maven central repository
Remote - dostepne w danej firmie, ktora wystawia swoje repo. np: firmy prowadza polityke jakiego rodzaju
        zaleznosci moga byc przytrzymywane w tym repo.
        Hermetyczne srodowisko, wszystkie zaleznosci sa zweryfikowane

w takiej kolejnosci maven sprawdza dostep do biblliotek. Na projekcie bedzie mogla zaistniec taka sytuacja, w ktorej
trzeba bedzdie zrobic konfiguracje w pom.xml aby maven nie pobieral bibliotek z central repo tylko z firmowego remote



 */


}
