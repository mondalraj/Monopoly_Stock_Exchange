package player;

public class Player {
    public void setPlayerName(String name , int n){

        if(n == 1 ){
            Player1 p1 = new Player1();
            p1.setName(name);
        } else if(n == 2){
            Player2 p2 = new Player2();
            p2.setName(name);
        } else if(n == 3){
            Player3 p3 = new Player3();
            p3.setName(name);
        }
    
    }

    public void getPlayerName( int n){
        if(n == 1){
            Player1 p1 = new Player1();
            System.out.println(p1.getName());
            
        } else if(n == 2 ){
            Player2 p2 = new Player2();
            System.out.println(p2.getName());

        } else{
            Player3 p3 = new Player3();
            System.out.println(p3.getName());
            
        }
    }
}

class Player1{
    public String name;

    public void setName(String name1){
        this.name = name1;
    }

    public String getName(){
        return this.name;
    }
}

class Player2{
    public String name;

    public void setName(String name2){
        this.name = name2;
    }

    public String getName(){
        return this.name;
    }
}

class Player3{
    public String name;

    public void setName(String name3){
        this.name = name3;
    }

    public String getName(){
        return this.name;
    }
}