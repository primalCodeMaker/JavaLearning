package org.designPatterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");
        image1.display(); // obraz zostanie załadowany z dysku
        image1.display(); // obraz zostanie wyświetlony bez ładowania z dysku
        image2.display(); // obraz zostanie załadowany z dysku
        image2.display(); // obraz zostanie wyświetlony bez ładowania z dysku

    }
}
