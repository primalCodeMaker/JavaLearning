package staticVariableExample;

public class Car {

    private String company;
    private String model;
    private int prodYear;

    private SteeringWheel steeringWheel;
    static long staticNumberOfCarsCreated;
    long numberOfCarsCreated;

    public Car() {
        this.company = "Seat";
        this.model = "Cordoba";
        this.prodYear = 1997;
        this.steeringWheel = new SteeringWheel(0.35);
        horn();
        staticNumberOfCarsCreated++;
        numberOfCarsCreated++;
    }

    public void horn() {
        System.out.println("beep beep!");
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getProdYear() {
        return prodYear;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", prodYear=" + prodYear +
                ", steeringWheel=" + steeringWheel +
                '}';
    }
}
