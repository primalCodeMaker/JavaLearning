package org.designPatterns.Singleton;

public class Main {

    public static void main(String[] args) {


        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.getAppName(singleton1));


    }
}
