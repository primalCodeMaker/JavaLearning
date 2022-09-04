package polimorfizm.FirstExample;

public class Car{

    protected String color;

    public Car(final String color){
        this.color = color;
    }

    public void describle() {
        System.out.println("car color " + color);
    }
}
