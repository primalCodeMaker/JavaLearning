public class Main {

    public static void main(String[] args) {


        String name = "Hej Javowcy!";
        String b = "Cześć Javowcy!";


        String a = name.replace("Hej", "Cześć"); // TODO zrobienia stringa A porpzez replace innego stringa rowniez zapisuje go w innym miejscu w pamieci

        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a.equals(b));





//        String txt1 = new String("string").intern();
//        String txt2 = "  string  ".trim().intern();
//        String txt3 = txt1;
//
//// false, bo zapisane w innym miejscu pamięci
//        System.out.println(txt1 == txt2);
//// true, bo wymusiliśmy zapisanie w pool,
//// więc prowadzi do tego samego miejsca w pamięci, w którym znajduje się już txt2
//        System.out.println(txt2 == txt3);
//
//        System.out.println(txt1 == txt3);
    }

}