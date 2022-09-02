package interfaces;

public class Fish implements Swimable, Breathable {

@Override
    public void swim () {
    System.out.println("look, I am sweaming :D ");
}

    @Override
    public void breath() {
        System.out.println("I can breath! I am alive!");
    }
}
