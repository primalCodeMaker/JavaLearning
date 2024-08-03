package org.designPatterns.structural.adapter.composite;

public class Main {

    public static void main(String[] args) {

        Composite composite = new Composite("Composite");
        Composite secondComposite = new Composite("secondComposite");

        composite.add(new Leaf("Leaf1"));
        composite.add(new Leaf2("Leaf2"));

        secondComposite.add(new Leaf("Leaf3"));

        composite.add(secondComposite);
        composite.operation();
    }
}
