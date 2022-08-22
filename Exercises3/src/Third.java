public class Third {

    // Napisz program, w którym zaczynając od zmiennej byte x = 0, będzie można otrzymać int, long,
    //float oraz double stosując promocję numeryczną.

    public static void main(String[] args) {

        byte x = 18;
        byte y = 1;
        // po dodaniu 2 byt'ow samo zmienia na inta
        int i = x + y;
        int i2 = 3;
        int i3 = i + i2;
        // int + int = int


        long l = 1000000L;
        long l2 = l + i3;
        // int + long = long

        float f = 1.234f;
        float f2 = 0.776f;
        float f3 = f * f2 * 100;  // float + float * nie zdeklarowana liczba = OK
        System.out.println(f3);
        f3 = f3 + i3;
        System.out.println(f3);
        i3 *= f3;
        System.out.println(i3);
        // int * float = int
        float f9 = (i3 - f3);
        System.out.println(f9);

        short a = 1;
        float b = 3.333f;
        float c = a + b;
        // short + float = float

        double d = 3434.6464636346476823423432;
        double e = b * d;
        // float + double = double
        System.out.println(e);


    }
}
