public class Enemy implements ControllEnemy {

    protected double maxDarah = 100;
    protected double darah = this.maxDarah;
    protected double attackPower = 50;
    protected String name;
    protected Place place;


    public Enemy(String name){
        this.name = name;
    }
    
    public Enemy(String name, Place place){
        this.place = place;
        this.name = name; 
        move(place);
    }


    public String getName(){
        return this.name;
    }

    public Place getPlace(){
        return place;
    }


    public String getEnemyLevel(){
        String level = "Easy";
        return level;
    }


    public void move(Place place){
        Enemy enemy = new Enemy(this.name);

        if(this.place != null){
            this.place.moveOut(enemy);
        }
        this.place = place;
        this.place.moveIn(enemy);
    }



    public void attack(Player enemy){
        double power = this.attackPower;

        if(this.place == enemy.getPlace()){
            System.out.println(this.name+" Menyerang "+ enemy.getUsername()+" Di "+this.place.getName());
            enemy.defense(power);
        }else{
            System.out.println("beda tempat");
        }


    }

    public void defense(double power){

        this.darah -= power;
        if(this.darah <= 0){
            System.out.println(this.name + "Telah mati");
        }else{
            System.out.println("Sisa darah "+this.name+" : "+this.darah+"/"+this.maxDarah);
        }

    }

    public void info(){
        System.out.println("Informasi Enemy");
        System.out.println("Nama : " +this.name);
        System.out.println("Level : " +this.getEnemyLevel());
        System.out.println("Darah : "+this.darah+"/"+this.maxDarah);
        System.out.println("Attack Power : "+ this.attackPower);
    }


}
