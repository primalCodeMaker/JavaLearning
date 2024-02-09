/*
        Inna metoda wczytywania puginu Javy do projektu:
plugins {
    id 'java'
}


aby dodawac dependencje w Gradle musimy pierw podac namiar na repozytorium skad ja pobrac np:

repositories {
    mavenCentral()    <<< tutaj podajemy repo
}
mozemy rownie wpisuwac repozytoria po http:
maven {
        url 'https://someRepository1.pl'
    }
    maven {
        url 'https://someOtherRepository2.pl'
    }




dependencies {
    implementation group: 'org.jsoup', name: 'jsoup', version: '1.14.3'   <<< a tutaj zaleznosc jaka nas interesuje
    implementation 'org.jsoup:jsoup:1.14.3'                               <<< to samo za pomoca krotszego zapisu
}

Dependencje mają dodawane wpsy
Stare, już nie używane, moga byc w starych projektach - compile, testCompile, runtime, testRuntime

compile - uzywane na etapie kompilacji i uruchomienia
runime - tylko uruchomienie

Nowe: (6 poodstawowych, jest wiecej)
compileOnly - dependencja ma byc uzywana tylko na etapie kompilacji
runtimeOnly
implementation - na etapie kompilacji i runtimu
testCompileOnly
testRuntimeOnly
testImplementatio




aby zrobic fatJara zawierajacego w sobie wszystkie dependencje uzywane w projekcie, do scopa Jar trzeba wpisac:

jar {
    manifest {
        attributes 'Main-Class': 'pl.gradleExample.Main'
    }
    from {    <<<<<<< o ta czesc !!!
        configurations.runtimeClasspath.collect {it.isDirectory() ? it : zipTree(it)
        }
    }
}        (w jezyku Groovy zmienna dla lambdy domyslnie przyjmuje nazwe it)



Dodatkowo w Gradle mozna zrobic osobny plik settings.gradle, w ktorym mozemy defioniowac
kilka projektow Gradlowych w jednej aplikacji. (np przy mikroserwisach)

Ustawienia projektow/modołów aplikacji robi sie w settings.gradle
a w build.gradle dodaje sie konfiguracje uruchamiania,repozytoria, dependencje, pluginy

a gdybysmy chcieli np: ograniczyc zuzycie pamieci Gradla podczas operacji to robi sie to w
plikach gradle-wrapper.properties

 */