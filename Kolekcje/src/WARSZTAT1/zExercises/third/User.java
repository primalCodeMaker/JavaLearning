package WARSZTAT1.zExercises.third;

public interface User {

    void takeAction();

   default String sayHello() {
       return "Hello";
   }
}
