package WARSZTAT1.zExercises.third;

import java.util.Deque;

public interface User {

    void takeAction(Deque stack);

   default String sayHello() {
       return "Hello";
   }
}
