package Second.partTwo;

import java.util.Arrays;

public class Result {


    public static void main(String[] args) {

        FunctionClass halfCalc = new HalfCalculator();
        FunctionClass quaterCalc = new QuarterCalculator();



        FunctionClass[] functionArr = new FunctionClass[10];

        for (int i = 0; i < functionArr.length; i++) {
            for (FunctionClass objects : functionArr) {
                if (i % 2 == 0) {
                    functionArr[i] = new HalfCalculator();
                }
                if (i % 2 !=0) {
                    functionArr[i] = new QuarterCalculator();
                }
            }
        }
        //System.out.println(Arrays.toString(functionArr));

        int number = 12642364;
        int i = 0;
        for (FunctionClass objectsInArray : functionArr) {
            number = number + functionArr[i].calculate(number);
            System.out.println(number);
            i++;

        }

    }

}

