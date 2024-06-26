public class INFO {

    /*

    Jesli kozystamy z slf4j to musimy zaimportowac w buildzie gradlowym:
        implementation group: 'org.slf4j', name: 'slf4j-api', version: '1.7.36'
        implementation group: 'org.slf4j', name: 'slf4j-simple', version: '1.7.36'

    Jesli kozystamy z logbacka to wystarczy jeden wpis. Logback sam reszte zaciaga z bibliotek:
        implementation group: 'ch.qos.logback', name: 'logback-classic', version: '1.2.11'


    w klasie w taki sposob definiujemy loggera:
        private static final Logger log = LoggerFactory.getLogger(Main.class);
        logi Trace w konsoli nie pojawiaja sie

    Koniguracja Logbacka :
        trzeba dodac do src/main/  katalog resources
        robimy w nim plik logback.xml


        <configuration>
    <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">  - appender name tworzy obiekt z nasza nazwa, za pomoca ktorej pozniej wywolujemy ten obiekt. Class mowi gdzie logujemy, w tym przypadku do konsoli
        <encoder>
            <pattern>%d{HH::mm:ss.SSS} [%t] %-5level %logger {36} -  %msg%n</pattern>  - tu piszemy co chcemy aby sie logowalo
                       {HH::mm:ss.SSS} - format daty i godz
                       [%t]            - info o watku kory loguje
                       %-5level        - info jaki poziom logu, + ilosc znakow. -5 justuje do lewej drukowane info na temat poziomu logu i ladnie uklada kolumne. Mozna uzyc samo 5 i bedzie justowalo do prawej
                       %logger {36}    - ilsoc znakow w jakiej ma byc podana sciezka skad jest log. max 36
                       %msg%n          - wiadomosc
                       zmiennych jest duzo wiecej w dokumentacji
                        np:  %logger {36}:%method:%line:
        </encoder>
    </appender>

            LOGGER - okreslamy logowanie tylko dla okreslonej paczki/klasy. Jesli dzialamy na paczce Logger1 to mamy logowac z poziomem debug
                     uzywamy jesli chcemy dla jakiejs paczki ustawic inny poziom logowania niz w calej plikacji
     <logger name="pl.logs.logger" level="debug" additivity="false">    // additivity="false" / "true" (duplikuje wartosci w konsoli)
        <appender-ref ref="CONSOLE"/>
    </logger

                             ROOT - uzywamy w calej aplikacji z poziomem jaki wybierzemy
        <root level="warn"> podajemy jaki poziom logow chcemy zapisywac w calej aplikacji
         <root> <appender-ref> tutaj podajemy ktory apender chcemy uzyc z wczesniej zdefiniowancyh,
            np: <appender-ref ref="CONSOLE"/>    (ten zapis z / na koncu otwiera i zamyka TAGA w 1 linijce)

                                                tu podajemy nazwe apendera ktora wpisywalismy w apender name wyzej, inaczej nie bedzie logowalo
               przyklad roota:
    <root level="info">
        <appender-ref ref="CONSOLE"/>
    </root>

------------------------------------------------------------

Logowanie do pliku:
wcześniej pod tagiem <configuration> tworzymy zmienna, ktora podaja nam sciezke do pliku:

<property name = "HOME_LOG" value = "${user.dir}/logs/pl.logs.log"/>

Apender wyglada w taki sposob z wykozystaniem zmiennej:

<appender name="toFileLogs" class="ch.qos.logback.core.FileAppender">
        <file>${HOME_LOG}</file>
        <append>true</append>                    <<<< to nie nadpisuje starych logow tylko wpisuje kolejne wiersze
        <immediateFlush>True</immediateFlush>    <<< zapisuje od razu logi do pliku bez przetrzymywania ich w pamieci

        <encoder>                                <<< patern okresla nam format logow do pliku
            <pattern>%d{HH::mm:ss.SSS} [%t] %-5level %logger{36}%logger {36}:%method:%line: -  %msg%n</pattern>
        </encoder>
    </appender>

    mozemy taka konfiguracje uzyc dla folderu, jesli root aplikacji jest inny:

    <logger name="pl.logs.logger" level="debug" additivity="false">
        <appender-ref ref="toFileLogs"/>
    </logger>

jesli roota logujemy do consoli a tylko wybrana paczke do pliku, to ta paczka ma podmieniony calkowicie config
i bedzie logowala tylko do pliku. W consoli nie bedzie info
Aby to zmienic mozna zmienic additivity="true":
wtedy bedzie logowal i root i dodatkowy logger, logi nie beda sie nadpisywac tylko beda w 2 miejscach zgodnie z konfiguracja
(dziedziczenie logerow)

<logger name="pl.logs.logger" level="debug" additivity="true">


lub dopisac drugi apender w tej osobnej konfiguracji, ktory bedzie mowil gdzie ma jeszcze logowac:
<logger name="pl.logs.logger" level="debug" additivity="false">
        <appender-ref ref="toFileLogs"/>
        <appender-ref ref="CONSOLE"/>
    </logger>


Logowanie do jednego pliku jest problematyczne bo z czasem ma on za duzy rozmiar.
Nalezy takie pliki dzielic

tutaj uzywamy rollingPolicy aby zdefiniowac kiedy maja sie tworzyc nowe pliki z logami:

 <rollingPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy">                  <<< SizeAndTimeBasedRollingPolicy nowy plik jesli przekroczy rozmiar lub nasz ustalona date
 <fileNamePattern>${user.dir}/logs/archived/pl.logs.rolling.%d{yyyy-mm-dd}.%i.log</fileNamePattern> <<< tu ustalamy co ile ma sie robic nowy plik. %i jest licznikiem do robienia nowych plikow

 dodatkowe opcje:
            <maxFileSize>10MB</maxFileSize>
            <totalSizeCup>1GB</totalSizeCup>
            <maxHistory>10</maxHistory>

PELEN PRZYKLAD:
 <property name = "HOME_LOG_ROLLING" value = "${user.dir}/logs/pl.rolling.log"/>      <<< zmienna ZDEFINIOWANA GDZIE MA BYC PLIK I JAK SIE NAZYWAC

NIZEJ DEFINIUJEMY LOGGER TYPU ROLLING POLICY (ZAWIJANIE PLIKOW):

 <appender name="rollingFiles" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <file>${HOME_LOG_ROLLING}</file>
        <rollingPolicy class ="ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy">
                <fileNamePattern>${user.dir}/logs/archived/pl.logs.rolling.%d{yyyy-mm-dd}.%i.log</fileNamePattern>
            <maxFileSize>10MB</maxFileSize>
            <totalSizeCup>1GB</totalSizeCup>
            <maxHistory>10</maxHistory>
        </rollingPolicy>

        <encoder>
            <pattern>%d{HH::mm:ss.SSS} [%t] %-5level %logger{36}%logger {36}:%method:%line: -  %msg%n</pattern>
        </encoder>
    </appender>


A TU PLISZEMY ODDZIELY LOGGER DLA TEGO ROZWIAZANIA PO ZA ROOTEM:

    <logger name="pl.logs.loggerLoop" level="debug" additivity="false">
        <appender-ref ref="rollingFiles"/>
    </logger>



     */

}