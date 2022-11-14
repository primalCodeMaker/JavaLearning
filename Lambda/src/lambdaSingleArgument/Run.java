package lambdaSingleArgument;

public class Run {

    public static void main(String[] args) {
        Jumpable animal = new Animal();
        System.out.println(animal.canJump("Jumping Jack Flash"));

        Jumpable jumpableLambda = initParam -> initParam.contains("Jump");
        System.out.println(jumpableLambda.canJump("nojump"));

        //todo 20min

    }
}
