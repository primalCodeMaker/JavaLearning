package polimorfizm.FirstExample;

public class Cabriolet extends Car {


    private boolean roofOpened;

    public Cabriolet (final String color, final boolean roofOpened) {
        super(color);
        this.roofOpened = roofOpened;
    }

    public boolean isRoofOpened() {return roofOpened;}

    public void setRoofOpened(boolean roofOpened) {this.roofOpened = roofOpened;}

    public void describleDefault() {
        super.describle();

    }

    @Override
    public void describle() {
        System.out.println("Cabriolet describle start");
        super.describle();
        System.out.println("Cabriolet roof opened " + roofOpened);
        System.out.println("Cabriolet describle end");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cabriolet{");
        sb.append("roofOpened=").append(roofOpened);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
