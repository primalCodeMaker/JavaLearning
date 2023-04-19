package Part2.streamExercises;

public class Five {

    // Jeżeli podpowiem, że String posiada metodę .chars(), która generuje IntStream, spróbuj
    // zaimplementować sprawdzanie, czy słowo/zdanie jest palindromem, przy wykorzystaniu Streamów.

    public static void main(String[] args) {
        String s1 = "sedes";
        String s2 = "noSedes";

        System.out.println(s1 + " " + isPalindrom(s1));

        System.out.println(s2 + " " + isPalindrom(s2));

    }

    private static boolean isPalindrom(String sth) {
        String toStreingReversed = sth.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (left, right) -> right.concat(left));

        return toStreingReversed.equals(sth);
    }
}
