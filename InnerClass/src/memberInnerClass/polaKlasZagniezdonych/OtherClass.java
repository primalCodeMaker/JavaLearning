package memberInnerClass.polaKlasZagniezdonych;

public class OtherClass {

    public static void main(String[] args) {
         OtherClass OtherClass = new OtherClass();
         OtherClass.call();
    }

    public void call() {
        NotMain notMain = new NotMain();
        NotMain.Inner inner = notMain.new Inner();
        NotMain.Inner.InnerInner innerInner = inner.new InnerInner();
        NotMain.Inner.InnerInner.InnerInnerInner innerInnerInner = innerInner.new InnerInnerInner();

        innerInnerInner.printAllA();
    }
}
