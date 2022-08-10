public class Second {

    public static void main(String[] args) {

        String a = "Michal";
        String b = "IsLearning";
        String c = "Java";
        String d = "Everyday";
        String e = "AndItsCOOL!";

        String Result = a+b+c+d+e;
        System.out.println("String concat 1: " + Result);

        System.out.println("String concat 2: " + a + " " + b + " " + c + " " + d + " " + e);

        System.out.println("String concat 3: " + a.concat(b).concat(c).concat(d).concat(e));

        System.out.printf("String concat 4 %s %s %s %s %s",a,b,c,d,e);




    }
}
