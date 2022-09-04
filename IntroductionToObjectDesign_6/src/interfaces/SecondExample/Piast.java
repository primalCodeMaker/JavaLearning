package interfaces.SecondExample;

public class Piast implements Beer, BreweryConcern {

    private String bottle;
    private String hope;
    private String cap;

    public Piast(String bottle, String hope, String cap) {
        this.bottle = bottle;
        this.hope = hope;
        this.cap = cap;
    }


    public String getbottles() {
        String a = Beer.super.bottles();
        return a;
  }


    public String getBottle() {
        return bottle;
    }



    @Override
    public void metodaNadpisanaDopierowKlasie() {
        System.out.println("metodaNadpisanaDopierowKlasie");
    }

    @Override
    public String typeOfHops() {
        //System.out.println("overrided type of Hops in piast");
        return "overrided type of Hops in piast";
    }

    @Override
    public String cap() {
        //System.out.println("ocerrided cap in piast");
        return "ocerrided cap in piast";
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Piast{");
        sb.append("bottle='").append(bottle).append('\'');
        sb.append(", hope='").append(hope).append('\'');
        sb.append(", cap='").append(cap).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
