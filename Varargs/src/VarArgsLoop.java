import java.util.Arrays;

public class VarArgsLoop {

    public static void main(String... args) {
        VarArgsLoop varAgs2 = new VarArgsLoop();
        varAgs2.example3(1, 5, 3, 9);

    }

    private void example3(int... args) {
        //String conc = "";
        int plus1 = 0;
        for (int arg : args) {
           // conc = conc + arg + ",";

            //fixme nie wiem co tu sie dzieje i nie mam teraz na to czasu -_-'
           // plus1 = plus1 + 1 + arg;
            System.out.print(plus1 + 1 + arg);

        }
        System.out.println(plus1);

        int[] hereWeAreMakingArrayWithOurArgumentsFromMethod = args;
        System.out.println("hereWeAreMakingArrayWithOurArgumentsFromMethod: " + Arrays.toString(hereWeAreMakingArrayWithOurArgumentsFromMethod));

    }
}
