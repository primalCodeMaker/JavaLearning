package exceptions.RuntimeExceptions;

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
        System.out.println("Regards! You can Drive a car");
        this.age = age;
    }


}
