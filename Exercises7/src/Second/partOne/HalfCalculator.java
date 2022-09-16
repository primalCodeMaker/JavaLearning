package Second.partOne;

public class HalfCalculator implements Function{

    @Override
    public int calculate(int a) {
        return Function.super.calculate(a/2);
    }


}
