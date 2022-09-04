package polimorfizm.SecondExample;

public class Cabriolet implements Car {

    private String color;

    private boolean roofOpened;

    public Cabriolet (boolean roofOpened) {
        this.color = color;
        this.roofOpened = roofOpened;
    }

    public boolean isRoofOpened() {return roofOpened;}

    public void setRoofOpened(boolean roofOpened) {this.roofOpened = roofOpened;}


    @Override
    public void describle() {
        System.out.println("Cabriolet describle start");
        System.out.println("Cabriolet roof opened " + roofOpened);
        System.out.println("Cabriolet describle end");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cabriolet{");
        sb.append("color='").append(color).append('\'');
        sb.append(", roofOpened=").append(roofOpened);
        sb.append('}');
        return sb.toString();
    }
}
