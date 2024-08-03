package org.designPatterns.structural.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Decorator implements Component {

    private final Component component;

    @Override
    public void operation() {
        component.operation();
    }
}
