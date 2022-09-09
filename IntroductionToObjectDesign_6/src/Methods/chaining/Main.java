package Methods.chaining;

public class Main {

    public static void main(String[] args) {


        String sentence = "MethodChaining";
        String aSentenc = sentence
                .replace("et", "zy")
                .replace("ing", "bla")
                .replace("dC", "DC");


        System.out.println(aSentenc);

        // cat na domyslnym konstruktorze z polaczonomi metodami
        Cat cat1 = new Cat().withFirst("FirstMethod").withSecond("SecondMethod").withFifth("lastMethod");
        System.out.println(cat1);






    }

}