package Methods.Testing;

public class Car {
    @Override
    public String toString() {
        return "HashCode{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

        public void VWgarbus () {
        marka = "VolksWagen";
        model = "Garbus";
        productionYear = 1984;
    }

    public void forFun() {
        String marka = new String("Tesla");
        System.out.println(marka);
        System.out.println(this.marka);

    }

    private String marka;
    private String model;
    private int productionYear;



}
