package third;

import first.WrogNumberException;

public class SecondExceprion extends WrogNumberException {

    public SecondExceprion(String message) {
        super(message);
        System.out.println("secondExceprion constructor");
    }
}
