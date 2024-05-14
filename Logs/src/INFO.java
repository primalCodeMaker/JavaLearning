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











     */

}