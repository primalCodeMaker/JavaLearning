package Second.partOne;

public class Result implements Function {



    public static void main(String[] args) {

        Function halfCalc = new HalfCalculator();
        Function quaterCalc = new QuarterCalculator();

        int res = 12;

        System.out.println(halfCalc.calculate(res));
        System.out.println(quaterCalc.calculate(res));
        System.out.println(res);



    }
}

