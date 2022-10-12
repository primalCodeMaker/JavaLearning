package first;

import first.Global.Global;
import static first.Global.Global.GLOBAL_CONS;

public class Run {

    public static void main(String[] args) {

        Global test1 = new Global("Hiden Element");
        System.out.println(test1.getNonStaticValuForglobal());
        test1.setGlobal();
        System.out.println(Global.GLOBAL_CONS);
        System.out.println(Global.global);

        //importy
        String import1 = Global.GLOBAL_CONS;
        String import2 = GLOBAL_CONS;


    }
}
