public class First {

    // Napisz program sprawdzający, czy podany rok jest przestępny i na ekranie wydrukuj TAK lub NIE.

    public static void main(String[] args) {

        String luty = "luty";
        int a = 29;


        if (luty.equals(a)) {
            System.out.println("Rok przestepny");
        } else {
            System.out.println("rok zwykly");
        }

        System.out.println("--------------");
        int rok = 2008;

        boolean div4 = rok % 4 == 0;
        boolean div100 = rok % 100 != 0;
        boolean div400 = rok % 400 == 0;

        if (div4 && div100 || div400) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }




    }
}
