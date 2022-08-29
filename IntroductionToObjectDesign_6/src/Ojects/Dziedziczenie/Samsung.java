package Ojects.Dziedziczenie;

public class Samsung extends TV {

    boolean scartInput = false;
    boolean HDMI = true;
    String Netflix = "includes Netflix APP";

    @Override
    public String toString() {
        return "Samsung{" +
                "scartInput=" + scartInput +
                ", HDMI=" + HDMI +
                ", Netflix='" + Netflix + '\'' +
                ", switch channels='" + channels + '\'' +
                ", volume='" + volume + '\'' +
                ", scartInput=" + scartInput +
                ", numberOfChannels=" + numberOfChannels +
                '}';
    }
}
