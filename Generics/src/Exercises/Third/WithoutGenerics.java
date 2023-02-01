package Exercises.Third;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {

    public static void main(String[] args) {

        List list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        WithoutGenerics wg = new WithoutGenerics();
        
    }

    public int countOddNumbers(List list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}

