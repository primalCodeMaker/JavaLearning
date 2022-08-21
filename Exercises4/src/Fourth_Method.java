public class Fourth_Method {

    //Napisz program, który na podstawie podanego numeru miesiąca, wydrukuje ile w takim miesiącu
    //mamy dni. W przypadku podania złego numeru miesiąca, wydrukuje "Nie ma takiego miesiąca".
    //Użyj switch.


    public static void main(String[] args) {
        System.out.println("w miesiacu jest " +dayInMounth(13) + " dni");

    }

    private static int dayInMounth(int a) {
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                System.out.println("nie ma takiego miesiaca");
                return 0;
        }

    }

}
