package polimorfizm.SecondExample;

public class Suv implements Car {

    private double height;

    public Suv (double height) {
        this.height = height;
    }

    public double getHeight() {return height;}

    public void setHeight (double height) {this.height = height;}

    @Override
    public void describle() {
        System.out.println("Suv describle start");
        System.out.println("Suv height " + height);
        System.out.println("Suv describle end");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Suv{");
        sb.append("height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
