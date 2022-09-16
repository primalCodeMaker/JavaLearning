package Second.partOne;

public class QuarterCalculator implements Function {


    @Override
    public int calculate(int a) {
        return Function.super.calculate(a/4);
    }
}
