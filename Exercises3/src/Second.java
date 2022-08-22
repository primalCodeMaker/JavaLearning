public class Second {
    // Napisz program w którym użyjesz operatorów ==, !, !=, ++, -=, *=. Na początku masz zadeklarowaną
    //zmienną int x = 0. Podczas pisania programu nie możesz zadeklarować żadnej innej zmiennej, tzn.
    //przez cały czas pisania programu możesz operować tylko na tej jednej zmiennej.

    public static void main(String[] args) {
        Second second = new Second();
        second.equals();

        int x = 0;
        System.out.println(!(x == x + 1));
        System.out.println(x != x + 1);
        x = x++ + ++x;
        System.out.println(x);
        x -= 1;  // x = x -1
        System.out.println(x);
        System.out.println(x *= 5);   // x = x * 5


    }
        private void equals () {
            int x = 0;

            if (x == 10) {
                System.out.println("1st step");
            } else {
                System.out.println("2nd step");
            }

        }



}