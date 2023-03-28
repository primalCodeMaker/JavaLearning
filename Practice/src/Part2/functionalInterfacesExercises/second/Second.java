package Part2.functionalInterfacesExercises.second;

public class Second {

    public static void main(String[] args) {

        MyInterface<String, Integer, Boat> firstImplementation = (s, i, o) -> {
            System.out.println("s.length = " + s.length());
            System.out.println("i.length = " + i);
            System.out.println("o.length = " + o.toString().length());
            return s.length() + i + o.toString().length();
        };
        Integer test1 = firstImplementation.veryStrangeMethod("test", 23, new Boat());
        System.out.println(test1);

        System.out.println("----------------- Second example -------------");


        MyInterface<String, Integer, Boat> secondImplementation = Second::secondImplementationMethod;

        Integer secondImplementationINT = secondImplementation.veryStrangeMethod("anakonda", 20, new Boat());
        System.out.println(secondImplementationINT);

    }

    private static Integer secondImplementationMethod(String s, Integer i, Boat o) {
        int counter = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a') {
                counter++;
            }
        }
        System.out.println("amount a in String = " + counter);

        int counter2 = 0;
        for (int k = 0; k < o.toString().length(); k++) {
            if (o.toString().charAt(k) == '\'' || o.toString().charAt(k) == '=') {
                counter2++;
            }
        }
        System.out.println(o);
        System.out.println("amount ' and = in Object.toString() = " + counter2);

        return counter + i + counter2;
    }


    private static class Boat {

        private String model = "Yaht";


        @Override
        public String toString() {
            return "Boat{" +
                    "model=''='" + model + '\'' +
                    '}';
        }
    }
}




