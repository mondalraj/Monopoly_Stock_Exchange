import java.util.*;

import functions.Function;
import company.Company;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Function func = new Function();
        Player player = new Player();

        func.welcome();

        func.instructions();

        System.out.print("Enter the First Player's name:- ");
        String name1 = sc.nextLine();
        player.setPlayerName(name1, 1);

        System.out.print("Enter the Second Player's name:- ");
        String name2 = sc.nextLine();
        player.setPlayerName(name2, 2);

        System.out.print("Enter the Third Player's name:- ");
        String name3 = sc.nextLine();
        player.setPlayerName(name3, 3);

        System.out.println("\n Press Enter to start the game... ");

        func.promptEnterKey();
        func.board();

        for (int i = 1; i > 0; i++) {
            if (i % 3 == 1) {
                i = 1;
                System.out.println(player.getPlayerName(1)+" press ENTER to roll the dice");
                
            } else if (i % 3 == 2) {
                i = 2;
                System.out.println(player.getPlayerName(2)+" press ENTER to roll the dice");
                
            } else {
                i = 3;
                System.out.println(player.getPlayerName(3)+" press ENTER to roll the dice");
                
                break;
            }
            func.promptEnterKey();
            System.out.println(func.dice());
        }
        // func.cls();

    }
}