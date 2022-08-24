public class Seventh {

//    Napisz program drukujący na ekranie ciąg Fibonacciego. Wydrukuj pierwsze 20 znaków ciągu. Znaki
//    ciągu możesz oddzielić spacją.
//   ciąg liczb naturalnych określony w następujący sposób: Pierwszy wyraz jest równy 0,
//   drugi jest równy 1, każdy kolejny jest sumą dwóch poprzednich.
//   Ciąg Fibonacciego: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89


    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        int i = 0;
        while (i < 20) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;

        }


//        while (a < 7) {
//            a++;
//            c = a + b;
//            System.out.println(c + "");
//            a = b;
//            b = c;
//        }


        }
    }

