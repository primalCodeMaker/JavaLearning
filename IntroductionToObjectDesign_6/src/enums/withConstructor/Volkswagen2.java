package enums.withConstructor;

public enum Volkswagen2 {
    GARBUS("Red", 1973),
    OGOREK("Yellow", 1962),
    VESTFALIA("Orange", 1988),
    PASSAT("Black", 2020);


    private String colors;
    private int procuctionYear;


    Volkswagen2(String colors, int productionYear) {
        this.colors = colors;
        this.procuctionYear = productionYear;
    }

    public String getColors() {
        return colors;
    }

    public int getProcuctionYear() {
        return procuctionYear;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setProcuctionYear(int procuctionYear) {
        this.procuctionYear = procuctionYear;
    }

    @Override
    public String toString() {
        return "Volkswagen2{" +
                "colors='" + colors + '\'' +
                ", procuctionYear=" + procuctionYear +
                "} " + super.toString();
    }
}