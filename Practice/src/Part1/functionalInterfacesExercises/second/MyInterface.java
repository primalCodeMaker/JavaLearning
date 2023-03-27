package Part1.functionalInterfacesExercises.second;

@FunctionalInterface
public interface MyInterface <S, I, O> {

     I veryStrangeMethod(S s, I i, O o);
}
