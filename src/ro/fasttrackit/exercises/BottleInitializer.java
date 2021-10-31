package ro.fasttrackit.exercises;

public class BottleInitializer {

    public static void main(String[] args) {

        Bottle bottle1 = new Bottle(2, 1,"bere", false);

        System.out.println(bottle1.getAvailableLiquid());
        System.out.println(bottle1.getEmptyCapacity());
        System.out.println(bottle1.hasLiquid());
        System.out.println(bottle1.getLiquidType());
        bottle1.closeBottle();
        bottle1.openBottle();
        bottle1.drinkFromBottle(20);
        bottle1.closeBottle();
        bottle1.drinkFromBottle(20);
        bottle1.openBottle();
        bottle1.drinkFromBottle(0.5);
    }
}
