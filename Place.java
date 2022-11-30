public class Place {

    private String name;
    private Player[] daftarPlayer = new Player[5];
    private Enemy[] daftarEnemy = new Enemy[10];
    private static int jmlPlayer = 0;
    private static int jmlEnemy = 0;

    public Place(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void moveIn(Player playerIn){
        if(jmlPlayer < this.daftarPlayer.length){
            this.daftarPlayer[jmlPlayer] = playerIn;
            Place.jmlPlayer++;
            System.out.println(playerIn.getUsername()+ " Telah Datang ke "+this.name);
        }
    }

  
    public void moveOut(Player playerOut){
        
        int indexPlayer = 0;
        for(Player out:daftarPlayer){
            if(out != null){
                if(out.getUsername() == playerOut.getUsername()){
                    daftarPlayer[indexPlayer] = null;
                    System.out.println(out.getUsername()+" Telah meninggalkan "+this.name);
                }
            }
            indexPlayer++;
        }       
    }

    public void moveIn(Enemy enemy){
        if(jmlEnemy < this.daftarEnemy.length){
            this.daftarEnemy[jmlEnemy] = enemy;
            Place.jmlEnemy++;
        }

    }

    public void moveOut(Enemy enemyOut){
        
        int indexEnemy = 0;
        for(Enemy out:daftarEnemy){
            if(out != null){
                if(out.getName() == enemyOut.getName()){
                    daftarEnemy[indexEnemy] = null;
                    //System.out.println(out.getUsername()+" Telah meninggalkan "+this.name);
                }
            }
            indexEnemy++;
        }       
    }

    public void info(){
        //System.out.println();
        System.out.println("Karakter yang ada di "+this.name);
        for(Player player:daftarPlayer){
            if (player != null){
                System.out.println("\t- "+player.getUsername());
            }
        }
        System.out.println("Musuh yang tersedia di "+this.name);
        for(Enemy enemy:daftarEnemy){
            if(enemy != null){
                System.out.println("\t- "+enemy.getName()+" Level "+ enemy.getEnemyLevel());
            }
        }
    }
}
