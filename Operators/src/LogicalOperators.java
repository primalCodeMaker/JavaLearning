public class LogicalOperators {


    public static void main(String[] args) {
        LogicalOperators logicalOperators = new LogicalOperators();
            logicalOperators.alternatywa();

    }
    private void negacja() {
        boolean a = true;
        System.out.println(!a);
    }

    private void koniunkcja() {
        boolean a = true;
        boolean b = true;

        boolean result = a && b;
        System.out.println(result);
    }

    private void alternatywa() {
        boolean a = true;
        boolean b = false;
        System.out.println("false || false: " + (false || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("true || true: " + (true || true));
    }

    private void rownowaznosc() {
        boolean a = true;
        boolean b = false;
        System.out.println("false == false: " + (false == false));
        System.out.println("false == true: " + (false == true));
        System.out.println("true == false: " + (true == false));
        System.out.println("true == true: " + (true == true));
    }

    private void alternatywaRozlaczna() {
        boolean a = true;
        boolean b = false;
        System.out.println("false != false: " + (false != false));
        System.out.println("false != true: " + (false != true));
        System.out.println("true != false: " + (true != false));
        System.out.println("true != true: " + (true != true));
        System.out.println("--------------------------");
        System.out.println("false ^ false: " + (false ^ false));
        System.out.println("false ^ true: " + (false ^ true));
        System.out.println("true ^ false: " + (true ^ false));
        System.out.println("true ^ true: " + (true ^ true));
    }


}
