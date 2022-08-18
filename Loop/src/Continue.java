public class Continue {

    // continue - pomija  wykonanie petli jesli warunek If = true
    // brak zatrzymuje dzialanie petli jesli trafi na 1 argument TRUE, i nie sprawdza kolejnych argumentow
    // continue przerywa dzialanie petli tylko dla warunku IF = True, natomiast sprawdza kolejne argumenty i wywoluje petle
    // if j = 1 True - pomin j=1, ale sprawdz dla j=2 ...

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("iiiiiii: " + i);

            for (int j = 0; j < 10; j++) {
                if (i == 0 || j == 1) {
                    continue;
                }
                System.out.println("j: " + j);

            }
        }

    }

}
