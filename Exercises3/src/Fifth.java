public class Fifth {

    //. Napisz metodę, która jako argument przyjmuje liczbę i wydrukuje informację czy liczba jest
    //podzielna przed 3, przez 7 oraz przez 3 i 7 jednocześnie.

    public static void main(String[] args) {

        int i = 30;
        //boolean x = i % 3 == 0;

        if (i % 3 == 0) {
            System.out.println("i / 3 = integer");
        } else{
            System.out.println("i / 3  !integer");}

        if (i % 7 == 0) {
            System.out.println("i / 7 = integer");
        } else{
            System.out.println("i / 7  !integer");}


        if (i % 3 == 0 && i % 7 == 0) {
            System.out.println("i / 3 && i / 3 = integer");
        } else {
            System.out.println("i / 3 && i / 3  !integer");
        }

    }
}
