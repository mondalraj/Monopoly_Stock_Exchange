package functions;

import java.util.*;

public class Function {
    public int welcome() {
        System.out.println("Welcome");
        return 0;
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

    public void quit(){
        System.out.println("You Lose the game");
        System.out.println("Better Luck Next Time!");
    }
}
