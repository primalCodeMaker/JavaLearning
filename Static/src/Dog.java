public class Dog {

    public static int howManyDogsWeHaveGot = 0;

    private String name;

    Dog(String name) {
        this.name = name;
        Dog.howManyDogsWeHaveGot++;
    }

public static void staticMethod(){
    System.out.println("static method here");
    // tutaj nie mozemy sie odniesc do metody niestatycznej
   // System.out.println(Dog.name); do pola name tez sie nei odniesimy w konteksie statycznym bo name jest przeznaczone dla obiektu a obiekt tutaj nie istnieje na poziomie kompilacji
}

public void nonStaticMethod() {
    System.out.println("non static method here");
    staticMethod(); // w metodzie niestatycznej mozemy sie odniesc do statycznej
}

}
