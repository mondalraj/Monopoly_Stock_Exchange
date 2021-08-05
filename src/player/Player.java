package player;

public class Player {
    Player1 p1 = new Player1();
    Player2 p2 = new Player2();
    Player3 p3 = new Player3();

    public void setPlayerName(String name, int n) {

        if (n == 1) {
            p1.setName(name);
        } else if (n == 2) {
            p2.setName(name);
        } else if (n == 3) {
            p3.setName(name);
        }

    }

    public void getPlayerName(int n) {
        if (n == 1) {
            System.out.println("Name of Player 1 is : " + p1.getName());

        } else if (n == 2) {
            System.out.println("Name of Player 2 is : " + p2.getName());

        } else {
            System.out.println("Name of Player 3 is : " + p3.getName());

        }
    }

    public void setPlayerCurrentBal(int bal, int n){
        if(n==1){
            p1.setCurrentBal(bal);
        } else if(n==2){
            p2.setCurrentBal(bal);
        } else if(n==3){
            p3.setCurrentBal(bal);
        }
    }

    public void getPlayerCurrentBal(int n){
        if (n == 1) {
            System.out.println("Current Balance of Player 1 is : " + p1.getCurrentBal());

        } else if (n == 2) {
            System.out.println("Current Balance of Player 2 is : " + p2.getCurrentBal());

        } else {
            System.out.println("Current Balance of Player 3 is : " + p3.getCurrentBal());

        }
    }
}

class Player1 {
    String name;
    int currentBal;

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentBal(int bal){
        this.currentBal = bal;
    }

    public int getCurrentBal(){
        return this.currentBal;
    }
}

class Player2 {
    String name;
    int currentBal;


    public void setName(String name2) {
        this.name = name2;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentBal(int bal){
        this.currentBal = bal;
    }

    public int getCurrentBal(){
        return this.currentBal;
    }
}

class Player3 {
    String name;
    int currentBal;


    public void setName(String name3) {
        this.name = name3;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentBal(int bal){
        this.currentBal = bal;
    }

    public int getCurrentBal(){
        return this.currentBal;
    }
}