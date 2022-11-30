public class Assasin extends Karakter {

    
    public Assasin(){
        super();
        this.maxDarah = 150.0;
        this.darah = this.maxDarah;
        this.attackPower = 110.0;
        this.defensePower = 5.0;
    }
    
    
    public void levelUp(){
        this.level ++;
        this.maxDarah += 88;
        this.attackPower += 25;
        this.defensePower += 5;    
    } 

 

    public String getType(){
        String tipe = "Assasin";
        return tipe;
    }

}
