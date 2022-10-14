package initBlocks.Default;


public class Person {
    private int age;

    {
        this.age = 12;
        if (age == 13) {
            throw new WrongAgeException("Exception into init block");
        } else {
            System.out.println("valid user Age");
        }
    }


    public Person(int age) throws WrongAgeException {
        System.out.println("Person constructor Start");
        if (age > 0 && age < 120) {
            this.age = age;
            System.out.println("Person constructor Fine!");
        } else {
                System.out.println("Throwing WrongAgeException");
                throw new WrongAgeException("wrong parameters");
            }
            System.out.println("Person constructor END");
        }
    }

