public class Main {
    public static void main(String[] args) {
        
        Place place1 = new Place("Sekolah Vokasi");
        Place place2 = new Place("Botani");
        Place place3 = new Place("Malabar");

        Enemy enemy1 = new Enemy("Baby Dragon", place2);
        Enemy enemy2 = new Normal("Dragon", place2);
        Enemy enemy3 = new Hard("Lord Dragon", place3);
        Enemy enemy4 = new Normal("Zombie", place2);
        Enemy enemy5 = new Hard("King Zombie", place2);

        Player player1 = new Player("Nanda", new Assasin());
        Player player2 = new Player("Alfan", new Fighter());
        Player player3 = new Player("Tola", new Tank());


        //player1.attack(enemy2);
        player1.move(place2);
        place2.info();
        player1.move(place3);
        place2.info();
        place3.info();
        //player1.attack(enemy3);
        





    }
    
}



