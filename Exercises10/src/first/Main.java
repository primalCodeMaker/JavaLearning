package first;

public class Main {
    private int number;

    public static void main(String[] args) {
        try {
            new WrogNumberException("wrong mumber Wxception object").error();
        } catch (WrogNumberException e) {
            System.out.println("catched");
            System.out.println("somethink else");
            try {
                throw new WrogNumberException(e.getMessage());
            } catch (WrogNumberException ex) {
                System.out.println(e.getStackTrace());
                System.out.println("I got You babe");
            }
        }
        System.out.println("message printed after error appear");


    }

    public int getNumber() {
        return number;
    }
}
