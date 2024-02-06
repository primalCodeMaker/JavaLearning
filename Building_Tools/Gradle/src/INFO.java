public class INFO {
    /*
    ctrl + alt + shitft + C na zaznaczonej klasie
    kopiuje pelna sciezke do tej klasy, np klasa Main:
                                pl.gradleExample.Main


Gradle rozni sie od Mavena tym, ze Maven jest gotowym szkieletem, w ktory wkladamy pluginy i dependencje
    a Gradle jest osobnym programem, ktory sami piszemy, skladamy i konfigurujemy.
    Mozemy mu dodawac wlasnie opcje, ktore beda dzialac na etapie runtimu jak: println

    GRADLE  NIE JEST  KOMPATYBILNY WSTECZNIE
        w gradlu istnieje opcja Gradle Wrapper, dzieki ktorej mozemy ustawic jakiej wersji gradla chemy uzywac
        w pliku gradle-wrapper.properties:


    W Gradle plik konfiguracyjny robimy pod nazwa:
        build.gradle
        po zrobieniu pliku IntelliJ automatycznie nas zapyta czy chcemy zbudowac projekt gradle

        kolejno trzeba wybrac odpowiednia wersje gradla do javy ktora uzywamy.
        w necie latwo to sprawdzic i klikajac 2x shift wyszukujemy klasy gradle-wrapper.properties
        tam podmieniamy wersje na ta ktora nas interesujemy i odswierzamy projekt

            distributionBase=GRADLE_USER_HOME
            distributionPath=wrapper/dists
            distributionUrl=https\://services.gradle.org/distributions/gradle-7.5-bin.zip   <<< o tu
            zipStoreBase=GRADLE_USER_HOME
            zipStorePath=wrapper/dists

            jesli nie kozystamy z intelliJ i chcieli bysmy zrobic taki wrapper to mozna to zrobic z konsoli
                gradle wrapper --gradle-version 6.8 (ustalamy od razu wersje pod jave jaka mamy)

        jesli mamy problemy z wersja Javy mimo ustawien w wrapper.propertisach warto zobaczyc
        do zmiennych srodowiskowych systemu i usunac ustawienie JAVA_HOME poniewaz to porafi nadpisac
        domyslna wersje Javy

        w razie problemow wersje mozna sprawdzac w 2 miejscach:
        gradle -v  dla gradla ustawionego w projekcie
        gradlew - v dla ustawien javy w systemie operacyjnym

Nasza klasa main nadal nie jest odczytywana jako klasa javowa i nie mozna jej odpalic
    build.gradle nalezy dodac plugin     apply plugin: 'java'
    w build.gradle mozna rowniez ustawic sourceCompatibility = '18' wersje kompatybilnosci z java dla projektu
    oraz parametr version '0.1.0' << ustalamy w jakiej wersji jest nasz projek

    mozna rowniez wpisac targetCompatibility = '17' << odpowiednik source i target dla Mavena
        ustalamy rozne wersje compilacji i runtimu dla aplikacji.
        Jesli nie wpiszemy targetCompatibility to Gradle samoczynnie ustawi ta sama wersje jak dla sourceCompatibility

aby wskazac gdzie jest metoda urchomieniowa naszego pliku musimy ja podac poprzez manifest jak w Mavenie:
ar {
    archivesBaseName = 'myGradle-jar-new'     <<< nazywamy nasz plik uruchomieniowy
    manifest {
        attributes 'Main-Class': "pl.gradleExample.Main"  <<< podajemy sciezke katalogowa do niego
    }
}
z terminala odpalamy: java -jar .\myGradle-jar-new-0.1.0.jar <<< sama nazwa pliku z build.lib z rozszerzeniem jar



w Gradlu nie piszemy w xml jak w przypadku Mavena tylko DNS (domain specific language)
    mozna tu uzyc jezyk Groovy lub Kotlin

    Schemat dzialania:
W Mavenie mamy- Lifecycle, Phase oraz Golas
w Gradlu mamy- Project i Task

    Project - moze sluzyc reprezentacji bytu koncowego ktorym moze byc np: koncowy plik .jar
        caly nasz projekt moze byc "projectem w Gradlu" lub byc podzielona na podczesci (osobne Projecty Gradlowe)

    Task- jakas czesc pracy, ktora nalezy wykonac aby przyczynic sie do powstania koncowego builda
        np: kompilacja kodu, generowac kod i domumentacji, dodanie zaleznosci w repo itd

Aby odpalic gradle z terminala wpisujemy: gradle nazwaTaskaKtoryChcemyOdpalic
    mozna tez odpalic z paremetrem -q (quiet) i wydrukuje tylko polecenia bez automatycznych Gradlowych informacji

przy uruchomieniu komendy gradle tasks wyswietli nam wsystkie dostepne takski dla projektu w gradle
    z paramerem --all pokaze rowniez nasze napisane taski

Taski w gradlu nie są kaskadowe jak w Mavenie tylko niektore zaleza od siebie a od innych nie
np: Build zalezy od - check i assemble
    check zalezny od test
    test zalezy od testClasses\
Wszystko mozna sprawdzic w dokumentacji
Jeśli wybierzemy jakiś, task ktory jest zalezny od innych to po kolei beda sie one wywolywac


Isnieje rowniez koncepcja taskow domyslnych:
defaultTasks 'ourFirstTask', 'ourThirTask'
    mozemy w nim podac kilka taskow ktore chcemy odpalic jeden po drugim
    odpalamy komenda w terminalu "gradle"
    lub z poziomu intelliJ jako Run Gradle


Taski moga wzajemnie od siebie zalezec:

    task afterCompie(dependsOn: 'compile') {
        group 'tasks dependent on each other'
        doLast {
             println 'afterCompile task runing'
        }
    }
    lub

    afterClean.dependsOn clean
    calkowicie po za scopami taskow

     */

}
