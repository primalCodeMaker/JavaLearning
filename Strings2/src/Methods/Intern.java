package Methods;

public class Intern {

    public static void main(String[] args){

        String s1 = new String("string");
        String s2 = "string";

        System.out.println("s1 == s2: "+ (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        String s3 = s1.intern();
        String s4 = s2.intern();

        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));

        System.out.println("s1 == s2: "+ (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        String s5 = s1 + s2;
        String s6 = "stringstring";

        System.out.println("s5 == s6: "+ (s5.intern() == s6));
        System.out.println("s5.equals(s6): " + s5.equals(s6));

//TODO Metoda Intern dodaje zmienną do String Puli, jeśli została zdeklarowana jako new string, lub została stworzona z połączenia kilku innych Stringów i jest w innym miejscu w pamięci
        // dzięki temu możemy zaoszczędzić miejsce w pamięci


    }

}
