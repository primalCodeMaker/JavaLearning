package Methods;

public class Contains {


    public Contains(String javka) {
    }


    public static void main(String[] args) {

        String s1 = "MICHALRobiKursZaJavka.pl";
        String s2 = "MichalRobiKursZaJavka.pl";

        char[] JAVA = {'J', 'a', 'V', 'a'};
        String s3 = new String(JAVA);


        String s4 = "java";
        String s5 = s4.toUpperCase().substring(0, 1);
        String s6 = s4.toLowerCase().substring(1, 4);
        String s7 = s5 + s6;

        System.out.println("does java = Java?: " + s7.contains("Java"));

        System.out.println("toUpperCase: " + s4.toUpperCase().contains("JAVA"));

        //System.out.println ("SubstringUpperCase: " + s4.substring(0,1).toUpperCase().contains("Java"));
        // System.out.println ("SubstringUpperCase: " + s4.toUpperCase().substring(0,1).contains("J") + s4.substring(1,4).contains("ava"));

        String s8 = "jaVA";
        System.out.println("SubstringUpper+lowerCase: " + (s8.substring(0, 1).toUpperCase() + (s8.substring(1, 4)).toLowerCase()).contains("Java"));

        System.out.println("contains Mi: " + s1.contains("Mi"));
        System.out.println("contains MI: " + s1.contains("MI"));


    }
}
