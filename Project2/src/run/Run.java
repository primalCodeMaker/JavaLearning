package run;

import player.Player;

public class Run {

    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Witaj " + player.getPlayerName());
        System.out.println("Znak Gracza: " + player.getPlayerSign());

        System.out.println(player);

        System.out.println("");
        System.out.println("[__]");

        System.out.println("▏▔▏");
        System.out.println();


    }
}
