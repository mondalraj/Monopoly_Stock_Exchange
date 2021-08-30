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

    public void setPlayerCompaniesOwned(int p, int index) {
        if (p == 1) {
            p1.setCompaniesOwned(index, true);
        } else if (p == 2) {
            p2.setCompaniesOwned(index, true);
        } else if (p == 3) {
            p3.setCompaniesOwned(index, true);
        }
    }

    boolean[] companies;
    public boolean[] getPlayerCompaniesOwned(int p) {
        if (p == 1) {
            companies = p1.getCompaniesOwned();
        } else if (p == 2) {
            companies = p2.getCompaniesOwned();
        } else if (p == 3) {
            companies = p3.getCompaniesOwned();
        }
        return companies;
    }

    public void setPlayerCurrentBal(float bal, int p) {
        if (p == 1) {
            p1.setCurrentBal(bal);
        } else if (p == 2) {
            p2.setCurrentBal(bal);
        } else if (p == 3) {
            p3.setCurrentBal(bal);
        }
    }

    float balance;

    public float getPlayerCurrentBal(int p) {
        if (p == 1) {
            balance = p1.getCurrentBal();

        } else if (p == 2) {
            balance = p2.getCurrentBal();

        } else {
            balance = p3.getCurrentBal();

        }
        return balance;
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

    public void setPlayerCurrentPosition(int pos, int p) {
        if (p == 1) {
            p1.setCurrentPosition(pos);
        } else if (p == 2) {
            p2.setCurrentPosition(pos);
        } else if (p == 3) {
            p3.setCurrentPosition(pos);
        }
    }

    public void excessBalance(int p) {
        if (getPlayerCurrentBal(p) >= 150) {
            System.out.println("Since your current balance is more than 20000,So you won");
        }
    }

    public void setPlayerSharesOwned(int p, int c, int s) {
        if (p == 1) {
            switch (c) {
                case 2: {
                    p1.setAmazonShares(s);
                    break;
                }
                case 5: {
                    p1.setTeslaShares(s);
                    break;
                }
                case 6: {
                    p1.setMicrosoftShares(s);
                    break;
                }
                case 9: {
                    p1.setGoogleShares(s);
                    break;
                }
                case 10: {
                    p1.setIsroShares(s);
                    break;
                }
                case 11: {
                    p1.setFacebookShares(s);
                    break;
                }
            }
        } else if (p == 2) {
            switch (c) {
                case 2: {
                    p2.setAmazonShares(s);
                    break;
                }
                case 5: {
                    p2.setTeslaShares(s);
                    break;
                }
                case 6: {
                    p2.setMicrosoftShares(s);
                    break;
                }
                case 9: {
                    p2.setGoogleShares(s);
                    break;
                }
                case 10: {
                    p2.setIsroShares(s);
                    break;
                }
                case 11: {
                    p2.setFacebookShares(s);
                    break;
                }
            }
        } else if (p == 3) {
            switch (c) {
                case 2: {
                    p3.setAmazonShares(s);
                    break;
                }
                case 5: {
                    p3.setTeslaShares(s);
                    break;
                }
                case 6: {
                    p3.setMicrosoftShares(s);
                    break;
                }
                case 9: {
                    p3.setGoogleShares(s);
                    break;
                }
                case 10: {
                    p3.setIsroShares(s);
                    break;
                }
                case 11: {
                    p3.setFacebookShares(s);
                    break;
                }
            }

        }
    }

    int shares;

    public int getPlayerSharesOwned(int p, int c) {
        if (p == 1) {
            switch (c) {
                case 2: {
                    shares = p1.getAmazonShares();
                    break;
                }
                case 5: {
                    shares = p1.getTeslaShares();
                    break;
                }
                case 6: {
                    shares = p1.getMicrosoftShares();
                    break;
                }
                case 9: {
                    shares = p1.getGoogleShares();
                    break;
                }
                case 10: {
                    shares = p1.getIsroShares();
                    break;
                }
                case 11: {
                    shares = p1.getFacebookShares();
                    break;
                }
            }
        } else if (p == 2) {
            switch (c) {
                case 2: {
                    shares = p2.getAmazonShares();
                    break;
                }
                case 5: {
                    shares = p2.getTeslaShares();
                    break;
                }
                case 6: {
                    shares = p2.getMicrosoftShares();
                    break;
                }
                case 9: {
                    shares = p2.getGoogleShares();
                    break;
                }
                case 10: {
                    shares = p2.getIsroShares();
                    break;
                }
                case 11: {
                    shares = p2.getFacebookShares();
                    break;
                }
            }
        } else if (p == 3) {
            switch (c) {
                case 2: {
                    shares = p3.getAmazonShares();
                    break;
                }
                case 5: {
                    shares = p3.getTeslaShares();
                    break;
                }
                case 6: {
                    shares = p3.getMicrosoftShares();
                    break;
                }
                case 9: {
                    shares = p3.getGoogleShares();
                    break;
                }
                case 10: {
                    shares = p3.getIsroShares();
                    break;
                }
                case 11: {
                    shares = p3.getFacebookShares();
                    break;
                }
            }

        }
        return shares;
    }
}

class Player1 {
    String name;
    float currentBal = 15000;
    int currentPosition = 1;
    boolean companiesOwned[] = new boolean[12];
    int amazonShares = 0;
    int teslaShares = 0;
    int microsoftShares = 0;
    int googleShares = 0;
    int isroShares = 0;
    int facebookShares = 0;

    public void setAmazonShares(int shares) {
        this.amazonShares = shares;
    }

    public void setTeslaShares(int shares) {
        this.teslaShares = shares;
    }

    public void setMicrosoftShares(int shares) {
        this.microsoftShares = shares;
    }

    public void setGoogleShares(int shares) {
        this.googleShares = shares;
    }

    public void setIsroShares(int shares) {
        this.isroShares = shares;
    }

    public void setFacebookShares(int shares) {
        this.facebookShares = shares;
    }

    public int getAmazonShares() {
        return amazonShares;
    }

    public int getTeslaShares() {
        return teslaShares;
    }

    public int getMicrosoftShares() {
        return microsoftShares;
    }

    public int getGoogleShares() {
        return googleShares;
    }

    public int getIsroShares() {
        return isroShares;
    }

    public int getFacebookShares() {
        return facebookShares;
    }

    public void setCompaniesOwned(int index, boolean owned) {
        this.companiesOwned[index] = owned;
    }

    public boolean[] getCompaniesOwned() {
        return this.companiesOwned;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentBal(float bal) {
        this.currentBal = bal;
    }

    public float getCurrentBal() {
        return this.currentBal;
    }

    public void setCurrentPosition(int pos) {
        this.currentPosition = pos;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }
}

class Player2 {
    String name;
    float currentBal = 15000;
    int currentPosition = 1;
    boolean companiesOwned[] = new boolean[12];
    int amazonShares = 0;
    int teslaShares = 0;
    int microsoftShares = 0;
    int googleShares = 0;
    int isroShares = 0;
    int facebookShares = 0;

    public void setAmazonShares(int shares) {
        this.amazonShares = shares;
    }

    public void setTeslaShares(int shares) {
        this.teslaShares = shares;
    }

    public void setMicrosoftShares(int shares) {
        this.microsoftShares = shares;
    }

    public void setGoogleShares(int shares) {
        this.googleShares = shares;
    }

    public void setIsroShares(int shares) {
        this.isroShares = shares;
    }

    public void setFacebookShares(int shares) {
        this.facebookShares = shares;
    }

    public int getAmazonShares() {
        return amazonShares;
    }

    public int getTeslaShares() {
        return teslaShares;
    }

    public int getMicrosoftShares() {
        return microsoftShares;
    }

    public int getGoogleShares() {
        return googleShares;
    }

    public int getIsroShares() {
        return isroShares;
    }

    public int getFacebookShares() {
        return facebookShares;
    }

    public void setCompaniesOwned(int index, boolean owned) {
        this.companiesOwned[index] = owned;
    }

    public boolean[] getCompaniesOwned() {
        return this.companiesOwned;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentBal(float bal) {
        this.currentBal = bal;
    }

    public float getCurrentBal() {
        return this.currentBal;
    }

    public void setCurrentPosition(int pos) {
        this.currentPosition = pos;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }
}

class Player3 {
    String name;
    float currentBal = 15000;
    int currentPosition = 1;
    boolean companiesOwned[] = new boolean[12];
    int amazonShares = 0;
    int teslaShares = 0;
    int microsoftShares = 0;
    int googleShares = 0;
    int isroShares = 0;
    int facebookShares = 0;

    public void setAmazonShares(int shares) {
        this.amazonShares = shares;
    }

    public void setTeslaShares(int shares) {
        this.teslaShares = shares;
    }

    public void setMicrosoftShares(int shares) {
        this.microsoftShares = shares;
    }

    public void setGoogleShares(int shares) {
        this.googleShares = shares;
    }

    public void setIsroShares(int shares) {
        this.isroShares = shares;
    }

    public void setFacebookShares(int shares) {
        this.facebookShares = shares;
    }

    public int getAmazonShares() {
        return amazonShares;
    }

    public int getTeslaShares() {
        return teslaShares;
    }

    public int getMicrosoftShares() {
        return microsoftShares;
    }

    public int getGoogleShares() {
        return googleShares;
    }

    public int getIsroShares() {
        return isroShares;
    }

    public int getFacebookShares() {
        return facebookShares;
    }

    public void setCompaniesOwned(int index, boolean owned) {
        this.companiesOwned[index] = owned;
    }

    public boolean[] getCompaniesOwned() {
        return this.companiesOwned;
    }

    public void setName(String name3) {
        this.name = name3;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentBal(float bal) {
        this.currentBal = bal;
    }

    public float getCurrentBal() {
        return this.currentBal;
    }

    public void setCurrentPosition(int pos) {
        this.currentPosition = pos;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }
}