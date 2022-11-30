package anonymousInnerClass;

public class SecondExample {

    public static void main(String[] args) {
        SecondExample main = new SecondExample();
        System.out.println(main.callInnerAbstractClass());

    }

    private String callInnerAbstractClass() {
        return singASong("My beautiful Song", new Singable() {
            @Override
            public String singASong(String songName) {
                return " I am singing a song: " + songName;
            }
        });
    }

    public String singASong(String songName, Singable singable) {
        return singable.singASong(songName);
    }


    interface Singable {
        String singASong(String songName);
    }

    abstract class Animal {
        abstract String whatsYourName();
    }
}


