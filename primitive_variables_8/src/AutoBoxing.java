public class AutoBoxing {


    public static void main(String[] args) {

        // prymitywy mozna zamieniac na klasy o ile sa tego samego typu. byte mozna przerobic na Byte, ale nie mozna go przerobic na Integera
        // w 2 strone mozna wyciagac wartosci z klas do prymitywow innego typu o ile sie zmieszcza. Integera moge wyciagnac do shorta.
        // klasy moga zwracac nulle

        byte b = 2;
        short s = 23;
        int i = 66;
        long l = 78;
        char c = 'J';

        Byte bB = b;
        Short sS = s;
        Integer iI = i;
        Long lL = l;
        Character cC = c;

        Integer bI = null;
        int cI = bB;
        System.out.println(cI);


        System.out.println(sS + iI);
        System.out.println(iI += sS);  // iI = iI + sS czyli ten operator nadpisuje mi wartosc iI

        System.out.println("iI " + iI);
        System.out.println("sS " + sS);

//        int res = iI += sS;
//        System.out.println(res);


        // mechanizm to zmiany stringa na wartosc liczbowa
        String string = "15";
        int number = Integer.parseInt(string);
        System.out.println(number);



        // testowanie przesuniecia bitowego
//        int res = c;
//        System.out.println(res << 1);
//        System.out.println(c);


    }
}
