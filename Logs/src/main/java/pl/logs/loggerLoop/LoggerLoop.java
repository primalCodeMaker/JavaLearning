package pl.logs.loggerLoop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class LoggerLoop {

    public static final Logger log = LoggerFactory.getLogger(LoggerLoop.class);

    private static final Map<Integer, Consumer<Integer>> ACTIONS = Map.of(
            0, key -> log.debug("some debug message, key: {}", key),
            1, key -> log.info("some info message, key: {}", key),
            2, key -> log.warn("some warn message, key: {}", key),
            3, key -> log.error("some error message, key: {}", key)
    );

    public static void log() {
        IntStream.rangeClosed(0, 500_000)
                .map(i -> i % 4)
                .forEach(key -> Optional.ofNullable(ACTIONS.get(key))
                .orElseThrow(() -> new RuntimeException("case not found"))
                .accept(key));

    }

}
