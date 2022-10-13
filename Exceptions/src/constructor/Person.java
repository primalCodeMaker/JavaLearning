package constructor;

public class Person {
    private int age;



    public Person(int age) throws WrongAgeException {
        if (age > 0 && age < 120) {
            this.age = age;
        }else {
            try {
                throw new WrongAgeException("wrong parameters");
            } catch (WrongAgeException e) {
                e.printStackTrace();
            }
        }
    }
}
