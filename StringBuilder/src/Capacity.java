public class Capacity {

    public static void main(String[] args) {

        StringBuilder capaTest = new StringBuilder();
        System.out.println(capaTest.capacity());

        for (int i = 0; i < 150; i++) {
            capaTest.append("add1");
            System.out.println(capaTest.capacity());
        }
    }
}
