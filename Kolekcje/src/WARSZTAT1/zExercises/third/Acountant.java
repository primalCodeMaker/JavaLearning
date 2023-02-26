package WARSZTAT1.zExercises.third;

import java.util.Deque;

public class Acountant implements User {


    @Override
    public void takeAction(Deque stack) {
        System.out.println("invoice settled: " + stack.peek());
        stack.pop();
    }

}
