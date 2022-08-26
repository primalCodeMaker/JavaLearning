package OjectBasics;

public class Test {

    public String basic = "primal";


public void podmiana() {

}

    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 =  test1;
        Test test3 = new Test();

        System.out.println("test1: " + test1.basic);
        System.out.println("test2: " + test2.basic);
        System.out.println("test3: " + test3.basic);

        test1.basic = "upgradedToCybernetic";
        test3.basic = test2.basic;
        test2.basic = "Newest";

        System.out.println("test1: " + test1.basic);
        System.out.println("test2: " + test2.basic);
        System.out.println("test3: " + test3.basic);

    }

}
