public class Normal extends Enemy{

    public Normal(String name){
        super(name);
        this.maxDarah = 200;
        this.darah = this.maxDarah;
        this.attackPower = 100;

    }

    public Normal(String name, Place place){
        super(name, place);
        this.maxDarah = 200;
        this.darah = this.maxDarah;
        this.attackPower = 100;
    }

    
    public void move(Place place){
        Enemy enemy = new Normal(this.name);
        
        if(this.place != null){
            this.place.moveOut(enemy);
        }
        this.place = place;
        this.place.moveIn(enemy);
    }
    
    
    public String getEnemyLevel(){
        String level = "Normal";
        return level;
    }
    
    
}
