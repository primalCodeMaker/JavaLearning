package lambdaSingleArgument;

public class Animal implements Jumpable {

    @Override
    public boolean canJump(String s) {
        System.out.println("canJump method runs");
        return s.contains("Jump");
    }
}
