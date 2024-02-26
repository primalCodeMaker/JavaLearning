package recordExample;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Edek", "Szalony", 19L);
        Person person2 = new Person("Edek", "Szalony", 17L);
        Person person3 = new Person("NewNameMan");

        System.out.println(person1.equals(person2));
        System.out.println(person1.isAdult());
        System.out.println("Person3 -> " + person3);

    }
}