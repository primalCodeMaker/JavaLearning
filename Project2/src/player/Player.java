package player;

import java.util.Scanner;

public class Player {
    private String playerName;
    private String playerSign;

    public Player() {
        Scanner name = new Scanner(System.in);
        System.out.println("Podaj swoj nick");
        this.playerName = name.nextLine();
        playerSign = String.valueOf(playerName.toUpperCase().charAt(0));

    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerSign() {
        return playerSign;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerSign='" + playerSign + '\'' +
                '}';
    }
}
