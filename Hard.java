public class Hard extends Enemy{

    public Hard(String name){
        super(name);
        this.maxDarah = 300;
        this.darah = this.maxDarah;
        this.attackPower = 200;

    }

    public Hard(String name, Place place){
        super(name, place);
        this.maxDarah = 300;
        this.darah = this.maxDarah;
        this.attackPower = 200;
    }

    public void move(Place place){
        Enemy enemy = new Hard(this.name);

        if(this.place != null){
            this.place.moveOut(enemy);
        }
        this.place = place;
        this.place.moveIn(enemy);
    }

    public String getEnemyLevel(){
        String level = "Hard";
        return level;
    }

    
}

