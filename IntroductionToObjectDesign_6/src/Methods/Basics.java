public class Basics {

    public static void main(String[] args) {

        int wynik = dodawanie(2,4);
        System.out.println(wynik);

        int a = 466466543;
        int b = 48423416;
        int minus = odejmowanie(a, b);
        System.out.println(minus);

        int result = odejmowanie(dodawanie(1,2),dodawanie(1,1));
        System.out.println(result);

    }


    public static int dodawanie(int liczba1, int liczba2) {
        int sum = liczba1 + liczba2;
        return sum;

    }

    public static int odejmowanie(int liczba1, int liczbe2) {
        int wynik = liczba1 - liczbe2;
                return wynik;

    }

}
