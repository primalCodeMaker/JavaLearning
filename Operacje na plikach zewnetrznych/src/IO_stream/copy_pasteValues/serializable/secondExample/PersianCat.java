package IO_stream.copy_pasteValues.serializable.secondExample;

import java.io.Serializable;

public class PersianCat extends Cat implements Serializable {

    public PersianCat() {
        System.out.println("Calling Persian default Constructor");

    }

    public PersianCat(String name, String nickName) {
        super(name, nickName);
        System.out.println("Calling Persian normal Constructor");
    }
}
