package generics.Practice.First;

public class Weapons extends Item{

    private final Integer space;

    public Weapons(Integer space) {
        this.space = space;
    }

    public Integer getSpace() {
        return space;
    }

    @Override
    public String toString() {
        return "Weapons{" +
                "space=" + space +
                '}';
    }
}