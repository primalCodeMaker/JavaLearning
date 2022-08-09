package Methods;

public class Replace {
    // TODO Replace - ZAMIENIA CZESC ZNAKOW NA INNY CIAG
    public static void main(String[] args) {


        String s1 = "aaaaaaaaAAAAAAAAAA";
        String s2 = "aaaaaaaaaAAAAAAAAA";
        System.out.println("replace: " + s1.replace("AAAAAAAAAA"," ***** ***" ));

        String s3 ="AAA aaa ABAA ABCC AA CC AAA";
        System.out.println("repLace: " + s3.replace("AAA", "zz"));

        System.out.println("repLace: " + s3.replaceFirst("AAA", "zz"));


    }



}
