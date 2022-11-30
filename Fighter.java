public class Fighter extends Karakter {

    
    public Fighter(){
        super();
        this.maxDarah = 250.0;
        this.darah = this.maxDarah;
        this.attackPower = 65.0;
        this.defensePower = 10.0;
    }
    
    
    public void levelUp(){
        this.level ++;
        this.maxDarah += 95;
        this.attackPower += 12;
        this.defensePower += 7;    
    } 

    public String getType(){
        String tipe = "Fighter";
        return tipe;
    }

}
