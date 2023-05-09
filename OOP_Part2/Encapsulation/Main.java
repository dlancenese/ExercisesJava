public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Dillon";
//        player.health = 20;
//        player.weapon = "Sword";
//        //Can access these without building a constructor because they are set to public not private.
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer dillon = new EnhancedPlayer("Dillon", 200, "Sword");
        System.out.println("Initial health is " + dillon.healthRemaining());
    }
}