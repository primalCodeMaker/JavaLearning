public class First {

    // Napisz program liczący silnię.
    //4! = 1*2*3*4 = 24


    public static void main(String[] args) {

        int silnia = 4;

        int i = 1;
        int j = 1;

        while(i < silnia) {
            i++;
            j = j*i;


        }

        System.out.println(j);


    }

}

