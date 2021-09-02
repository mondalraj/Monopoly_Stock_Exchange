package company;

public class Company {
    Amazon a2 = new Amazon();
    Tesla t5 = new Tesla();
    Microsoft m6 = new Microsoft();
    Google g9 = new Google();
    ISRO i10 = new ISRO();
    Facebook f11 = new Facebook();

    public void setCompanyOwner(int n, int p) {
        if (n == 2) {
            a2.setOwner(p);
        } else if (n == 5) {
            t5.setOwner(p);

        } else if (n == 6) {
            m6.setOwner(p);

        } else if (n == 9) {
            g9.setOwner(p);

        } else if (n == 10) {
            i10.setOwner(p);

        } else if (n == 11) {
            f11.setOwner(p);

        }
    }

    int owner;

    public int getCompanyOwner(int n) {
        if (n == 2) {
            owner = a2.getOwner();
        } else if (n == 5) {
            owner = t5.getOwner();
        } else if (n == 6) {
            owner = m6.getOwner();
        } else if (n == 9) {
            owner = g9.getOwner();
        } else if (n == 10) {
            owner = i10.getOwner();
        } else if (n == 11) {
            owner = f11.getOwner();
        }
        return owner;
    }

    int companyCost;

    public int getCompanyCost(int n) {
        if (n == 2) {
            companyCost = a2.getCost();
        } else if (n == 5) {
            companyCost = t5.getCost();
        } else if (n == 6) {
            companyCost = m6.getCost();
        } else if (n == 9) {
            companyCost = g9.getCost();
        } else if (n == 10) {
            companyCost = i10.getCost();
        } else if (n == 11) {
            companyCost = f11.getCost();

        }
        return companyCost;
    }

    public void setCompanySharePrice(float d, int n) {
        if (n == 2) {
            a2.setSharePrice((float) d);
        } else if (n == 5) {
            t5.setSharePrice((float) d);

        } else if (n == 6) {
            m6.setSharePrice((float) d);

        } else if (n == 9) {
            g9.setSharePrice((float) d);

        } else if (n == 10) {
            i10.setSharePrice((float) d);

        } else if (n == 11) {
            f11.setSharePrice((float) d);

        }
    }

    float sharePrice;

    public float getCompanySharePrice(int n) {
        if (n == 2) {
            sharePrice = a2.getSharePrice();
        } else if (n == 5) {
            sharePrice = t5.getSharePrice();

        } else if (n == 6) {
            sharePrice = m6.getSharePrice();

        } else if (n == 9) {
            sharePrice = g9.getSharePrice();

        } else if (n == 10) {
            sharePrice = i10.getSharePrice();

        } else if (n == 11) {
            sharePrice = f11.getSharePrice();

        }
        return sharePrice;
    }

    int noOfShares;

    public int getCompanyNoOfShares(int n) {
        if (n == 2) {
            noOfShares = a2.getNoOfShares();
        } else if (n == 5) {
            noOfShares = t5.getNoOfShares();

        } else if (n == 6) {

            noOfShares = m6.getNoOfShares();

        } else if (n == 9) {
            noOfShares = g9.getNoOfShares();

        } else if (n == 10) {
            noOfShares = i10.getNoOfShares();

        } else if (n == 11) {
            noOfShares = f11.getNoOfShares();

        }
        return noOfShares;
    }

    public void setCompanyServiceRent(float rent, int n) {
        if (n == 2) {
            a2.setServiceRent(rent);
        } else if (n == 5) {
            t5.setServiceRent(rent);

        } else if (n == 6) {
            m6.setServiceRent(rent);

        } else if (n == 9) {
            g9.setServiceRent(rent);

        } else if (n == 10) {
            i10.setServiceRent(rent);

        } else if (n == 11) {
            f11.setServiceRent(rent);

        }
    }

    float rent;

    public float getCompanyServiceRent(int n) {
        if (n == 2) {
            rent = a2.getServiceRent();
        } else if (n == 5) {
            rent = t5.getServiceRent();

        } else if (n == 6) {
            rent = m6.getServiceRent();

        } else if (n == 9) {
            rent = g9.getServiceRent();

        } else if (n == 10) {
            rent = i10.getServiceRent();

        } else if (n == 11) {
            rent = f11.getServiceRent();

        }
        return rent;
    }
}

class Amazon {
    int cost = 6000;
    float sharePrice = 200;
    int noOfShares = 30;
    float serviceRent = 400;
    int owner = 0;

    public void setOwner(int p) {
        this.owner = p;
    }

    public int getOwner() {
        return this.owner;
    }

    public int getCost() {
        return this.cost;
    }

    public void setSharePrice(float price) {
        this.sharePrice = price;
    }

    public float getSharePrice() {
        return this.sharePrice;
    }

    public int getNoOfShares() {
        return this.noOfShares;
    }

    public void setServiceRent(float rent) {
        this.serviceRent = rent;
    }

    public float getServiceRent() {
        return this.serviceRent;
    }
}

class Tesla {
    int cost = 5500;
    float sharePrice = 250;
    int noOfShares = 45;
    float serviceRent = 450;
    int owner = 0;

    public void setOwner(int p) {
        this.owner = p;
    }

    public int getOwner() {
        return this.owner;
    }

    public int getCost() {
        return this.cost;
    }

    public void setSharePrice(float price) {
        this.sharePrice = price;
    }

    public float getSharePrice() {
        return this.sharePrice;
    }

    public int getNoOfShares() {
        return this.noOfShares;
    }

    public void setServiceRent(float rent) {
        this.serviceRent = rent;
    }

    public float getServiceRent() {
        return this.serviceRent;
    }
}

class Microsoft {
    int cost = 5000;
    float sharePrice = 300;
    int noOfShares = 30;
    float serviceRent = 300;
    int owner = 0;

    public void setOwner(int p) {
        this.owner = p;
    }

    public int getOwner() {
        return this.owner;
    }

    public int getCost() {
        return this.cost;
    }

    public void setSharePrice(float price) {
        this.sharePrice = price;
    }

    public float getSharePrice() {
        return this.sharePrice;
    }

    public int getNoOfShares() {
        return this.noOfShares;
    }

    public void setServiceRent(float rent) {
        this.serviceRent = rent;
    }

    public float getServiceRent() {
        return this.serviceRent;
    }
}

class Google {
    int cost = 8000;
    float sharePrice = 700;
    int noOfShares = 12;
    float serviceRent = 400;
    int owner = 0;

    public void setOwner(int p) {
        this.owner = p;
    }

    public int getOwner() {
        return this.owner;
    }

    public int getCost() {
        return this.cost;
    }

    public void setSharePrice(float price) {
        this.sharePrice = price;
    }

    public float getSharePrice() {
        return this.sharePrice;
    }

    public int getNoOfShares() {
        return this.noOfShares;
    }

    public void setServiceRent(float rent) {
        this.serviceRent = rent;
    }

    public float getServiceRent() {
        return this.serviceRent;
    }
}

class ISRO {
    int cost = 7000;
    float sharePrice = 400;
    int noOfShares = 30;
    float serviceRent = 500;
    int owner = 0;

    public void setOwner(int p) {
        this.owner = p;
    }

    public int getOwner() {
        return this.owner;
    }

    public int getCost() {
        return this.cost;
    }

    public void setSharePrice(float price) {
        this.sharePrice = price;
    }

    public float getSharePrice() {
        return this.sharePrice;
    }

    public int getNoOfShares() {
        return this.noOfShares;
    }

    public void setServiceRent(float rent) {
        this.serviceRent = rent;
    }

    public float getServiceRent() {
        return this.serviceRent;
    }
}

class Facebook {
    int cost = 6500;
    float sharePrice = 200;
    int noOfShares = 30;
    float serviceRent = 600;
    int owner = 0;

    public void setOwner(int p) {
        this.owner = p;
    }

    public int getOwner() {
        return this.owner;
    }

    public int getCost() {
        return this.cost;
    }

    public void setSharePrice(float price) {
        this.sharePrice = price;
    }

    public float getSharePrice() {
        return this.sharePrice;
    }

    public int getNoOfShares() {
        return this.noOfShares;
    }

    public void setServiceRent(float rent) {
        this.serviceRent = rent;
    }

    public float getServiceRent() {
        return this.serviceRent;
    }
}