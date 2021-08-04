import java.util.Scanner;

import functions.Function;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Function fun = new Function();
        fun.welcome();
        fun.chance();
        Player player = new Player();

        // Setting Player Names
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        player.setPlayerName(name1, 1);

        String name2 = sc.nextLine();
        player.setPlayerName(name2, 2);

        String name3 = sc.nextLine();
        player.setPlayerName(name3, 3);

        //Getting Player names
        player.getPlayerName(1);
        player.getPlayerName(2);
        player.getPlayerName(3);
    }
}
