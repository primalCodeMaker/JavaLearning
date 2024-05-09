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

    Koniguracja Logbacka w konsoli :
        trzeba dodac do src/main/  katalog resources
        robimy w nim plik logback.xml

        <root> porajemy jaki poziom logow chcemy zapisywac
        <root> <appender-ref> tutaj podajemy gdzie chcemy logowac,
            np: <appender-ref ref="CONSOLE"/>  do konsoli   (ten zapis z / na koncu otwiera i zamyka TAGA w 1 linijce)






     */

}