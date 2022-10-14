package Try_Catch_Finally;

public class Finally {

    public static void main(String[] args) {
        try {
            print1();
        } catch (MyException1 e) {
            System.out.println("MyException1 Catched");
            throw new MyException2("Throwing MyException2");
        }finally {
            System.out.println("Finally allways run even Exception catched");
        }
        System.out.println("End of the program after try/catch/finally ENDED"); //to sie nie drukuje
    }

    public static void print1() throws MyException1 {
        System.out.println("print1 method");
        throw new MyException1("thoring MyException1");
    }
    public static void print2() {
        System.out.println("print2 method");
        throw new MyException2("thoring MyException2");
        }
    }
