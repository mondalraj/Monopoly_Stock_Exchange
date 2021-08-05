package player;

public class Player {
    Player1 p1 = new Player1();
    Player2 p2 = new Player2();
    Player3 p3 = new Player3();

    public void setPlayerName(String name, int p) {

        if (p == 1) {
            p1.setName(name);
        } else if (p == 2) {
            p2.setName(name);
        } else if (p == 3) {
            p3.setName(name);
        }

    }

    public void getPlayerName(int p) {
        if (p == 1) {
            System.out.println("Name of Player 1 is : " + p1.getName());

        } else if (p == 2) {
            System.out.println("Name of Player 2 is : " + p2.getName());

        } else if (p == 3) {
            System.out.println("Name of Player 3 is : " + p3.getName());

        }
    }

    public void setPlayerCurrentBal(int bal, int p) {
        if (p == 1) {
            p1.setCurrentBal(bal);
        } else if (p == 2) {
            p2.setCurrentBal(bal);
        } else if (p == 3) {
            p3.setCurrentBal(bal);
        }
    }

    float result;
    public float getPlayerCurrentBal(int p) {
        if (p == 1) {
            result = p1.getCurrentBal();
            
        } else if (p == 2) {
            result = p2.getCurrentBal();
            
        } else {
            result = p3.getCurrentBal();

        }
        return result;
    }

    public void excessBalance(int p){
        if (getPlayerCurrentBal(p)>=20000){
            System.out.println("Since your current balance is more than 20000,So you won");
        }
    }
}

class Player1 {
    String name;
    float currentBal;

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentBal(int bal) {
        this.currentBal = bal;
    }

    public float getCurrentBal() {
        return this.currentBal;
    }
}

class Player2 {
    String name;
    float currentBal;

    public void setName(String name2) {
        this.name = name2;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentBal(int bal) {
        this.currentBal = bal;
    }

    public float getCurrentBal() {
        return this.currentBal;
    }
}

class Player3 {
    String name;
    float currentBal;

    public void setName(String name3) {
        this.name = name3;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentBal(int bal) {
        this.currentBal = bal;
    }

    public float getCurrentBal() {
        return this.currentBal;
    }
}