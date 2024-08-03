package org.designPatterns.structural.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProxyImage implements Image {

    private final String filename;
    private RealImage realImage;

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

