public abstract class Karakter {

    protected double maxDarah;
    protected int level; 
    protected double darah;
    protected double attackPower;
    protected double defensePower;

    public Karakter(){
        this.level = 1;
    }


    public int getLevel(){
        return this.level;
    }
    
    public double getAttackPower(){
        return this.attackPower;
    }

    public double getDefensPower(){
        return this.defensePower;
    }

    public double getDarah(){
        return this.darah;
    }

    public void setDarah(double darah){
        this.darah = darah;
    }
    
    public double getMaxDarah(){
        return this.maxDarah;
    }


    public abstract void levelUp();
    
    public abstract String getType();


    //public attack(Player username);

}