package third;

public class Run {

    public static void main(String[] args) {
        AParent person1 = new Child("Bogdan");
        Child person2 = new Child("Anielka");

        System.out.println(person1.getName());
        System.out.println(person1.getClassName());

        System.out.println(person2.getName());
        System.out.println(person2.getClassName());

    }
}
