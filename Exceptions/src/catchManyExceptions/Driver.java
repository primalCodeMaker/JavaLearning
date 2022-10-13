package catchManyExceptions;

public class Driver {
    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) throws DrivingException {
        if (age < 18) {
            throw new DrivingException("You cannot Drive below 18'yo");
        }
        else if (age > 150) {
            throw new SecondException("there is no man in this world who lived so long");
        }
        System.out.println("Regards! You can Drive a car");
        this.age = age;
    }


}
