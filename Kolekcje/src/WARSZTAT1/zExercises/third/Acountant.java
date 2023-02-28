package WARSZTAT1.zExercises.third;

import java.util.Deque;

public class Acountant implements User {

    private final String name;

    public Acountant(String name) {
        this.name = name;
    }

    @Override
    public void takeAction(Deque stack, User acountant) {
        System.out.println(acountant + " settled invoice: " + stack.peek());
        stack.pop();
    }

    @Override
    public String toString() {
        return "Acountant " + name;
    }
}
