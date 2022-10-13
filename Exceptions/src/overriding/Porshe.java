package overriding;

import java.io.IOException;

public class Porshe extends Car{

    @Override
    public void go() throws IOException, NullPointerException {  // moge zucac NullPointer bo on jest typu Runtime a nie catch (zwykly exceprion ktory wymaga obsluzenia)
        System.out.println("GO GO GO my lovely Porshe <3 ");
    }

    public void goPorshe(String string) throws Exception,IOException, NullPointerException {
        System.out.println("GO GO GO my lovely Porshe <3 ");
    }

    public void goPorshe(int i) throws IOException {
        System.out.println("GO GO GO my lovely Porshe <3 ");
    }
}
