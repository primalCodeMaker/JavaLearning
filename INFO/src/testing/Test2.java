package testing;

public class Test2 {

     private String name2;
     public String troll;

    public Test2(final String name2) {
        this.name2 = name2;
    }

    public void setTroll(String troll) {
        this.troll = troll;
    }

    public Test2() {
    }



    @Override
    public String toString() {
        return "test2{" +
                "name2='" + name2 + '\'' +
                ", troll='" + troll + '\'' +
                '}';
    }
}

