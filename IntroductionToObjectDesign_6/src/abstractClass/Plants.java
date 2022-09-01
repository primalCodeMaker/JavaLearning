package abstractClass;

public abstract class Plants {
    private String colour;
    private int numberOfLeafs;

    public Plants(String colour) {
        System.out.println("superclass tree created");
        this.colour = colour;
    }

        public abstract String needWater();

        public int numberOfLeafs() {
            return 10;
    }

}
