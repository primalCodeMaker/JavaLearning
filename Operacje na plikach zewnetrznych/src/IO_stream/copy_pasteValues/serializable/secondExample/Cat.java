package IO_stream.copy_pasteValues.serializable.secondExample;

import java.io.Serializable;

public class Cat {
// Przyklad z kotem jest prykladem gdzie jedna klasa nie implementuje Serializable a kolejna, ktora po niej dziedziczy
// implementuje Serializable i to jej obiekty są serializowane (PersianCat)
// w wywołaniu takich obiektów najpierw wczytują się bloki inicjalizacyjne i konstruktory w klasie
// przez to mogą zostać nadpisane dane z obiektu

    private transient String name = "fieldName";

    private String nickName = "fieldNickName";

    static int age = 10;

    {
        this.name = "defaultName";
        this.nickName = "defaultNickName";
        System.out.println("Calling Cat init block");
    }

    static {
        age = 100;
        System.out.println("Calling Cat static init block");
    }

    public Cat() {
        this.name = "constructorDefaultName";
        this.nickName = "constructorDefaultNickName";
        System.out.println("Calling Cat default constructor");
    }

    public Cat(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
        System.out.println("Calling Cat normal constructor");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}


