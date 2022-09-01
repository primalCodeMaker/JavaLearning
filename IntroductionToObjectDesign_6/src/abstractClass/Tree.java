package abstractClass;

public class Tree extends Plants {

    public Tree(String colour) {
        super(colour);
    }

    @Override
    public String needWater() {
        return "pls water!";
    }


}


