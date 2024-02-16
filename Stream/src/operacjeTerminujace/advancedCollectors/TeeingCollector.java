package operacjeTerminujace.advancedCollectors;

// dodany w Javie 12

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector {

    public static void main(String[] args) {

        Pair collectToPair = Stream.of(5, 6, 8, 10, 45)
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.summingInt(elem -> elem),
                        (c1, c2) -> new Pair(c1, c2)


                ));
        System.out.println(collectToPair);

    }

    private static class Pair {
        Long count;
        Integer sum;

        public Pair(Long count, Integer sum) {
            this.count = count;
            this.sum = sum;
        }

        public Long getCount() {
            return count;
        }

        public Integer getSum() {
            return sum;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "count=" + count +
                    ", sum=" + sum +
                    '}';
        }
    }
}
