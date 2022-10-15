package second;

public class Run {

    private int age;

    public static void main(String[] args) {
            new Run().wraper();
        System.out.println("program ending after all Eaxceptions catched");
    }

    public void setAge(int age) throws lessThan21 {
        this.age = age;
    if (age > 21) {
        System.out.println("more than 21");
    } else {
        throw new lessThan21("new Exception throwed in setAge method");
    }
    }

    public void wraper() {
        try { setAge(20);
        } catch (lessThan21 e) {
            System.out.println(e.getMessage());
            System.out.println("lessthan21 catched!");
            throw new RuntimeException();
        }
    }

}
