public class Break {

    // jak argument if bedzie prawdziwy break przerwie dzialanie petli, w ktorej jest zagniezdzony.
    // petla zagniezdzona nie zostanie przerwana permamentnie, tylko warunek przerwania bedzie sprawdzany kazdorazowo gdy petla 1 sie wykona i przejdzie do petli drugiej
    // if j = 1 True - zatrzymaj dzialanie petli i nie sprawdzaj warunku j2

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("iiiiiii: " + i);

            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break;
                }
                if (i > 5) {
                    break;
                }
                System.out.println("j: " + j);

            }
        }

    }
}