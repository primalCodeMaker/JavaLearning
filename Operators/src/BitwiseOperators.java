public class BitwiseOperators {
    public static void main(String[] args) {

        byte a = 12;
        byte b = 16;

        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~b: " + ~b);   // negacja bitowa

        System.out.println("------------------");

        // przesuniecie bitowe
        byte c = -109;
        System.out.println("c << 3: " + ((byte)(c << 3)));                 //signed left shift
        System.out.println("c >> 3: " + ((byte)(c >> 3)));                //signed right shift
        System.out.println("c >>> 3: " + ((byte)(c >>> 3)));             //unsigned right shift
    }

}
