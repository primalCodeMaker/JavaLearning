package org.example1;

public class INFO1_basics_implementacja_adnotacje {

    /*
    JUnit - framework do pisania testów
    TestNG - inny framework
    Mockito - framework do mockowania

        JUnit sklada sie z 3 modolow:
    JUnit Platform - platfirma do uruchamiania roznych frameworkow testowych na JVM.
        Interface pomiedzy JUnit a narzedziami do budowania.
        Pozwala skonfigurowac projekt tak aby Testy byly uruchamiane na etapie buildu

    JUnit Jupiter - modol ktory wprowadza nowe adnotacje w wersji 5 w stosunku do poprzednich wersji
    JUnit Vintage - jesli mamy napisane testy w wersji JUnit ponizej 5 to potrzebujemy tego modulu do odpalenia ich


w buildzie potrzebujemy dodac 2 dependencje
junit-jupiter-engine
oraz junit-jupiter-api, kory jest automatycznie dodawany z jupiter-engine

Scope - ustawiamy tylko na test, nie powinna byc dostepna w normalnym kodzie
<scope>test</scope>

trzeba dodac jeszcze surefire-plugin, ktory sluzy do tego aby testy uruchamialy sie na etapie buildu
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>3.5.0</version>
</plugin>

surefire-plugin dziala w takiej konwencji, ze jesli w katalogu test >> java umiescimy klase z koncowka "test", "tests" albo "testcase" np: "mainTest" to testy zawarte w tej klasie zostana uruchomione na poziomie builda
Klasa testowa musi odpowiadac klasie, ktora testujemy z dopiskiem Test
moze posiadac wiele testow
metody testowe moga miec rozne nazwy niz metody z klasy bazowej

W projektach Gradlowych nie musimy implementowac surefire-plugina, tylko ma obsluge JUnita wbudowana domyslnie.
W Gradle klasa nie musi konczyc sie na "Test", program i tak je uruchomi.
Aby ja wlaczyc wpisujemy po zamknieciu dependencji:

tet {
useJunitPlatform()
testLogging{
events "passed", "skipped", "failed"
}
}

Podczas buildu Mavenowego mozna dodac flage -DskipTests i uruchomi sie build ale testy zostana pominiete
Podczas buildu Gradlowegeo mozna dodac flage -x test i uruchomi sie build ale testy zostana pominiete


Szybkie zakładanie klasy testowej dla naszej klasy Bazowej:
CTRL + SHIFT + T  >> Create new Test


jesli metody w klasie glownej sa statyczne mozemy je testowac bez instancji klasy
jezeli metody nie sa statyczne musimy stworzyc instancje tej klasy w klasie testowej
    i pozniej w kazdym tescie mozemy zdefiniowac ten obiekt na nowo poprzez nadpisanie zmiennej myClass = new myClass();

Podczas pisania ciala testow uzywamy konwencji:
Given - deklarujemy dane wejsciowe do testow
When - co ten test faktycznie robi
Then - co jest spodziewanym wynikiem testow


Kolejnosc metod w testach jest niezalezna i sa wywolywane randomowo jesli chodzi o kolejnosc,
kazda metoda jest trakowana oddzielnie
nie mozna polegac, ze metody wywolaja sie zgodnie z klejnoscia jak je napiszemy
Da sie to wymusic, ale nie jest to dobra praktyka


@DisplayName("what test do")
    ta adnotacja pozwala na opisanie testu, ktory sie wypisze w Logach po wykonaniu testow

        Adnotacje, ktore pzowalaja odpalic metody / kod przed lub po testach w roznych wariantach
        nie trzeba ich pisac kazdorazowo przy pojedynczych testach, wystarczy raz na poczatku klasy z odpowiednia adnotacja
@BeforeAll
    adnotacja, ktora wykonuje czesc kodu, przed wszystkimi testami
    np: moze otworzyc polaczenie z baza danych aby nie robic tego za kazdym razem przy nowym tescie
    metody w tej adnotacji musza byc statyczne

@AfterAll
    adnotacja, ktora wykonuje czesc kodu, po wszystkich testach
    metody w tej adnotacji musza byc statyczne

@BeforeEach
    adnotacja, ktora wykonuje moetody przed kazdym jednym testem w klasie
    metody w tej adnotacji nie moga byc statyczne

@AfterEach
    adnotacja ktra wykonuje czesc kodu po kazdym pojedynczym tescie w klasie
    metody w tej adnotacji nie moga byc statyczne


     */
}
