package Methods.chaining;

public class Cat {

    private String first;
    private String second;
    private String thidr;
    private String fourth;
    private String fifth;

    public Cat() {

    }

    public Cat withFirst(String first) {
        this.first = first;
        return this;
    }

    public Cat withSecond(String second) {
        this.second = second;
        return this;
    }

    public Cat withThidr(String thidr) {
        this.thidr = thidr;
        return this;
    }

    public Cat withFourth(String fourth) {
        this.fourth = fourth;
        return this;
    }

    public Cat withFifth(String fifth) {
        this.fifth = fifth;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("first='").append(first).append('\'');
        sb.append(", second='").append(second).append('\'');
        sb.append(", thidr='").append(thidr).append('\'');
        sb.append(", fourth='").append(fourth).append('\'');
        sb.append(", fifth='").append(fifth).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

