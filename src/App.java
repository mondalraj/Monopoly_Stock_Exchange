//import java.util.*;

import functions.Function;

import java.util.Scanner;

import company.Company;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Function func = new Function();
        Player player = new Player();
        Company company = new Company();

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
                System.out.println(player.getPlayerName(1) + " press ENTER to roll the dice");

            } else if (i % 3 == 2) {
                i = 2;
                System.out.println(player.getPlayerName(2) + " press ENTER to roll the dice");

            } else {
                i = 3;
                System.out.println(player.getPlayerName(3) + " press ENTER to roll the dice");

                break;
            }
            func.promptEnterKey();
            System.out.println("You rolled " + func.dice(i));
            int currentPosition = player.getPlayerCurrentPosition(i);
            switch (currentPosition) {
                case 1: {

                    System.out.println("You are on |GO|");
                    System.out.println("You will recieve dollar 2000 when you pass");
                    break;
                }
                case 2: {
                    System.out.println("You have reached | AMAZON |");

                    if (company.getCompanyOwner(2) == 0) {

                        System.out.println("Cost of Amazon is 6000 dollars only");
                        System.out.println("You will own a total of 20 shares of the company ");
                        System.out.println("Each share cost is 200 ");
                        System.out.println("Service Rent of Amazon is 400");
                        System.out.println("Do you want to buy or not ?");

                        String response = sc.nextLine();

                        if (response == "yes" || response == "Yes" || response == "YES") {
                            if (player.getPlayerCurrentBal(i) >= 6000) {
                                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 6000, i);
                                company.setCompanyOwner(2, i);
                                player.setPlayerCompaniesOwned(i, 1);
                                System.out.println(" Congratulations !!!");
                                System.out.println(" You have bought Amazon");
                                System.out.println("Player " + i + "'s current Balance = ");
                                player.getPlayerCurrentBal(i);
                            } else {
                                System.out.println(" You don't have sufficient balance to buy Amazon");
                                System.out.println(" Do u want to sell your shares ? Remember , you will have to sell all your shares ,you will not be allowed to sell a particular amount of shares ( Enter yes / no )");

                                String res = sc.nextLine();

                                if (res == "yes" || res == "Yes" || res == "YES") {
                                    func.sell();
                                } else {
                                    break;
                                }
                            }
                        } else {
                            System.out.println(" Continue the game");
                            System.out.println(" Thanks for visiting Amazon");
                        }

                    } else {
                        int owner = company.getCompanyOwner(2);

                        if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(2)) {
                            System.out.println("Amazon is owned by " + player.getPlayerName(owner));

                            System.out
                                    .println(" You will have to pay $" + company.getCompanyServiceRent(2) + " as rent");
                            player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(2),
                                    i);

                            player.setPlayerCurrentBal(
                                    player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(2), owner);
                            func.updateServiceRent(2);

                        } else {
                            // Option dena hai player ko stocks aur company sell karne k liye if uske paas
                            // paryapt dhan rashi nhi hai.
                        }

                    }

                    break;

                }
                case 3: {
                    // call the function of stock market
                    break;
                }
                case 4: {
                    // call short listing fraud function
                    break;

                }
                case 5: {
                    System.out.println("You have reached | TESLA |");
                    // if(Tesla==0){
                    // System.out.println("Cost of Tesla is 5500 dollars only");
                    // System.out.println("You will own a total of 45 shares of the company ");
                    // System.out.println("Each share cost"+ shareprice );
                    // System.out.println("Service Rent of Tesla is 450");
                    // System.out.println("Do you want to buy or not ?");
                    // input lena ha yes or no
                    // if(input == yes){
                    // currentBalance = currentBalance - 5500 ;
                    // system.put.println(" Congratulations !!!")
                    // system.put.println(" You have bought Tesla")
                    // }
                    // else{
                    // yaha pr jis bnde ke company ha uska naam print krvana ha
                    // system.out.println(" You have to pay this much rent");
                    // update current balance of both the players
                    // }
                    break;

                }
                case 6: {
                    System.out.println("You have reached | MICROSOFT |");
                    // if(Amazon==0){
                    // System.out.println("Cost of Microsoft is 5000 dollars only");
                    // System.out.println("You will own a total of 30 shares of the company ");
                    // System.out.println("Each share cost"+ shareprice );
                    // System.out.println("Service Rent of Microsoft is 300");
                    // System.out.println("Do you want to buy or not ?");
                    // input lena ha yes or no
                    // if(input == yes){
                    // currentBalance = currentBalance - 5000 ;
                    // system.put.println(" Congratulations !!!")
                    // system.put.println(" You have bought Microsoft")
                    // }
                    // else{
                    // yaha pr jis bnde ke company ha uska naam print krvana ha
                    // system.out.println(" You have to pay this much rent");
                    // update current balance of both the players
                    // }

                    break;

                }
                case 7: {
                    // call income tax raid function
                    break;
                }
                case 8: {
                    // call stock market
                    break;

                }
                case 9: {
                    System.out.println("You have reached | GOOGLE |");
                    // if(Amazon==0){
                    // System.out.println("Cost of Google is 10000 dollars only");
                    // System.out.println("You will own a total of 8 shares of the company ");
                    // System.out.println("Each share cost"+ shareprice );
                    // System.out.println("Service Rent of Google is 400");
                    // System.out.println("Do you want to buy or not ?");
                    // input lena ha yes or no
                    // if(input == yes){
                    // currentBalance = currentBalance - 10000 ;
                    // system.put.println(" Congratulations !!!")
                    // system.put.println(" You have bought Google")
                    // }
                    // else{
                    // yaha pr jis bnde ke company ha uska naam print krvana ha
                    // system.out.println(" You have to pay this much rent");
                    // update current balance of both the players
                    // }
                    break;
                }
                case 10: {
                    System.out.println("You have reached | ISRO |");
                    // if(Amazon==0){
                    // System.out.println("Cost of ISRO is 7000 dollars only");
                    // System.out.println("You will own a total of 10 shares of the company ");
                    // System.out.println("Each share cost"+ shareprice );
                    // System.out.println("Service Rent of ISOR is 400");
                    // System.out.println("Do you want to buy or not ?");
                    // input lena ha yes or no
                    // if(input == yes){
                    // currentBalance = currentBalance - 7000 ;
                    // system.put.println(" Congratulations !!!")
                    // system.put.println(" You have bought ISRO")
                    // }
                    // else{
                    // yaha pr jis bnde ke company ha uska naam print krvana ha
                    // system.out.println(" You have to pay this much rent");
                    // update current balance of both the players
                    // }
                    break;
                }
                case 11: {
                    System.out.println("You have reached | Facebook |");
                    // if(Amazon==0){
                    // System.out.println("Cost of Facebook is 6000 dollars only");
                    // System.out.println("You will own a total of 30 shares of the company ");
                    // System.out.println("Each share cost"+ shareprice );
                    // System.out.println("Service Rent of Facebook is 600");
                    // System.out.println("Do you want to buy or not ?");
                    // input lena ha yes or no
                    // if(input == yes){
                    // currentBalance = currentBalance - 6000 ;
                    // system.put.println(" Congratulations !!!")
                    // system.put.println(" You have bought Facebook")
                    // }

                    // else{
                    // yaha pr jis bnde ke company ha uska naam print krvana ha
                    // system.out.println(" You have to pay this much rent");
                    // update current balance of both the players
                    // }
                    break;
                }
                case 12: {
                    // call chance function
                    break;
                }
            }
        }
        // func.cls();

    }
}
