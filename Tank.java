public class Tank extends Karakter {

    
    public Tank(){
        super();
        this.maxDarah = 450.0;
        this.darah = this.maxDarah;
        this.attackPower = 50.0;
        this.defensePower = 20.0;
    }
    
    
    public void levelUp(){
        this.level ++;
        this.maxDarah += 110;
        this.attackPower += 10;
        this.defensePower += 10;    
    } 

 

    public String getType(){
        String tipe = "Tank";
        return tipe;
    }

}
