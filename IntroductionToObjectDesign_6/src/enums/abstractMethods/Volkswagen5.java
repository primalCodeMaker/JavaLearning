package enums.abstractMethods;

public enum Volkswagen5 {
    GARBUS("Red", 1973) {
        @Override
        public Volkswagen5 ifMissing() {
            return OGOREK;
        }
    },
    OGOREK("Yellow", 1962){
        @Override
        public Volkswagen5 ifMissing() {
            return VESTFALIA;
        }
    },
    VESTFALIA("Orange", 1988){
        @Override
        public Volkswagen5 ifMissing() {
            return OGOREK;
        }
    },
    PASSAT("Black", 2020){
        @Override
        public Volkswagen5 ifMissing() {
            return null;
        }
    };


    private String colors;
    private int procuctionYear;


    Volkswagen5(String colors, int productionYear) {
        this.colors = colors;
        this.procuctionYear = productionYear;
    }

     public abstract Volkswagen5 ifMissing();


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



}