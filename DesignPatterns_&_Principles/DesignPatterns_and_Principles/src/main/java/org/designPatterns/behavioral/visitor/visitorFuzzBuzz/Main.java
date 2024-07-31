package org.designPatterns.behavioral.visitor.visitorFuzzBuzz;

public class Main {

    public static void main(String[] args) {

        MyList myList = new MyList();
        myList.addToList();

        Visitor myKeyMap = new MyKeyMap();

        myList.accept(myKeyMap);

    }
}


