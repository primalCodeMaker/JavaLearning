public class Fourth {

    // Rafał ma 6 kolorowych mazaków (czerwony, zielony, niebieski, czarny, żółty i brązowy) i rysuje nimi
    //w podanej kolejności kolorów 100 kresek. Jaki kolor będzie miała ostatnia kreska? Napisz program,
    //który to policzy.

    public static void main(String[] args) {
//        int czerwony = 1;
//        int zielony = 2;
//        int niebieski = 3;
//        int czarny = 4;
//        int zolty = 5;
//        int brazowy = 6;

        int lastLine = (int) ((double) (100) % 6);
        System.out.println(lastLine);

        if (lastLine == 1) {
            System.out.println("Czerwony");
        } else if (lastLine == 2) {
            System.out.println("Zielony");
        } else if (lastLine == 3) {
            System.out.println("Niebieski");
        } else if (lastLine == 4) {
            System.out.println("Czarny");
        } else if (lastLine == 5) {
            System.out.println("Zolty");
        } else if (lastLine == 6) {
            System.out.println("Brazowy");

        }
    }
}
