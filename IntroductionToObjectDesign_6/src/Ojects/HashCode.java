package Ojects;

// mechanizm, ktory pozwala na posegregowanie pewnych obiektow w grupy
// do kazdego obiektu na podstawie jego pol oblicza i przypisuje pewna wartosc

//jesli obiekty sa equals true to maja taki sam HashCode
//taki sam HashCode nie oznacza ze obiekty sa equals true

public class HashCode {

    public static String marka = "nothink";
    public static String model;
    public static int productionYear;



    public static void main(String[] args) {
        HashCode car1 = new HashCode();
        HashCode car2 = new HashCode();
        HashCode car3 = new HashCode();
        HashCode car4 = new HashCode();
        HashCode car5 = new HashCode();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());


       car1.VWgarbus();
       car2.Mercedes();

        System.out.println(car1.toString());
        System.out.println(car1.hashCode());
        System.out.println(car2.toString());
        System.out.println(car2.hashCode());


    }

    public void VWgarbus () {
        marka = "VolksWagen";
        model = "Garbus";
        productionYear = 1984;
    }

        public void Mercedes () {
            marka = "Mercedes";
            model = "amg gt";
            productionYear =  2022;
    }


    @Override
    public String toString() {
        return "HashCode{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}


