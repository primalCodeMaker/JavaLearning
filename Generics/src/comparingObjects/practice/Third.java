package comparingObjects.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Third implements  Comparable<Third>, Comparator<Third> {

    private final String someText;
    private  final Integer someNumber;

    public Third(String someText, Integer someNumber) {
        this.someText = someText;
        this.someNumber = someNumber;
    }

    @Override
    public String toString() {
        return someNumber.toString();
    }
    public int compareTo(Third element) {
        return  element.someNumber - someNumber;
    }

    public int compare(Third el1, Third el2) {
        return el1.someText.compareTo(el2.someText);
    }

    public static void main(String[] args) {
        Third element1 = new Third("Text1", 2);
        Third element2 = new Third("Text2", 3);
        Third element3 = new Third("Text3", 1);

        List<Third> list = new ArrayList<>();
        list.add(element1);
        list.add(element2);
        list.add(element3);

        Collections.sort(list);
        System.out.println(list);
    }
}

