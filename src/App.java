import java.util.Scanner;

import functions.Function;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Function fun = new Function();
        fun.welcome();
        fun.chance();
        Player player = new Player();

        // Setting Player Names
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player 1 Name : ");
        String name1 = sc.nextLine();
        player.setPlayerName(name1, 1);

        System.out.print("Enter Player 2 Name : ");
        String name2 = sc.nextLine();
        player.setPlayerName(name2, 2);

        System.out.print("Enter Player 3 Name : ");
        String name3 = sc.nextLine();
        player.setPlayerName(name3, 3);

        // Getting Player names
        player.getPlayerName(1);
        player.getPlayerName(2);
        player.getPlayerName(3);

        //quit function
        fun.quit();

        //winner function
        fun.winner();

        //Setting Player's currentBalance
        player.setPlayerCurrentBal(2000, 1);
        player.setPlayerCurrentBal(5000, 2);
        player.setPlayerCurrentBal(6000, 3);

        //Getting Player's currentBalance
        player.getPlayerCurrentBal(1);
        player.getPlayerCurrentBal(2);
        player.getPlayerCurrentBal(3);
    }
}
