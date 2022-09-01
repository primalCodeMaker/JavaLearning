package overriding;

public class SuperClass {


    private String privateMethod() {
        return "SuperClass private method";
    }
    protected String protectedMethod() {
        return "SuperClass protected method";
    }
    String defaultMethod() {
        return "SuperClass default method";
    }
    public String publicMethod() {
        return "SuperClass public method";
    }

    public String superClassMethodInSubclassMethod() {
        return "\"superClassMethodInSubclassMethod\" called from sub class";
    }

}
