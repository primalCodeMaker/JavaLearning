public class Third {

    public static void main(String[] args) {

        String sentence = "MichalIsLearningJavaEveryday";
        String a = "a";
        String o = "o";
        String e = "e";
        String i = "i";
        String u = "u";
        String y = "y";

        char[] vowel = {'a','o','e','i','u','y'};

        double value = 0.1;

        //String StringValueOff = sentence.replace(a, String.valueOf(value)).replace(o, String.valueOf(value));


        String StringValueOff = sentence.replace(a, (value));
        System.out.println(StringValueOff);





    }
}
