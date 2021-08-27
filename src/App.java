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

                // break;
            }
            func.promptEnterKey();
            func.excessBalance(i);

            int die = (int) (3.0 * Math.random()) + 1;
            int currentPosition = player.getPlayerCurrentPosition(i);
            currentPosition = currentPosition + die;
            player.setPlayerCurrentPosition(currentPosition, i);
            func.resetPostion(player.getPlayerCurrentPosition(i), i);

            System.out.println("You rolled " + die);
            System.out.println("Now you are on " + player.getPlayerCurrentPosition(i));

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
                        System.out.println(
                                "Each share cost is 200 and will increase 10% whenever other players arrives on the same ");
                        System.out.println("Service Rent of Amazon is 400");
                        System.out.println("Do you want to buy or not ? (YES/NO)");

                        String response = sc.nextLine();

                        if (response == "yes" || response == "Yes" || response == "YES") {
                            if (player.getPlayerCurrentBal(i) >= 6000) {
                                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 6000, i);
                                player.setPlayerSharesOwned(i, 2, company.getCompanyNoOfShares(2));
                                company.setCompanyOwner(2, i);
                                player.setPlayerCompaniesOwned(i, 1);
                                System.out.println(" Congratulations !!!");
                                System.out.println(" You have bought Amazon");
                                System.out.println("Player " + i + "'s current Balance = ");
                                player.getPlayerCurrentBal(i);
                            } else {
                                System.out.println(" You don't have sufficient balance to buy Amazon");
                                System.out.println(
                                        " Do u want to sell your shares ? Remember , you will have to sell all your shares ,you will not be allowed to sell a particular amount of shares ( Enter yes / no )");

                                String res = sc.nextLine();

                                if (res == "yes" || res == "Yes" || res == "YES") {
                                    func.sell(i);
                                    if (player.getPlayerCurrentBal(i) >= 6000) {
                                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 6000, i);
                                        player.setPlayerSharesOwned(i, 2, company.getCompanyNoOfShares(2));
                                        company.setCompanyOwner(2, i);
                                        player.setPlayerCompaniesOwned(i, 1);
                                        System.out.println(" Congratulations !!!");
                                        System.out.println(" You have bought Amazon");
                                        System.out.println("Player " + i + "'s current Balance = ");
                                        player.getPlayerCurrentBal(i);
                                    } else {
                                        System.out.println(" You still don't have enough balance");
                                        System.out.println(" Come back soon");
                                    }
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
                            func.sell(i);
                            if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(2)) {
                                System.out.println("Amazon is owned by " + player.getPlayerName(owner));

                                System.out.println(
                                        " You will have to pay $" + company.getCompanyServiceRent(2) + " as rent");
                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(2), i);

                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(2), owner);
                                func.updateServiceRent(2);

                            } else {
                                func.bankRupt(player.getPlayerName(i));
                            }

                        }

                        
                    }
                    break;
                }
                case 3: {
                    func.stockMarket(i);

                    break;
                }
                case 4: {
                    func.fraud(i);
                    break;

                }
                case 5: {
                    System.out.println("You have reached | TESLA |");
                    if (company.getCompanyOwner(5) == 0) {

                        System.out.println("Cost of Tesla is 5500 dollars only");
                        System.out.println("You will own a total of 45 shares of the company ");
                        System.out.println(
                                "Each share cost is 100 and will increase 10% whenever other players arrives on the same ");
                        System.out.println("Service Rent of Tesla is 450");
                        System.out.println("Do you want to buy or not ? (YES/NO)");

                        String response = sc.nextLine();

                        if (response == "yes" || response == "Yes" || response == "YES") {
                            if (player.getPlayerCurrentBal(i) >= 5500) {
                                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 5500, i);
                                player.setPlayerSharesOwned(i, 5, company.getCompanyNoOfShares(5));
                                company.setCompanyOwner(5, i);
                                player.setPlayerCompaniesOwned(i, 4);
                                System.out.println(" Congratulations !!!");
                                System.out.println(" You have bought Tesla");
                                System.out.println("Player " + i + "'s current Balance = ");
                                player.getPlayerCurrentBal(i);
                            } else {
                                System.out.println(" You don't have sufficient balance to buy Tesla");
                                System.out.println(
                                        "Do u want to sell your shares ? Remember , you will have to sell all your shares ,you will not be allowed to sell a particular amount of shares ( Enter yes / no )");

                                String res = sc.nextLine();

                                if (res == "yes" || res == "Yes" || res == "YES") {
                                    func.sell(i);
                                    if (player.getPlayerCurrentBal(i) >= 5500) {
                                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 5500, i);
                                        player.setPlayerSharesOwned(i, 5, company.getCompanyNoOfShares(5));
                                        company.setCompanyOwner(5, i);
                                        player.setPlayerCompaniesOwned(i, 4);
                                        System.out.println(" Congratulations !!!");
                                        System.out.println(" You have bought Tesla");
                                        System.out.println("Player " + i + "'s current Balance = ");
                                        player.getPlayerCurrentBal(i);
                                    } else {
                                        System.out.println(" You still don't have enough balance");
                                        System.out.println(" Come back soon");
                                    }
                                }
                            }
                        } else {
                            System.out.println(" Continue the game");
                            System.out.println(" Thanks for visiting Tesla");
                        }

                    } else {
                        int owner = company.getCompanyOwner(5);

                        if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(5)) {
                            System.out.println("Tesla is owned by " + player.getPlayerName(owner));

                            System.out
                                    .println(" You will have to pay $" + company.getCompanyServiceRent(5) + " as rent");
                            player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(5),
                                    i);

                            player.setPlayerCurrentBal(
                                    player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(5), owner);
                            func.updateServiceRent(5);

                        } else {
                            func.sell(i);
                            if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(5)) {
                                System.out.println("Tesla is owned by " + player.getPlayerName(owner));

                                System.out.println(
                                        "You will have to pay $" + company.getCompanyServiceRent(5) + " as rent");
                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(5), i);

                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(5), owner);
                                func.updateServiceRent(5);

                            } else {
                                func.bankRupt(player.getPlayerName(i));
                            }

                        }

                        
                    }
                    break;
                }

                case 6: {
                    System.out.println("You have reached | MICROSOFT |");
                    if (company.getCompanyOwner(6) == 0) {

                        System.out.println("Cost of Microsoft is 5000 dollars only");
                        System.out.println("You will own a total of 30 shares of the company ");
                        System.out.println(
                                "Each share cost is 100 and will increase 10% whenever other players arrives on the same ");
                        System.out.println("Service Rent of Microsoft is 300");
                        System.out.println("Do you want to buy or not ? ( YES/NO )");

                        String response = sc.nextLine();

                        if (response == "yes" || response == "Yes" || response == "YES") {
                            if (player.getPlayerCurrentBal(i) >= 6000) {
                                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 6000, i);
                                player.setPlayerSharesOwned(i, 6, company.getCompanyNoOfShares(6));
                                company.setCompanyOwner(6, i);
                                player.setPlayerCompaniesOwned(i, 5);
                                System.out.println(" Congratulations !!!");
                                System.out.println(" You have bought Microsoft");
                                System.out.println("Player " + i + "'s current Balance = ");
                                player.getPlayerCurrentBal(i);
                            } else {
                                System.out.println(" You don't have sufficient balance to buy Microsoft");
                                System.out.println(
                                        " Do u want to sell your shares ? Remember , you will have to sell all your shares ,you will not be allowed to sell a particular amount of shares ( Enter yes / no )");

                                String res = sc.nextLine();

                                if (res == "yes" || res == "Yes" || res == "YES") {
                                    func.sell(i);
                                    if (player.getPlayerCurrentBal(i) >= 5000) {
                                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 5000, i);
                                        player.setPlayerSharesOwned(i, 6, company.getCompanyNoOfShares(6));
                                        company.setCompanyOwner(6, i);
                                        player.setPlayerCompaniesOwned(i, 5);
                                        System.out.println(" Congratulations !!!");
                                        System.out.println(" You have bought Microsoft");
                                        System.out.println("Player " + i + "'s current Balance = ");
                                        player.getPlayerCurrentBal(i);
                                    } else {
                                        System.out.println(" You still don't have enough balance");
                                        System.out.println(" Come back soon");
                                    }
                                }
                            }
                        } else {
                            System.out.println(" Continue the game");
                            System.out.println(" Thanks for visiting Microsoft");
                        }

                    } else {
                        int owner = company.getCompanyOwner(6);

                        if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(6)) {
                            System.out.println("Microsoft is owned by " + player.getPlayerName(owner));

                            System.out
                                    .println(" You will have to pay $" + company.getCompanyServiceRent(6) + " as rent");
                            player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(6),
                                    i);

                            player.setPlayerCurrentBal(
                                    player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(6), owner);
                            func.updateServiceRent(6);

                        } else {
                            func.sell(i);
                            if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(6)) {
                                System.out.println("Microsoft is owned by " + player.getPlayerName(owner));

                                System.out.println(
                                        " You will have to pay $" + company.getCompanyServiceRent(6) + " as rent");
                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(6), i);

                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(6), owner);
                                func.updateServiceRent(6);

                            } else {
                                func.bankRupt(player.getPlayerName(i));
                            }

                        }

                        
                    }
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

                    if (company.getCompanyOwner(9) == 0) {

                        System.out.println("Cost of Google is 10000 dollars only");
                        System.out.println("You will own a total of 8 shares of the company ");
                        System.out.println(
                                "Each share cost is 1000 and will increase 5% whenever other players arrives on the same ");
                        System.out.println("Service Rent of Google is 400");
                        System.out.println("Do you want to buy or not ? ( YES/NO )");

                        String response = sc.nextLine();

                        if (response == "yes" || response == "Yes" || response == "YES") {
                            if (player.getPlayerCurrentBal(i) >= 10000) {
                                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 10000, i);
                                player.setPlayerSharesOwned(i, 9, company.getCompanyNoOfShares(9));
                                company.setCompanyOwner(9, i);
                                player.setPlayerCompaniesOwned(i, 8);
                                System.out.println(" Congratulations !!!");
                                System.out.println(" You have bought Google");
                                System.out.println("Player " + i + "'s current Balance = ");
                                player.getPlayerCurrentBal(i);
                            } else {
                                System.out.println(" You don't have sufficient balance to buy Google");
                                System.out.println(
                                        " Do u want to sell your shares ? Remember , you will have to sell all your shares ,you will not be allowed to sell a particular amount of shares ( Enter yes / no )");

                                String res = sc.nextLine();

                                if (res == "yes" || res == "Yes" || res == "YES") {
                                    func.sell(i);
                                    if (player.getPlayerCurrentBal(i) >= 10000) {
                                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 10000, i);
                                        player.setPlayerSharesOwned(i, 9, company.getCompanyNoOfShares(9));
                                        company.setCompanyOwner(9, i);
                                        player.setPlayerCompaniesOwned(i, 8);
                                        System.out.println(" Congratulations !!!");
                                        System.out.println(" You have bought Google");
                                        System.out.println("Player " + i + "'s current Balance = ");
                                        player.getPlayerCurrentBal(i);
                                    } else {
                                        System.out.println(" You still don't have enough balance");
                                        System.out.println(" Come back soon");
                                    }
                                }
                            }
                        } else {
                            System.out.println(" Continue the game");
                            System.out.println(" Thanks for visiting Google");
                        }

                    } else {
                        int owner = company.getCompanyOwner(9);

                        if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(9)) {
                            System.out.println("Google is owned by " + player.getPlayerName(owner));

                            System.out
                                    .println(" You will have to pay $" + company.getCompanyServiceRent(9) + " as rent");
                            player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(9),
                                    i);

                            player.setPlayerCurrentBal(
                                    player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(9), owner);
                            func.updateServiceRent(9);

                        } else {
                            func.sell(i);
                            if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(9)) {
                                System.out.println("Google is owned by " + player.getPlayerName(owner));

                                System.out.println(
                                        " You will have to pay $" + company.getCompanyServiceRent(9) + " as rent");
                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(9), i);

                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(9), owner);
                                func.updateServiceRent(9);

                            } else {
                                func.bankRupt(player.getPlayerName(i));
                            }

                        }

                        
                    }
                    break;
                }
                case 10: {
                    System.out.println("You have reached | ISRO |");
                    if (company.getCompanyOwner(10) == 0) {

                        System.out.println("Cost of ISRO is 7000 dollars only");
                        System.out.println("You will own a total of 10 shares of the company ");
                        System.out.println(
                                "Each share cost is 500 and will increase 10% whenever other players arrives on the same ");
                        System.out.println("Service Rent of ISRO is 500");
                        System.out.println("Do you want to buy or not ?(YES/NO)");

                        String response = sc.nextLine();

                        if (response == "yes" || response == "Yes" || response == "YES") {
                            if (player.getPlayerCurrentBal(i) >= 7000) {
                                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 7000, i);
                                player.setPlayerSharesOwned(i, 10, company.getCompanyNoOfShares(10));
                                company.setCompanyOwner(10, i);
                                player.setPlayerCompaniesOwned(i, 9);
                                System.out.println(" Congratulations !!!");
                                System.out.println(" You have bought ISRO");
                                System.out.println("Player " + i + "'s current Balance = ");
                                player.getPlayerCurrentBal(i);
                            } else {
                                System.out.println(" You don't have sufficient balance to buy ISRO");
                                System.out.println(
                                        " Do u want to sell your shares ? Remember , you will have to sell all your shares ,you will not be allowed to sell a particular amount of shares ( Enter yes / no )");

                                String res = sc.nextLine();

                                if (res == "yes" || res == "Yes" || res == "YES") {
                                    func.sell(i);
                                    if (player.getPlayerCurrentBal(i) >= 7000) {
                                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 7000, i);
                                        player.setPlayerSharesOwned(i, 10, company.getCompanyNoOfShares(10));
                                        company.setCompanyOwner(10, i);
                                        player.setPlayerCompaniesOwned(i, 9);
                                        System.out.println(" Congratulations !!!");
                                        System.out.println(" You have bought ISRO");
                                        System.out.println("Player " + i + "'s current Balance = ");
                                        player.getPlayerCurrentBal(i);
                                    } else {
                                        System.out.println(" You still don't have enough balance");
                                        System.out.println(" Come back soon");
                                    }
                                }
                            }
                        } else {
                            System.out.println(" Continue the game");
                            System.out.println(" Thanks for visiting ISRO");
                        }

                    } else {
                        int owner = company.getCompanyOwner(10);

                        if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(10)) {
                            System.out.println("ISRO is owned by " + player.getPlayerName(owner));

                            System.out.println(
                                    " You will have to pay $" + company.getCompanyServiceRent(10) + " as rent");
                            player.setPlayerCurrentBal(
                                    player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(10), i);

                            player.setPlayerCurrentBal(
                                    player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(10), owner);
                            func.updateServiceRent(10);

                        } else {
                            func.sell(i);
                            if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(10)) {
                                System.out.println("ISRO is owned by " + player.getPlayerName(owner));

                                System.out.println(
                                        " You will have to pay $" + company.getCompanyServiceRent(10) + " as rent");
                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(10), i);

                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(10), owner);
                                func.updateServiceRent(10);

                            } else {
                                func.bankRupt(player.getPlayerName(i));
                            }

                        }

                        
                    }
                    break;
                }
                case 11: {
                    System.out.println("You have reached | Facebook |");
                    if (company.getCompanyOwner(11) == 0) {

                        System.out.println("Cost of Facebook is 6000 dollars only");
                        System.out.println("You will own a total of 30 shares of the company ");
                        System.out.println(
                                "Each share cost is 200 and will increase 10% whenever other players arrives on the same ");
                        System.out.println("Service Rent of Facebook is 600");
                        System.out.println("Do you want to buy or not ?(YES/NO)");

                        String response = sc.nextLine();

                        if (response == "yes" || response == "Yes" || response == "YES") {
                            if (player.getPlayerCurrentBal(i) >= 6000) {
                                player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 6000, i);
                                player.setPlayerSharesOwned(i, 11, company.getCompanyNoOfShares(11));
                                company.setCompanyOwner(11, i);
                                player.setPlayerCompaniesOwned(i, 10);
                                System.out.println(" Congratulations !!!");
                                System.out.println(" You have bought Facebook");
                                System.out.println("Player " + i + "'s current Balance = ");
                                player.getPlayerCurrentBal(i);
                            } else {
                                System.out.println(" You don't have sufficient balance to buy Facebook");
                                System.out.println(
                                        "Do u want to sell your shares ? Remember , you will have to sell all your shares ,you will not be allowed to sell a particular amount of shares ( Enter yes / no )");

                                String res = sc.nextLine();

                                if (res == "yes" || res == "Yes" || res == "YES") {
                                    func.sell(i);
                                    if (player.getPlayerCurrentBal(i) >= 6000) {
                                        player.setPlayerCurrentBal(player.getPlayerCurrentBal(i) - 6000, i);
                                        player.setPlayerSharesOwned(i, 11, company.getCompanyNoOfShares(11));
                                        company.setCompanyOwner(11, i);
                                        player.setPlayerCompaniesOwned(i, 10);
                                        System.out.println(" Congratulations !!!");
                                        System.out.println(" You have bought Facebook");
                                        System.out.println("Player " + i + "'s current Balance = ");
                                        player.getPlayerCurrentBal(i);
                                    } else {
                                        System.out.println(" You still don't have enough balance");
                                        System.out.println(" Come back soon");
                                    }
                                }
                            }
                        } else {
                            System.out.println(" Continue the game");
                            System.out.println(" Thanks for visiting Amazon");
                        }

                    } else {
                        int owner = company.getCompanyOwner(11);

                        if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(11)) {
                            System.out.println("Facebook is owned by " + player.getPlayerName(owner));

                            System.out.println(
                                    " You will have to pay $" + company.getCompanyServiceRent(11) + " as rent");
                            player.setPlayerCurrentBal(
                                    player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(11), i);

                            player.setPlayerCurrentBal(
                                    player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(11), owner);
                            func.updateServiceRent(11);

                        } else {
                            func.sell(i);
                            if (player.getPlayerCurrentBal(i) >= company.getCompanyServiceRent(2)) {
                                System.out.println("Facebook is owned by " + player.getPlayerName(owner));

                                System.out.println(
                                        " You will have to pay $" + company.getCompanyServiceRent(11) + " as rent");
                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(i) - company.getCompanyServiceRent(11), i);

                                player.setPlayerCurrentBal(
                                        player.getPlayerCurrentBal(owner) + company.getCompanyServiceRent(11), owner);
                                func.updateServiceRent(11);

                            } else {
                                func.bankRupt(player.getPlayerName(i));
                            }

                        }

                        
                    }
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