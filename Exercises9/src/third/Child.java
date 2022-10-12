package third;

public class Child extends AParent{

    private String name;

    public Child (String name){
     this.name = name;
    }

    public static String getClassName(){
        return "getClassName in Child class";
    }


    @Override
    public String getName(){
        return name;
    }
}
