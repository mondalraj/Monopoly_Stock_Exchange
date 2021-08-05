import java.util.Scanner;

import functions.Function;
import company.Company;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Function fun = new Function();
        Player player = new Player();
        Company company = new Company();

        fun.welcome();
        fun.chance();

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

        // quit function
        fun.quit();

        // winner function
        fun.winner();

        // Setting Player's currentBalance
        player.setPlayerCurrentBal(25000, 1);
        player.setPlayerCurrentBal(2000, 2);
        player.setPlayerCurrentBal(2000, 3);

        // Getting Player's currentBalance
        System.out.println(player.getPlayerCurrentBal(1));
        
        player.getPlayerCurrentBal(2);
        player.getPlayerCurrentBal(3);

        // Company Notation -> a2 - Amazon, t5 - tesla, m6 - Microsoft, g9 - Google, i10 - ISRO, f11 - Facebook

        // Getting Company Cost
        company.getCompanyCost(2);

        // Setting company's Share Price
        company.setCompanySharePrice(300, 2);

        // Getting company's Share Price
        company.getCompanySharePrice(2);

        // Getting Company's no. of shares
        company.getCompanyNoOfShares(2);

        // Setting Company's Service Rent
        company.setCompanyServiceRent(500, 2);

        // Getting Company's service rent
        company.getCompanyServiceRent(2);

        //Calling excess balance func
        player.excessBalance(2);
        
        //Setting Player Current Position
        player.setPlayerCurrentPosition(4,1);

        //Getting Player Current Position
        System.out.println(player.getPlayerCurrentPosition(1));


    }
}
