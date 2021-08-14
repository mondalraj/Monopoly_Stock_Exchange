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

    String name;
    public String getPlayerName(int p) {
        if (p == 1) {
            name = p1.getName();

        } else if (p == 2) {
            name = p2.getName();

        } else if (p == 3) {
            name = p3.getName();

        }
        return name;
    }

    public void setPlayerCompaniesOwned(int p, int index){
        if (p == 1) {
            p1.setCompaniesOwned(index, true);
        } else if (p == 2) {
            p2.setCompaniesOwned(index, true);
        } else if (p == 3) {
            p3.setCompaniesOwned(index, true);
        }
    }

    public void setPlayerSharesOwned(int p, int index, int shares){
        if (p == 1) {
            p1.setSharesOwned(index, shares);
        } else if (p == 2) {
            p2.setSharesOwned(index, shares);
        } else if (p == 3) {
            p3.setSharesOwned(index, shares);
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

    int position;
    public int getPlayerCurrentPosition(int p) {
        if (p == 1) {
            position = p1.getCurrentPosition();
            
        } else if (p == 2) {
            position = p2.getCurrentPosition();
            
        } else {
            position = p3.getCurrentPosition();

        }
        return position;
    }

    public void setPlayerCurrentPosition(int pos, int p){
        if (p == 1) {
            p1.setCurrentPosition(pos);
        } else if (p == 2) {
            p2.setCurrentPosition(pos);
        } else if (p == 3) {
            p3.setCurrentPosition(pos);
        }
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
    int currentPosition = 1;
    boolean companiesOwned[] = new boolean[12];
    int sharesOwned[] = new int[12];
    
    public void setCompaniesOwned(int index, boolean owned){
        this.companiesOwned[index] = owned;
    }

    public void setSharesOwned(int index, int shares){
        this.sharesOwned[index] = shares;
    }

    public boolean[] getCompaniesOwned(){
        return this.companiesOwned;
    }

    public int[] getSharesOwned(){
        return this.sharesOwned;
    }

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

    public void setCurrentPosition(int pos){
        this.currentPosition = pos;
    }
    
    public int getCurrentPosition(){
        return this.currentPosition;
    }
}

class Player2 {
    String name;
    float currentBal;
    int currentPosition = 1;
    boolean companiesOwned[] = new boolean[12];
    int sharesOwned[] = new int[12];
    
    public void setCompaniesOwned(int index, boolean owned){
        this.companiesOwned[index] = owned;
    }

    public void setSharesOwned(int index, int shares){
        this.sharesOwned[index] = shares;
    }

    public boolean[] getCompaniesOwned(){
        return this.companiesOwned;
    }

    public int[] getSharesOwned(){
        return this.sharesOwned;
    }
    
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
    
    public void setCurrentPosition(int pos){
        this.currentPosition = pos;
    }
    
    public int getCurrentPosition(){
        return this.currentPosition;
    }
}

class Player3 {
    String name;
    float currentBal;
    int currentPosition = 1;
    boolean companiesOwned[] = new boolean[12];
    int sharesOwned[] = new int[12];
    
    public void setCompaniesOwned(int index, boolean owned){
        this.companiesOwned[index] = owned;
    }

    public void setSharesOwned(int index, int shares){
        this.sharesOwned[index] = shares;
    }

    public boolean[] getCompaniesOwned(){
        return this.companiesOwned;
    }

    public int[] getSharesOwned(){
        return this.sharesOwned;
    }
    
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

    public void setCurrentPosition(int pos){
        this.currentPosition = pos;
    }

    public int getCurrentPosition(){
        return this.currentPosition;
    }
}