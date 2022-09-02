package interfaces;

public interface Swimable {

    public abstract void swim();

    default void move (){
        System.out.println("you move while swimming");
    }

    default String sthelse(){
        return "sth else" + anything();
    }

    private String anything() {
        return "anything from private method";
    }

}
