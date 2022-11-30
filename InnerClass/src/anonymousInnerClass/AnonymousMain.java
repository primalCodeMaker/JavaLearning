package anonymousInnerClass;

public class AnonymousMain {

    public static void main(String[] args) {
        AnonymousMain main = new AnonymousMain();
        System.out.println(main.callInnerInterface());
        System.out.println(main.callInnerAbstractClass());

    }

    private String callInnerAbstractClass() {
        Animal animal = new Animal() {
            @Override
            String whatsYourName() {
                return "my name is Abstract Class";
            }
        };
        return animal.whatsYourName();
    }

    private String callInnerInterface() {
        Singable singable = songName -> "I am singing my favourite Song";
        return singable.singASong("my favourite song"); //todo czy da sie wyciagnac stad songName?
    }

    interface Voiceable {

        String silentVoice();

        String loudVoice();
    }

    interface Singable {
        String singASong(String songName);
    }

    abstract class Animal {
        abstract String whatsYourName();
    }
}
