package Methods;

public class Replace {

    public static void main(String[] args) {


        String s1 = "aaaaaaaaAAAAAAAAAA";
        String s2 = "aaaaaaaaaAAAAAAAAA";
        System.out.println("replace: " + s1.replace("AAAAAAAAAA"," ***** ***" ));

        String s3 ="AAA aaa ABAA ABCC AA CC AAA";
        System.out.println("rep;ace: " + s3.replace("AAA", "zz"));

        System.out.println("rep;ace: " + s3.replaceFirst("AAA", "zz"));



    }



}
