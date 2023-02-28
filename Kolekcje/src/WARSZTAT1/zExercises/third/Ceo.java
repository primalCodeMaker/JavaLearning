package WARSZTAT1.zExercises.third;

import java.util.Deque;

import static WARSZTAT1.zExercises.third.Invoice.createInvoice;

public class Ceo implements User {

    private final String name;


    public Ceo(String name) {
        this.name = name;
    }

    @Override
    public void takeAction(Deque stack, User ceo) {
        stack.push(createInvoice(stack));
        System.out.println(ceo + " added invoice: " + stack.peek());
    }

    @Override
    public String toString() {
        return "Ceo " + name;
    }
}
