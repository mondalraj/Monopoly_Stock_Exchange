package functions;

import java.io.IOException;
import java.util.*;

import company.Company;
import player.Player;
// import java.lang.*;

public class Function {
    Player player = new Player();
    Company company = new Company();

    public int welcome() {
        System.out.println("\n\n\n\t\t\t\t\tWelcome TO\n");
        System.out.println("\t\t\t\t  Monopoly Stock Exchange\n\n");

        return 0;
    }

    public int instructions() {
        System.out.println(" Welcome to Monopoly Stock Exchange Game");
        System.out.println(" Here are the rules of the game\n");
        System.out.println(" 1.This is a 3 player  modern stock trading game designed to be hassle-free and fun at every corner.\n ");
        System.out.println( " 2.Goal of this game is to become the first player to have more than Rs.20000 and win this ultimate stock market battle.The player will be declared bankrupt once he reaches Rs0.\n");
        System.out.println(
                "  3.This game has 12 blocks that start at 1 which is |GO|. Collect Rs.2000 every time the player passes 1(GO).  Players will have an option to move maximum of 3 blocks at a time. \n");
        System.out.println(
                "  4.Land on fthe blocks numbered 2,5,6,8,10,11 to buy the company mentioned on the respective block by purchasing its shares. \n");
        System.out.println(
                "  5.If a player lands on any of these |Company Block| which is owned by another player, the share value of that company will increase accordingly and the company owner will collect ‘service rent’ from that player.\n ");
        System.out.println(
                "  6.Blocks numbered 3,8 are the |Trading blocks|. Here players can trade and transfer their shares. \n");
        System.out.println(
                "  7.If a player lands on block 4, they are caught in ‘Shortlisting Fraud’, pay fine of Rs.500 to the bank. \n");
        System.out.println(
                "  8.If a player lands on block 7, they face an |Income Tax Raid|, the share value of all the companies that player own will decrease by 5% along with a fine of Rs.200 to the bank.\n ");
        System.out.println("  9.Get lucky with a |Chance Card| every time the player lands on block 12. \n");
        System.out.println(
                " 10.The players will have an option to sell their share anytime during the course of the game.\n");
        System.out.println(
                " 11. Please note when a player is out of money and decides to sell his shares, he will have to sell all his shares.\n");

        return 0;
    }

    public int board() {
        System.out.println("                                                          \t"
                + "________________________________________________________________                                                                                 ");
        System.out.println("  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \t"
                + "                                                      ");
        System.out.println(
                " |            |             |             |              |\t" + "         " + player.getPlayerName(1));
        System.out.println(" |     1.     |      2.     |      3.     |      4.      |\t"
                + "    current balance     :- " + player.getPlayerCurrentBal(1));
        System.out.println(
                " |     GO     |   Amazon    |    Stock    |   Short      |\t" + "    companies owned     :- ");
        companiesOwned(1);
        System.out.println(
                " |            |             |    Market   |   Listing    |\t" + "    shared owned        :- ");
        sharesOwned(1);
        System.out.println(" |            |             |             |   Fraud      |\t"
                + "                                                               ");
        System.out.println(" |_ _ _ _ _ _ |_ _ _ _ _ _ _| _ _ _ _ _ _ |_ _ _ _ _ _ _ |\t"
                + "________________________________________________________________                                                               ");
        System.out.println(" |            |                           |              |\t"
                + "                                                            ");
        System.out.println(" |    12.     |                           |      5.      |\t" + "          "
                + player.getPlayerName(2));
        System.out.println(" |   Chance   |                           |    Tesla     |\t"
                + "    current balance     :- " + player.getPlayerCurrentBal(2));
        System.out.println(
                " |            |                           |              |\t" + "    companies owned     :- ");
        companiesOwned(2);
        System.out.println(
                " |_ _ _ _ _ _ |                           | _ _ _ _ _ _ _|\t" + "    shared owned        :- ");
        sharesOwned(2);
        System.out.println(" |            |                           |              |\t"
                + "                                                                   ");
        System.out.println(" |     11.    |                           |      6.      |\t"
                + "_________________________________________________________________                                                             ");
        System.out.println(" |  Facebook  |                           |   Micorsoft  |\t"
                + "                                                                   ");
        System.out.println(" |            |                           |              |\t" + "          "
                + player.getPlayerName(3));
        System.out.println(" |_ _ _ _ _ _ | _ _ _ _ _ _ _ _ _ _ _ _ _ |_ _ _ _ _ _ _ |\t"
                + "    current balance     :- " + player.getPlayerCurrentBal(3));
        System.out.println(
                " |            |              |            |              |\t" + "    companies owned     :- ");
        companiesOwned(3);
        System.out.println(
                " |     10.    |      9.      |     8.     |      7.      |\t" + "    shared owned        :- ");
        sharesOwned(3);
        System.out.println(" |    ISRO    |    Google    |   Stock    |    Income    |\t"
                + "                                                              ");
        System.out.println(" |            |              |   Market   |   Tax Raid   |\t"
                + "_________________________________________________________________                                                                    ");
        System.out.println(" |            |              |            |              |\t"
                + "                                                                                ");
        System.out.println(" |_ _ _ _ _ _ |_ _ _ _ _ _ _ |_ _ _ _ _ _ |_ _ _ _ _ _ _ |\t"
                + "                                                                             ");
        System.out.println("                                                          \t" + "");

        return 0;
    }

    public void companiesOwned(int p) {
        boolean[] companies = player.getPlayerCompaniesOwned(p);
        if (companies[1] == true) {
            System.out.print("Amazon ");
        }
        if (companies[4] == true) {
            System.out.print("Tesla ");
        }
        if (companies[5] == true) {
            System.out.print("Microsoft ");
        }
        if (companies[8] == true) {
            System.out.print("Google ");
        }
        if (companies[9] == true) {
            System.out.print("ISRO ");
        }
        if (companies[10] == true) {
            System.out.print("Facebook ");
        }
    }

    public void sharesOwned(int p) {
        if (player.getPlayerSharesOwned(p, 2) > 0) {
            System.out.println("Amazon: " + player.getPlayerSharesOwned(p, 2));
        }
        if (player.getPlayerSharesOwned(p, 5) > 0) {
            System.out.println("Tesla: " + player.getPlayerSharesOwned(p, 5));
        }
        if (player.getPlayerSharesOwned(p, 6) > 0) {
            System.out.println("Microsoft: " + player.getPlayerSharesOwned(p, 6));
        }
        if (player.getPlayerSharesOwned(p, 9) > 0) {
            System.out.println("Google: " + player.getPlayerSharesOwned(p, 9));
        }
        if (player.getPlayerSharesOwned(p, 10) > 0) {
            System.out.println("ISRO: " + player.getPlayerSharesOwned(p, 10));
        }
        if (player.getPlayerSharesOwned(p, 11) > 0) {
            System.out.println("Facebook: " + player.getPlayerSharesOwned(p, 11));
        }
    }

    public String chance() {
        String[] chanceName = { "Hostile takeover attempt - pay lawyer 1000",
                "Your least expensive ticket -pay 5 times share price to bank and inc",
                "Your most expensive ticket - pay 2 times share price to bak and inc",
                "Go to trading allowed counter , pass go (nearest trading counter)." };
        Random random = new Random();
        int randomNumber = random.nextInt(chanceName.length);
        String s = chanceName[randomNumber];
        System.out.println(s);
        return s;
    }

    public void quit() {
        System.out.println("You Lose the game");
        System.out.println("Better Luck Next Time!");
    }

    public void winner() {
        System.out.println("Congratulations You Have Won The Game");
    }

    public void promptEnterKey() {

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int resetPostion(int currentPosition, int p) { // this function is to repeat the cycle to go to block 1 after
                                                          // block 12
        if (currentPosition > 12) {
            currentPosition = currentPosition - 12;
            player.setPlayerCurrentPosition(currentPosition, p);
            go(p);
        } else {
            player.setPlayerCurrentPosition(currentPosition, p);
        }
        return 0;
    }

    public int go(int p) {
        player.setPlayerCurrentBal(player.getPlayerCurrentBal(p) + 2000, p);
        // System.out.println("Your current balance is "+
        // player.getPlayerCurrentBal(p));
        return 0;
    }

    public void updateServiceRent(int n) {
        float currentRent = company.getCompanyServiceRent(n);
        currentRent = (float) (currentRent + 0.1 * currentRent);
        company.setCompanyServiceRent(currentRent, n);
    }

    public int sell(int i) {
        if (player.getPlayerSharesOwned(i, 2) > 0) {
            if (company.getCompanyOwner(2) != i) {
                int shareNum = player.getPlayerSharesOwned(i, 2);
                int owner = company.getCompanyOwner(2);
                float shareBal = (player.getPlayerSharesOwned(i, 2)) * (company.getCompanySharePrice(2));
                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) + shareBal, i);
                player.setPlayerSharesOwned(i, 2, 0);

                if (player.getPlayerCurrentBal(owner) > shareBal) {
                    player.setPlayerSharesOwned(owner, 2, player.getPlayerSharesOwned(owner, 2) + shareNum);
                    player.setPlayerCurrentBal(player.getPlayerCurrentBal(owner) - shareBal, owner);
                } else {
                    bankRupt(player.getPlayerName(owner));
                }
            }
        }
        if (player.getPlayerSharesOwned(i, 5) > 0) {
            if (company.getCompanyOwner(5) != i) {
                int shareNum = player.getPlayerSharesOwned(i, 5);
                int owner = company.getCompanyOwner(5);
                float shareBal = (player.getPlayerSharesOwned(i, 5)) * (company.getCompanySharePrice(5));
                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) + shareBal, i);
                player.setPlayerSharesOwned(i, 5, 0);

                if (player.getPlayerCurrentBal(owner) > shareBal) {
                    player.setPlayerSharesOwned(owner, 5, player.getPlayerSharesOwned(owner, 5) + shareNum);
                    player.setPlayerCurrentBal(player.getPlayerCurrentBal(owner) - shareBal, owner);
                } else {
                    bankRupt(player.getPlayerName(owner));
                }
            }
        }
        if (player.getPlayerSharesOwned(i, 6) > 0) {
            if (company.getCompanyOwner(6) != i) {
                int shareNum = player.getPlayerSharesOwned(i, 6);
                int owner = company.getCompanyOwner(6);
                float shareBal = (player.getPlayerSharesOwned(i, 6)) * (company.getCompanySharePrice(6));
                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) + shareBal, i);
                player.setPlayerSharesOwned(i, 6, 0);

                if (player.getPlayerCurrentBal(owner) > shareBal) {
                    player.setPlayerSharesOwned(owner, 6, player.getPlayerSharesOwned(owner, 6) + shareNum);
                    player.setPlayerCurrentBal(player.getPlayerCurrentBal(owner) - shareBal, owner);
                } else {
                    bankRupt(player.getPlayerName(owner));
                }
            }
        }
        if (player.getPlayerSharesOwned(i, 9) > 0) {
            if (company.getCompanyOwner(9) != i) {
                int shareNum = player.getPlayerSharesOwned(i, 9);
                int owner = company.getCompanyOwner(9);
                float shareBal = (player.getPlayerSharesOwned(i, 9)) * (company.getCompanySharePrice(9));
                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) + shareBal, i);
                player.setPlayerSharesOwned(i, 9, 0);

                if (player.getPlayerCurrentBal(owner) > shareBal) {
                    player.setPlayerSharesOwned(owner, 9, player.getPlayerSharesOwned(owner, 9) + shareNum);
                    player.setPlayerCurrentBal(player.getPlayerCurrentBal(owner) - shareBal, owner);
                } else {
                    bankRupt(player.getPlayerName(owner));
                }
            }
        }
        if (player.getPlayerSharesOwned(i, 10) > 0) {
            if (company.getCompanyOwner(10) != i) {
                int shareNum = player.getPlayerSharesOwned(i, 10);
                int owner = company.getCompanyOwner(10);
                float shareBal = (player.getPlayerSharesOwned(i, 10)) * (company.getCompanySharePrice(10));
                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) + shareBal, i);
                player.setPlayerSharesOwned(i, 10, 0);

                if (player.getPlayerCurrentBal(owner) > shareBal) {
                    player.setPlayerSharesOwned(owner, 10, player.getPlayerSharesOwned(owner, 10) + shareNum);
                    player.setPlayerCurrentBal(player.getPlayerCurrentBal(owner) - shareBal, owner);
                } else {
                    bankRupt(player.getPlayerName(owner));
                }
            }
        }
        if (player.getPlayerSharesOwned(i, 11) > 0) {
            if (company.getCompanyOwner(11) != i) {
                int shareNum = player.getPlayerSharesOwned(i, 11);
                int owner = company.getCompanyOwner(11);
                float shareBal = (player.getPlayerSharesOwned(i, 11)) * (company.getCompanySharePrice(11));
                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) + shareBal, i);
                player.setPlayerSharesOwned(i, 11, 0);

                if (player.getPlayerCurrentBal(owner) > shareBal) {
                    player.setPlayerSharesOwned(owner, 11, player.getPlayerSharesOwned(owner, 11) + shareNum);
                    player.setPlayerCurrentBal(player.getPlayerCurrentBal(owner) - shareBal, owner);
                } else {
                    bankRupt(player.getPlayerName(owner));
                }
            }
        }

        return 0;
    }

    public int bankRupt(String gareeb) {
        System.out.println(" We are sorry to inform you that your current balance is 0 .");
        System.out.println(gareeb + " dont even have any stocks to sell .");
        System.out.println(gareeb + " lost the game ");
        System.out.println(" GAME OVER");

        System.exit(0);
        return 0;
    }

    String mnc;

    public String company(int c) {
        if (c == 1) {
            mnc = "Amazon";
        } else if (c == 4) {
            mnc = "Tesla";
        } else if (c == 5) {
            mnc = "Microsoft";
        } else if (c == 8) {
            mnc = "Google";
        } else if (c == 9) {
            mnc = "ISRO";
        } else if (c == 10) {
            mnc = "Facebook";
        }
        return mnc;
    }

    public void taxraid() {
        System.out.println("For each company pay 200");
        System.out.println("Price decrease of your company’s share by 5%");
        // list of companies of person having tax raid
        // taxraid=no. of companies*200
        // update current balance=Current Balance-taxraid
        // update current share balance=95*Current Share Balance/100
        // System.out.println(current balance)
        // System.out.println(current share balance)

    }

    public void fraud(int p) {
        System.out.println("Short Listing Fraud");
        System.out.println(player.getPlayerName(p) + "Pay rs.500 to the bank");
        System.out.println("All the share Price for the companies you owned will decrease by 20%");
        System.out.println("List of companies owned by " + player.getPlayerName(p));
        companiesOwned(p);
        if (player.getPlayerCurrentBal(p) >= 500) {
            player.setPlayerCurrentBal(player.getPlayerCurrentBal(p) - 500, p);

        } else {
            System.out.println(
                    "You don't have enough balance to pay for the short listing fraud \n Press Enter to sell all your shares. ");
            promptEnterKey();
            sell(p);
            if (player.getPlayerCurrentBal(p) >= 500) {
                player.setPlayerCurrentBal(player.getPlayerCurrentBal(p) - 500, p);

            } else {
                bankRupt(player.getPlayerName(p));
            }
        }
    }

    public int excessBalance(int p) {
        if (player.getPlayerCurrentBal(p) >= 20000) {
            System.out.println("Since your current balance is more than 20000,So you won");
            winner();
        }
        return 0;
    }

    public int stockMarket(int p) {

        System.out.println(" You have arrived at the Stock Market ");
        System.out.println(" Here you can buy stocks of the companies already owned by other players.");

        if (company.getCompanyOwner(2) != 0) {
            System.out.println("Do you want to buy shares of Amazon (yes/no)");
            Scanner sc = new Scanner(System.in);
            String response = sc.nextLine();
            if (response == "yes" || response == "Yes" || response == "YES") {
                int owner = company.getCompanyOwner(2);
                int sharesForsale = (int) (player.getPlayerSharesOwned(owner, 2) /2 );

                System.out.println("How many shares of Amazon do you want to buy out of " + sharesForsale);
                int buyShare = sc.nextInt();
                if (buyShare >= sharesForsale) {
                    System.out.println(buyShare + " shares are not available of Amazon for Sale");
                    
                } else {
                    float sharePrice = buyShare * company.getCompanySharePrice(2);
                    if (player.getPlayerCurrentBal(p) > sharePrice) {
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(p) - sharePrice, p);
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(2) + sharePrice, owner);
                        player.setPlayerSharesOwned(owner, 2, player.getPlayerSharesOwned(owner, 2) - buyShare);
                        player.setPlayerSharesOwned(p, 2, player.getPlayerSharesOwned(p, 2) + buyShare);
                    } else {
                        System.out.println("You don't have enough balance to buy " + buyShare + " shares of Amazon");
                    }

                }

            }
        }

        if (company.getCompanyOwner(5) != 0) {
            System.out.println("Do you want to buy shares of Tesla (yes/no)");
            Scanner sc = new Scanner(System.in);
            String response = sc.nextLine();
            if (response == "yes" || response == "Yes" || response == "YES") {
                int owner = company.getCompanyOwner(5);
                int sharesForsale = (int) (player.getPlayerSharesOwned(owner, 5)/2);

                System.out.println("How many shares of Tesla do you want to buy out of " + sharesForsale);
                int buyShare = sc.nextInt();
                if (buyShare >= sharesForsale) {
                    System.out.println(buyShare + " shares are not available of Tesla for Sale");
                    
                } else {
                    float sharePrice = buyShare * company.getCompanySharePrice(5);
                    if (player.getPlayerCurrentBal(p) > sharePrice) {
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(p) - sharePrice, p);
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(2) + sharePrice, owner);
                        player.setPlayerSharesOwned(owner, 5, player.getPlayerSharesOwned(owner, 5) - buyShare);
                        player.setPlayerSharesOwned(p, 5, player.getPlayerSharesOwned(p, 5) + buyShare);
                    } else {
                        System.out.println("You don't have enough balance to buy " + buyShare + " shares of Tesla");
                    }

                }

            }
        }

        if (company.getCompanyOwner(6) != 0) {
            System.out.println("Do you want to buy shares of Microsoft (yes/no)");
            Scanner sc = new Scanner(System.in);
            String response = sc.nextLine();
            if (response == "yes" || response == "Yes" || response == "YES") {
                int owner = company.getCompanyOwner(6);
                int sharesForsale = (int) (player.getPlayerSharesOwned(owner, 6) /2);

                System.out.println("How many shares of Microsoft do you want to buy out of " + sharesForsale);
                int buyShare = sc.nextInt();
                if (buyShare >= sharesForsale) {
                    System.out.println(buyShare + " shares are not available of Microsoft for Sale");
                    
                } else {
                    float sharePrice = buyShare * company.getCompanySharePrice(6);
                    if (player.getPlayerCurrentBal(p) > sharePrice) {
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(p) - sharePrice, p);
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(6) + sharePrice, owner);
                        player.setPlayerSharesOwned(owner, 2, player.getPlayerSharesOwned(owner, 6) - buyShare);
                        player.setPlayerSharesOwned(p, 6, player.getPlayerSharesOwned(p, 6) + buyShare);
                    } else {
                        System.out.println("You don't have enough balance to buy " + buyShare + " shares of Microsoft ");
                    }

                }

            }
        }



        if (company.getCompanyOwner(9) != 0) {
            System.out.println("Do you want to buy shares of Google (yes/no)");
            Scanner sc = new Scanner(System.in);
            String response = sc.nextLine();
            if (response == "yes" || response == "Yes" || response == "YES") {
                int owner = company.getCompanyOwner(9);
                int sharesForsale = (int) (player.getPlayerSharesOwned(owner, 9)/2);

                System.out.println("How many shares of Google do you want to buy out of " + sharesForsale);
                int buyShare = sc.nextInt();
                if (buyShare >= sharesForsale) {
                    System.out.println(buyShare + " shares are not available of Google for Sale");
                    
                } else {
                    float sharePrice = buyShare * company.getCompanySharePrice(2);
                    if (player.getPlayerCurrentBal(p) > sharePrice) {
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(p) - sharePrice, p);
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(9) + sharePrice, owner);
                        player.setPlayerSharesOwned(owner, 9, player.getPlayerSharesOwned(owner, 9) - buyShare);
                        player.setPlayerSharesOwned(p, 9, player.getPlayerSharesOwned(p, 9) + buyShare);
                    } else {
                        System.out.println("You don't have enough balance to buy " + buyShare + " shares of Google");
                    }

                }

            }
        }
        if (company.getCompanyOwner(10) != 0) {
            System.out.println("Do you want to buy shares of ISRO (yes/no)");
            Scanner sc = new Scanner(System.in);
            String response = sc.nextLine();
            if (response == "yes" || response == "Yes" || response == "YES") {
                int owner = company.getCompanyOwner(10);
                int sharesForsale = (int) (player.getPlayerSharesOwned(owner, 10)/2);

                System.out.println("How many shares of ISRO do you want to buy out of " + sharesForsale);
                int buyShare = sc.nextInt();
                if (buyShare >= sharesForsale) {
                    System.out.println(buyShare + " shares are not available of ISRO for Sale");
                    
                } else {
                    float sharePrice = buyShare * company.getCompanySharePrice(2);
                    if (player.getPlayerCurrentBal(p) > sharePrice) {
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(p) - sharePrice, p);
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(10) + sharePrice, owner);
                        player.setPlayerSharesOwned(owner, 2, player.getPlayerSharesOwned(owner, 10) - buyShare);
                        player.setPlayerSharesOwned(p, 2, player.getPlayerSharesOwned(p, 10) + buyShare);
                    } else {
                        System.out.println("You don't have enough balance to buy " + buyShare + " shares of ISRO");
                    }

                }

            }
        }
                if (company.getCompanyOwner(11) != 0) {
            System.out.println("Do you want to buy shares of Facebook (yes/no)");
            Scanner sc = new Scanner(System.in);
            String response = sc.nextLine();
            if (response == "yes" || response == "Yes" || response == "YES") {
                int owner = company.getCompanyOwner(11);
                int sharesForsale = (int) (player.getPlayerSharesOwned(owner, 11)/2);

                System.out.println("How many shares of Facebook do you want to buy out of " + sharesForsale);
                int buyShare = sc.nextInt();
                if (buyShare >= sharesForsale) {
                    System.out.println(buyShare + " shares are not available of Facebook for Sale");
                    
                } else {
                    float sharePrice = buyShare * company.getCompanySharePrice(11);
                    if (player.getPlayerCurrentBal(p) > sharePrice) {
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(p) - sharePrice, p);
                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(11) + sharePrice, owner);
                        player.setPlayerSharesOwned(owner, 11, player.getPlayerSharesOwned(owner, 11) - buyShare);
                        player.setPlayerSharesOwned(p, 11, player.getPlayerSharesOwned(p, 11) + buyShare);
                    } else {
                        System.out.println("You don't have enough balance to buy " + buyShare + " shares of Facebook");
                    }

                }

            }
        } else{
            System.out.println("No companies are sold yet.");
        }

        return 0;
    }
}
