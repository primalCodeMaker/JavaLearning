package org.designPatterns.Singleton;

public class Singleton {

    private static Singleton instance;
    private final String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton("my Original Singielton");
        }
        return instance;
    }

    public String getAppName(Singleton singleton) {
        System.out.println(singleton.name);
        return singleton.name;

    }
}
