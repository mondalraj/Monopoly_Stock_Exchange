import java.util.Scanner;

import functions.Function;
import company.Company;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Function func = new Function();
        Player player = new Player();
        
        /*
        func.welcome();

        func.instructions();

        System.out.print("Enter the First Player's name:- ");
        String name1  = sc.nextLine();
        player.setPlayerName(name1, 1);

        System.out.print("Enter the Second Player's name:- ");
        String name2  = sc.nextLine();
        player.setPlayerName(name2, 2);

        System.out.print("Enter the Third Player's name:- ");
        String name3  = sc.nextLine();
        player.setPlayerName(name3, 3);

        System.out.println("\n Press Enter to start the game... ");

        func.board();
        

        for(int i = 1; i>0 ; i++ ){
            if(i%3==1){
                i = 1;
                System.out.println(i);
            } 
            else if(i%3==2){
                i = 2;
                System.out.println(i);
            } 
            else{
                i = 3;
                System.out.println(i);
            }
        }
        */
        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.flush();
        System.out.println("Hello");
    }
}