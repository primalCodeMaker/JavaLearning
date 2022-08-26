package OjectBasics;

public class Main {

    public static void main(String[] args) {


        Tuna tuna1 = new Tuna();
        Tuna tuna2 = new Tuna();
        Tuna tuna3 = new Tuna();

        Tuna tuna4 = tuna2;

        System.out.println(tuna1.name);
        System.out.println(tuna2.name);
        System.out.println(tuna3.name);
        System.out.println(tuna4.name);
        System.out.println("----------");
        tuna2.name = "Tunek";
        tuna1.swim();
        tuna2.swim();
        tuna3.swim();
        tuna4.swim();


    }
}
