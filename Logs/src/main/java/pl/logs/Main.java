package pl.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.logs.logger.Logger1;
import pl.logs.logger.Logger2;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {

        log.trace("Trace Message in: {}", Main.class.getName());
        log.debug("Debug Message in: {}", Main.class.getName());
        log.info("Info Message in: {}", Main.class.getName());
        log.warn("Warn Message in: {}", Main.class.getName());
        log.error("Error Message in: {}", Main.class.getName());

        Logger1.log();
        Logger2.log();


    }
}
