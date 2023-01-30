package generics.Practice.Second;

public class AnotherExampleRun extends AnotherExample{

    public static <P extends  AnotherExample> void method2(P p) {
        System.out.println(p.method1());
    }

    public static void main(String[] args) {

        AnotherExampleRun.method2(new AnotherExampleRun());
        AnotherExampleRun.method2(new AnotherExample());

        AnotherExampleRun.<AnotherExample>method2(new AnotherExampleRun());
        AnotherExampleRun.<AnotherExampleRun>method2(new AnotherExampleRun());

        // AnotherExampleRun.<String>method2(new AnotherExample());   W metodzie typ generyczny nie rozszerza Stringa
    }
}
