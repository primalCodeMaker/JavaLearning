package org.example1;


public class CalculateNonStatic {



    public int paramAdd(int left, int right) {
        return left + right;

    }
    public int add(int left, int right) {
        return left + right;
    }

    public int subrtact(int left, int right) {
        return left - right;
    }

    public int multiply(int left, int right) {
        return left * right;
    }

    public int divide(String left, String right) {
        return Integer.parseInt(left) / Integer.parseInt(right);
    }

}