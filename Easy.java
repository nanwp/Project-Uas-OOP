public class Easy extends Enemy{


    public Easy(String name){
        super(name);
        this.maxDarah = 100;
        this.darah = this.maxDarah;
        this.attackPower = 50;

        
    }

    public Easy(String name, Place place){
        super(name, place);
        this.maxDarah = 100;
        this.darah = this.maxDarah;
        this.attackPower = 50;
    
    }

    public void move(Place place){
        Enemy enemy = new Easy(this.name);

        if(this.place != null){
            this.place.moveOut(enemy);
        }
        this.place = place;
        this.place.moveIn(enemy);
    }
    
    
}
