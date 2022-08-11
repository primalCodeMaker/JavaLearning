public class Third_Method {

    public static void main(String[] args) {


        String sentence = "MichalIsLearningJavaEverydayAAY";
        String output = replaceMethod(sentence);
        System.out.println(output);

    }

    public static String replaceMethod(String text) {

        String a = "a";
        String e = "e";
        String o = "o";
        String i = "i";
        String u = "u";
        String y = "y";

        double value = 7.4;
        String x = String.valueOf(value);

        String z = text.toLowerCase().replace(a,x).replace(o,x).replace(e,x).replace(i,x).replace(u,x).replace(y,x);
        return z;

    }
}
