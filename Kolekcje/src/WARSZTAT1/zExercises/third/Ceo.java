package WARSZTAT1.zExercises.third;

import java.util.Deque;

import static WARSZTAT1.zExercises.third.Run.getNumber;
import static WARSZTAT1.zExercises.third.Run.getRandomPrice;

public class Ceo implements User {


    @Override
    public void takeAction(Deque stack) {
        int i = stack.size();

        Invoice newInvoice = new Invoice(i + 1 + " " + getNumber() + " ", getRandomPrice());
        stack.push(newInvoice);
        System.out.println("invoice added: " + stack.peek());
    }

}
