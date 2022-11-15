package twoArguments;

public class Start {
    public static void main(String[] args) {

        Jumpable lambdaExample = (string, print) -> {
            System.out.println("Lambda Example Runs");
            if (print) {
                System.out.println("print = true");
            }
            return string.contains("Jump");
        };

        System.out.println("Lambda true: " + lambdaExample.canJump("Jumpin", true));
        System.out.println();
        System.out.println("Lambda false: " + lambdaExample.canJump("jumpin", false));
    }

}
