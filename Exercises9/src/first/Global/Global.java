package first.Global;

public class Global {

    public static String global;
    public final static String GLOBAL_CONS = "not for change";
    private String nonStaticValuForglobal;

    public Global(String nonStaticValuForglobal) {
        this.nonStaticValuForglobal = nonStaticValuForglobal;
    }

    public static String getGlobal() {
        return global;
    }

    public String setGlobal() {
        global = nonStaticValuForglobal;
        return nonStaticValuForglobal;
    }

    public String getNonStaticValuForglobal() {
        return nonStaticValuForglobal;
    }

    public void setNonStaticValuForglobal() {
        this.nonStaticValuForglobal = nonStaticValuForglobal;
        System.out.println(nonStaticValuForglobal);
    }
}