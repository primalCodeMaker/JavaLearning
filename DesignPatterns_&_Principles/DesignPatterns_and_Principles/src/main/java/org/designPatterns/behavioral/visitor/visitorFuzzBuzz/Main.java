package org.designPatterns.behavioral.visitor.visitorFuzzBuzz;

public class Main {

    public static void main(String[] args) {

        VolumeSetter myList = new MyList();
        myList.addToList(100000);

        Visitor myKeyMap = new MyKeyMap();

        myList.accept(myKeyMap);

    }
}


