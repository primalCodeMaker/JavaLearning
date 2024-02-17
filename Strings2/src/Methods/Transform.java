package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transform {

    /*
    metoda Transform dodana w Javie12 pozwala na zmiane stringa w inny typ generyczny.
    W streamie mozemy zwracac ze Stringa tablice / listy / Integery i wszystko co wymyslimy
     */

    public static void main(String[] args) {

        String toTransform = "Hello World, this method was added in java 12";
        List list = new ArrayList<>();

        Integer transformFormStringToInteger = toTransform.transform(
                elem -> elem.length()
        );

        System.out.println("ilosc znakow: " + transformFormStringToInteger);

        String[] transfotmToTable = toTransform.transform(
                elem -> elem.split(" ")
        );

        System.out.println("Table: " + Arrays.toString(transfotmToTable));

        List<String> transformToList = toTransform.transform(
                elem -> Arrays.stream(elem.split(" "))
                        .map(pzecinek -> pzecinek.replace(",", ""))
                        .toList()
        );
        System.out.println("list: " + transformToList);

    }
}
