public class Fifth {

    //Napisz switch, który policzy dla podanego numeru miesiąca, ile dni minęło od początku roku, do
    //końcowego dnia podanego miesiąca. Załóż, że luty ma 28 dni.


    public static void main(String[] args) {
        int month = 12;
        int days = 0;

        switch (month) {
            case 12:
                days += 31;
            case 11:
                days += 30;
            case 10:
                days += 31;
            case 9:
                days += 30;
            case 8:
                days += 31;
            case 7:
                days += 31;
            case 6:
                days += 30;
            case 5:
                days += 31;
            case 4:
                days += 30;
            case 3:
                days += 31;
            case 2:
                days += 28;
            case 1:
                days += 31;
                break;
            default:
                System.out.println("jest tylko 12 miesiecy");

        }
        System.out.println("W miesiacu " + month + " minelo dni: " + days);

    }
}
