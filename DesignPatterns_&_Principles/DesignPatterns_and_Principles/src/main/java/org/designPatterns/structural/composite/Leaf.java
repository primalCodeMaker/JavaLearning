package org.designPatterns.structural.composite;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Leaf implements Component {

    private final String name;

    public void operation() {
        System.out.printf("Operation performed on a leaf: %s%n", name);
    }
}
