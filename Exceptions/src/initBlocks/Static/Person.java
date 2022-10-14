package initBlocks.Static;
//to jest napisany przyklad dla bledow typu Catch
// gdyby wyjatek WrongAgeException w klasie WrongAgeException bylby zdefiniowany jako Runtime,
// to podczas kompilacji wyskoczyl by Error i wywalilo by program

public class Person {
    private static int age;

    static {
        age = 12;
        System.out.println("static block start");
        if (age == 12) {
            try {
                throw new WrongAgeException("Exception into static block");
            } catch (WrongAgeException e) {
                e.printStackTrace();
                System.out.println("Exception catched");
            }
        } else {
            System.out.println("valid user Age");
        }
        System.out.println("block Ended");
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

