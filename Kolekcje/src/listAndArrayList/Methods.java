package listAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        ArrayList<String> citiesList = new ArrayList<>();
        citiesList.add("Wroclaw");
        citiesList.add("Szczecin");
        citiesList.add("Gdynia");
        citiesList.add("Mielno");
        System.out.println(citiesList);
        citiesList.add(1, "added any City on second position"); // dodanie na danej pozycji

        System.out.println(citiesList);

        citiesList.remove(1);
        System.out.println(citiesList);

        System.out.println(citiesList.get(0));
        System.out.println(citiesList.get(1));
        System.out.println(citiesList.get(2));
        System.out.println(citiesList.get(3));

        System.out.println(citiesList.size());
        System.out.println(citiesList.isEmpty());

        System.out.println(citiesList.contains("Szczecin"));
        System.out.println(citiesList.contains("szczecin"));

        System.out.println(citiesList.indexOf("Wroclaw"));  // drukuje na ktorym indexie jest wartosc.
                                                            // wybiera zawsze pierwsze wystapienie. Mozna uzyc .lastIndexOf() i wtedy poda pozycje ostatniej szukanej wartosci

        Object[] array = citiesList.toArray(new String[0]); // Defaultowo robi tablice obiektow. Jesli chcemy wymusic typ to podajemy to w taki sposob. Nowa tablica stringow ma wielkosc 0,
        System.out.println(Arrays.toString(array));         // ale algorytm sam to sobie potem ogarnia. Chodzi tylko o zdeklarowanie typu


        citiesList.remove("Szczecin");
        System.out.println(citiesList);
        citiesList.remove(2);
        System.out.println(citiesList);


        citiesList.clear();
        System.out.println(citiesList);


    }
}
