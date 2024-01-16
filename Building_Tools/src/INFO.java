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



budowa POM.xml

project
        xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

-------
powyzsze dane bedza zazwyczaj kopiowane z projektu
modelVersion mowi nam, ze wersja pliku POM jest kompatybilna z mavenem w odpowiedniej wersji. To tez kopiujemy
-------


    <groupId>pl.zajavka</groupId>
    <artifactId>java-maven-examples</artifactId>
    <version>1.8.0</version>

--------
powyzsze dane wpisujemy recznie
groupID - zazwyczaj nazwa organizacji dla ktorej robimy projekt
        odpowaiada hierarhi katalogowej gdzie znajduja sie pliki do projektu

artifactID -

--------

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

</project>



komendy w terminalu:
mvn - clean
    usowa katalog target

mvn -v
    sprawdza wersje

mvn -

 */
                    //    todo 17min filmu

}
