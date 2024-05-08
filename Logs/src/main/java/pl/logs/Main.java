package pl.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    // w tej konfigutacji uzycia slf4j nie kozustamy juz z java.util.logger
    // kozystamy z paczki: org.slf4j.impl.SimpleLogger
    public static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        System.out.println(log.getClass());  //class org.slf4j.impl.SimpleLogger
        System.out.println(log.getName());   // pl.logs.Main

        // Rodzaje logow z lf4j z zdefiniowanymi paramerami, ktore beda sie drukwoac:
        log.trace(" parameter: {}", 123);
        log.debug(" parameter: {}", 234);
        log.info(" parameter: {} - parameter2: {}", 345, 377);
        log.warn(" parameter: {}", 456);
        log.error(" parameter: {}", 547);


        try {
            method1();
    } catch (Exception e) {
            log.error("Exception was thrown", e);
        }
    }

    private static void method1() {
        throw new RuntimeException("exception message from method1");

    }
}
