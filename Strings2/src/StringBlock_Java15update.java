public class StringBlock_Java15update {

    public static void main(String[] args) {
        String input = """
                Hello!
                isnt me
                You're
                lookin for?
                    ;]           
                """;

        System.out.println(input);

        // spacje i taby rowniez sie drukuja przed i po znakach
        // dziala w nim system escapowania znakow
        // dzialaja opcje dla string format np: /n /b
        // nie jest zalecane uzywanie /n dla nowej linii
        //poniewaz rozjezdza sie to na rozmuch systemach
        // lepiej uzywac bezposrednio %n w String.Format

        String stringFormat = String.format("Uczymy sie programowania w %n %s", "Javie!");
        System.out.println(stringFormat);


        String secondExample = """
                %s jest super!,
                jeszcze %d lat nauki przedemna!
                """.formatted("java", 10);

        System.out.println(secondExample);
    }
}
