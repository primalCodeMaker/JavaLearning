public class LoopExamples {

    public static void main(String[] args) {

        first_loop:
        for (int i = 0; i < 4; i++) {
            System.out.println("first_Loop " + i);
            if( i == 2) {
                continue;
            }
            second_loop:
            for (int j = 0; j < 4; j++) {
                System.out.println("second_loop i: " + i + " ,j: " + j);
                third_loop:
                for (int k = 0; k < 4; k++) {
                    if (k == 3) {
                        break second_loop;
                    }
                    System.out.println("third_loop i: " + i + " ,j: " + j + " ,k:" + k);
                }

            }

        }

    }
}
