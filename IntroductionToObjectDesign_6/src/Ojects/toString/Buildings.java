package Ojects.toString;

public class Buildings {
    public String address = "new street";
    public int number = 10;
    public Flat flat = new Flat();


    @Override
    public String toString() {
        return "Buildings{" +
                "address='" + address + '\'' +
                ", number=" + number +
                ", flat=" + flat +
                '}';
    }
}
