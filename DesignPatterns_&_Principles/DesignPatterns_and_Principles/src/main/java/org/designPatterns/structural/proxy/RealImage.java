package org.designPatterns.structural.proxy;

public class RealImage implements Image {

    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.printf("Displaying image: %s%n", filename);
    }

    private void loadFromDisk() {
        System.out.printf("Loading image: %s from disk%n", filename);
    }
}
