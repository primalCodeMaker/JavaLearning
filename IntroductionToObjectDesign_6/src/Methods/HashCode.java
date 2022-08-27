package Methods;

// mechanizm, ktory pozwala na posegregowanie pewnych obiektow w grupy
// do kazdego obiektu na podstawie jego pol oblicza i przypisuje pewna wartosc

//jesli obiekty sa equals true to maja taki sam HashCode
//taki sam HashCode nie oznacza ze obiekty sa equals true

public class HashCode {

    private String marka;
    private String model;
    private int productionYear;


    public static void main(String[] args) {
        HashCode car1 = new HashCode();
        HashCode car2 = new HashCode();
        HashCode car3 = new HashCode();
        HashCode car4 = new HashCode();
        HashCode car5 = new HashCode();

        car1.VWgarbus(
        System.out.println(car1());
        // todo 41 min filmu



    }

    private static void VWgarbus (String marka, String model, int productionYear) {
        marka = "VolksWagen";
        model = "Garbus";
        productionYear = 1984;
    }
}


