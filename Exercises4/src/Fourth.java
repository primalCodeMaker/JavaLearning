public class Fourth {
    //Napisz program, który na podstawie podanego numeru miesiąca, wydrukuje ile w takim miesiącu
    //mamy dni. W przypadku podania złego numeru miesiąca, wydrukuje "Nie ma takiego miesiąca".
    //Użyj switch.

    public static void main(String[] args) {

        int miesiac = 2;

        switch(miesiac) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("29");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("nie ma wiecej niz 12 miesiecy");
        }



    }
}
