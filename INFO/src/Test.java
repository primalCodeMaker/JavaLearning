public final class Test extends Test2 {

    private final String name;

    public Test(final String name, final String troll) {
        this.name = name;
        this.troll = troll;
    }

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", troll='" + troll + '\'' +
                "} " + super.toString();
    }
}


