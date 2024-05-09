package pl.logs.logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger2 {

    private static final Logger log = LoggerFactory.getLogger(Logger2.class);

    public static void log() {
        log.trace("Trace Message in: {}", Logger2.class.getName());
        log.debug("Trace Message in: {}", Logger2.class.getName());
        log.info("Trace Message in: {}", Logger2.class.getName());
    }




}
