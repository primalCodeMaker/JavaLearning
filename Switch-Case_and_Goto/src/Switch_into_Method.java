public class Switch_into_Method {
    public static void main(String[] args) {
        System.out.println("switch-case: " + someSwitch(1, 166));
    }

    private static int someSwitch(int a, int b) {
        switch (a+b) {
            case 12:
            case 2:
            case 3:
            case 4:
                System.out.println("case 1");
                return 1; //w przypadku switcha uzytego w metodzie uzywamy return jako argument wyjscia
            case 5:
                System.out.println("case 2");
                return 2;
            case 15:
                System.out.println("case 3");
                return 3;
            default:
                System.out.println("default");
                return 4;

        }

    }

}
