package Ojects.Dziedziczenie;

public class TV {
    String channels = "switch channels";
    String volume = "volume UP / DOWN";
    Boolean scartInput = true;
    int numberOfChannels = 10;

    public void turnON () {
        System.out.println("Turn ON");
    }

    @Override
    public String toString() {
        return "TV{" +
                "channels='" + channels + '\'' +
                ", volume='" + volume + '\'' +
                ", scartInput=" + scartInput +
                ", numberOfChannels=" + numberOfChannels +
                '}';
    }
}
