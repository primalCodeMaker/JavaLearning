package staticVariableExample;

public class Run {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        System.out.println(car1.numberOfCarsCreated);
        Car car2 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        System.out.println(car2.numberOfCarsCreated);
        Car car3 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        System.out.println(car3.numberOfCarsCreated);
        Car car4 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        System.out.println(car4.numberOfCarsCreated);

       // zmienna Static zmienia swoja wartosc bo jest przypisana do klasy
        // zmienna non static nie zmienia swojej wartosci bo kazdorazowo sie zieksza od 0 dla kazdego nowego obiektu i mozna ja modyfikowac tylko w tym obiekcie
    }


}
