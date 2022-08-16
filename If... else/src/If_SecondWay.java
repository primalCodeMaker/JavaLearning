public class If_SecondWay {

    //bez uzycia { } - nie zalecane

    public static void main(String[] args) {
        int a = 1;
        if (a > 10)
            someMethod1();
            someMethod2();
            // bez klamer nie powinna sie drukowac zadna z metod, a w tym przypadku gdy warunek nie zostal spelniony program drukuje metode2
    }

    private static void someMethod1() {
        System.out.println("someMethod1");
    }

        private static void someMethod2() {
        System.out.println("someMethod2");
    }
}
