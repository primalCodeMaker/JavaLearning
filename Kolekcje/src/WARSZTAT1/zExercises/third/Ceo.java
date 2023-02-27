package WARSZTAT1.zExercises.third;

import java.util.Deque;

import static WARSZTAT1.zExercises.third.Run.*;

public class Ceo implements User {


    @Override
    public void takeAction(Deque stack) {
        stack.push(createInvoice(stack));

        System.out.println("invoice added: " + stack.peek());
    }

}
