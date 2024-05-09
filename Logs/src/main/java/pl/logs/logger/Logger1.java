package pl.logs.logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger1 {

    private static final Logger log = LoggerFactory.getLogger(Logger1.class);

    public static void log() {
        log.trace("Trace Message in: {}", Logger1.class.getName());
        log.debug("Debug Message in: {}", Logger1.class.getName());
        log.info("Info Message in: {}", Logger1.class.getName());

    }




}
