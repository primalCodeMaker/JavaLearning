package memberInnerClass;

public class anotherMain {

    public static void main(String[] args) {
         anotherMain anotherMain = new anotherMain();
         anotherMain.call();
    }

    public void call() {
        Main main = new Main();
        Main.Inner inner1 = main.new Inner("anotherMain Hello! inner1");
        Main.Inner inner2 = main.new Inner("anotherMain Hello! inner2");

        inner1.innerCall();
        inner2.innerCall();
    }
}
