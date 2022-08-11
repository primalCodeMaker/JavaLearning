public class Third {

    public static void main(String[] args) {

        String sentence = "MichalIsLearningJavaEverydayAAY";
        String a = "a";
        String o = "o";
        String e = "e";
        String i = "i";
        String u = "u";
        String y = "y";

        char[] vowel = {'a','o','e','i','u','y'};

        // TODO Double.parseDouble potrafi ze stringa zrobic doubla i wykonywac na nim dzialania
//        String value = "1.1";
//        double novalue = Double.parseDouble(value);

        double value = 7.4;
        String x = String.valueOf(value);

        String xx = sentence.toLowerCase().replace(a,x).replace(o,x).replace(e,x).replace(i,x).replace(u,x).replace(y,x);
        System.out.println(xx);






    }
}
