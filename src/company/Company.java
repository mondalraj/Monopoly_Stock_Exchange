package company;

public class Company {
    Amazon a2 = new Amazon();
    Tesla t5 = new Tesla();
    Microsoft m6 = new Microsoft();
    Google g9 = new Google();
    ISRO i10 = new ISRO();
    Facebook f11 = new Facebook();

    public void getCompanyCost(int n) {
        if (n == 2) {
            System.out.println(a2.getCost());
        } else if (n == 5) {
            System.out.println(t5.getCost());
            
        } else if (n == 6) {
            System.out.println(m6.getCost());
            
        } else if (n == 9) {
            System.out.println(g9.getCost());
            
        } else if (n == 10) {
            System.out.println(i10.getCost());
            
        } else if (n == 11) {
            System.out.println(f11.getCost());

        }
    }

    public void setCompanySharePrice(int price, int n) {
        if (n == 2) {
            a2.setSharePrice(price);
        } else if (n == 5) {
            t5.setSharePrice(price);
            
        } else if (n == 6) {
            m6.setSharePrice(price);
            
        } else if (n == 9) {
            g9.setSharePrice(price);
            
        } else if (n == 10) {
            i10.setSharePrice(price);
            
        } else if (n == 11) {
            f11.setSharePrice(price);

        }
    }

    public void getCompanySharePrice(int n) {
        if (n == 2) {
            System.out.println(a2.getSharePrice());
        } else if (n == 5) {
            System.out.println(t5.getSharePrice());
            
        } else if (n == 6) {
            System.out.println(m6.getSharePrice());
            
        } else if (n == 9) {
            System.out.println(g9.getSharePrice());
            
        } else if (n == 10) {
            System.out.println(i10.getSharePrice());
            
        } else if (n == 11) {
            System.out.println(f11.getSharePrice());

        }
    }

    public void getCompanyNoOfShares(int n) {
        if (n == 2) {
            System.out.println(a2.getNoOfShares());
        } else if (n == 5) {
            System.out.println(t5.getNoOfShares());
            
        } else if (n == 6) {
            System.out.println(m6.getNoOfShares());
            
        } else if (n == 9) {
            System.out.println(g9.getNoOfShares());
            
        } else if (n == 10) {
            System.out.println(i10.getNoOfShares());
            
        } else if (n == 11) {
            System.out.println(f11.getNoOfShares());

        }
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

    public void getCompanyServiceRent(int n) {
        if (n == 2) {
            System.out.println(a2.getServiceRent());
        } else if (n == 5) {
            System.out.println(t5.getServiceRent());
            
        } else if (n == 6) {
            System.out.println(m6.getServiceRent());
            
        } else if (n == 9) {
            System.out.println(g9.getServiceRent());
            
        } else if (n == 10) {
            System.out.println(i10.getServiceRent());
            
        } else if (n == 11) {
            System.out.println(f11.getServiceRent());

        }
    }
}

class Amazon {
    int cost = 6000;
    float sharePrice = 200;
    int noOfShares = 20;
    float serviceRent = 400;

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
    float sharePrice = 100;
    int noOfShares = 45;
    float serviceRent = 450;

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
    float sharePrice = 100;
    int noOfShares = 30;
    float serviceRent = 300;

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
    int cost = 10000;
    float sharePrice = 1000;
    int noOfShares = 8;
    float serviceRent = 400;

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
    float sharePrice = 500;
    int noOfShares = 10;
    float serviceRent = 500;

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
    int cost = 6000;
    float sharePrice = 200;
    int noOfShares = 30;
    float serviceRent = 600;

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