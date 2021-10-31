package ro.fasttrackit.exercises;

public class Bottle {

    private double totalCapacity;
    private double availableLiquid;
    private String liquidType;
    private boolean open;

    public Bottle(double totalCapacity, double availableLiquid, String liquidType, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.liquidType = liquidType;
        this.open = open;
    }

    public boolean hasLiquid() {
        return this.availableLiquid > 0;
    }

    public double getAvailableLiquid() {
        return this.availableLiquid;
    }

    public double getEmptyCapacity() {
        return this.totalCapacity;
    }

    public void openBottle() {
        if (this.open) {
            System.out.println("Bottle already open");
        } else {
            this.open = true;
            System.out.println("Bottle is opened");
        }
    }

    public void closeBottle() {
        if (!this.open) {
            System.out.println("Bottle already closed");
        } else {
            this.open = false;
            System.out.println("Bottle is closed");
        }
    }

    public String getLiquidType() {
        return this.liquidType;
    }

    public void drinkFromBottle(double quantity) {
        if (!this.open) {
            System.out.println("Bottle is closed, you cannot drink!");
        } else {
            if (this.availableLiquid > quantity) {
                this.availableLiquid -= quantity;
                System.out.println(String.format("Ai baut %s cantitate din lichidul %s", quantity, this.liquidType));
            } else {
                System.out.println("Nu poti sa bei atat, nu exista cantitatea ceruta!");
            }
        }
    }
}
