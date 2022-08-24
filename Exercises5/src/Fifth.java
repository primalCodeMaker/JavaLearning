public class Fifth {

//    Napisz program, który wydrukuje wszystkie liczby pierwsze
//    od 2 do 1000
// Liczba pierwsza - to taka liczba naturalna, która ma dokładnie dwa dzielniki naturalne:
// jedynkę i samą siebie.
//todo kiedys to dokoncze teraz nie ma juz czasu

    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {

            for (int j = 2; j < 10; j++) {
                if (i % j == 0 ) {
                    continue;

                } else {
                    System.out.println(i);;
                }

            }


            }

        }


    }
