package Methods;

public class ObjectMethod {

    public static void main(String[] args) {
        ObjectMethod firstObject = new ObjectMethod();


       String a = firstObject.ObiectMethod(1);
        System.out.print(a);

       String b = firstObject.ObiectMethod(2);
        System.out.print(b);

       String c = firstObject.ObiectMethod(3);
        System.out.print(c);

       String d = firstObject.ObiectMethod(4);
        System.out.print(d);

    }
    String ObiectMethod (int p) {
        System.out.print(" Print ME! ");
        System.out.println(p);
        return "String Test +";
    }


}
