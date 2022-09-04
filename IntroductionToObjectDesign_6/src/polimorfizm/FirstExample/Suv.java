package polimorfizm.FirstExample;

public class Suv extends Car {

    private double height;

    public Suv (final String color, final double height) {
        super(color);
        this.height = height;
    }

    public double getHeight() {return height;}

    public void setHeight (double height) {this.height = height;}

    @Override
    public void describle() {
        System.out.println("Suv describle start");
        super.describle();
        System.out.println("Suv height " + height);
        System.out.println("Suv describle end");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Suv{");
        sb.append("height=").append(height);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
