public class Player implements ControllPlayer {
    
    private String username;
    private Karakter karakter;
    private Place place;
    private boolean hidup = true;

    

    public Player(String username, Karakter karakter){
        this.username = username;
        this.karakter = karakter;
    }

    public String getUsername(){
        return this.username;

    }

    public Place getPlace(){
        return place;
    }
  
    public void levelUp(){
        this.karakter.levelUp();
    }

    public void attack(Enemy enemy){

        if(hidup == true){

            double power = this.karakter.getAttackPower();
    
            if(this.place == null){
                System.out.println("Player sedang tidak ada di tempat bertarung");
            }else{
                if(this.place == enemy.getPlace()){
                    System.out.println(this.username+" Menyerang "+ enemy.getName()+" Di "+this.place.getName());
                    enemy.defense(power);
                }else{
                    
                    System.out.println("tidak bisa menyerang karena Player berada di "+this.place.getName()+" Sedangkan musuh berada di "+enemy.getPlace().getName());
                }
            }

        }



    }

    public void defense(double power){
        
        double demage;

        if(this.karakter.getDefensPower()<power){
            demage = power - this.karakter.getDefensPower();
        }else demage = 0;

        double hit = this.karakter.getDarah() - demage;

        this.karakter.setDarah(hit);

        if(this.karakter.getDarah()<=0){
            System.out.println(this.username + " Telah mati");
            this.hidup = false;
        }else{
            System.out.println("Sisa darah : "+this.karakter.getDarah()+"/"+this.karakter.getMaxDarah());
        }

    }
    
    @Override
    public void move(Place place){
        Player player = new Player(this.username, this.karakter);
        
        if(this.place != null){
            this.place.moveOut(player);
        }
        this.place = place;
        this.place.moveIn(player);
    }
    
    public void info(){
        System.out.println("Informasi Player");
        System.out.println("Username : "+ this.username);
        if(place != null){
            System.out.println("Sedang berada di "+this.place.getName());
        }
        System.out.println("Informasi Karakter");
        System.out.println("Tipe : "+ this.karakter.getType());
        System.out.println("Darah : "+ this.karakter.getDarah()+"/"+this.karakter.getMaxDarah());
        System.out.println("Attack : "+ this.karakter.getAttackPower());
        System.out.println("Defense : "+ this.karakter.getDefensPower());
        System.out.println();
    }
}
