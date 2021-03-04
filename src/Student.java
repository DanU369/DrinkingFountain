import java.util.Scanner;

public class Student {
    private boolean bottle;
    private int bottleCapacity;
    private int bottleExistingWater;
    WaterType requestedWaterType;
    WaterQuantity requestedWaterQuantity;

    public Student(boolean bottle, int bottleCapacity, int bottleExistingWater) {
        this.bottle = bottle;
        this.bottleCapacity = bottleCapacity;
        this.bottleExistingWater = bottleExistingWater;
    }

    public boolean haveBottle() {
        return bottle;
    }

    public void setBottle(boolean bottle) {
        this.bottle = bottle;
    }

    public int getBottleCapacity() {
        return bottleCapacity;
    }

    public void setBottleCapacity(int bottleCapacity) {
        this.bottleCapacity = bottleCapacity;
    }

    public int getBottleExistingWater() {
        return bottleExistingWater;
    }

    public void setBottleExistingWater(int bottleExistingWater) {
        this.bottleExistingWater = bottleExistingWater;
    }

    public void selectWaterType(){


        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose your water type:");
        System.out.println("1.Cold fizzy drink");
        System.out.println("2.Cold normal drink");
        System.out.println("3.Hot normal drink");

        String option = myObj.nextLine();

        switch (option) {
            case "1" -> this.requestedWaterType = WaterType.COLD_FIZZY_DRINK;
            case "2" -> this.requestedWaterType = WaterType.COLD_NORMAL_DRINK;
            case "3" -> this.requestedWaterType = WaterType.HOT_NORMAL_DRINK;
        }
    }

    public void selectWaterQuantity(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose your water quantity:");
        System.out.println("1.Small (1dl)");
        System.out.println("2.Medium (3dl)");
        System.out.println("3.Large (5dl)");

        String option = myObj.nextLine();
        switch (option) {
            case "1" -> this.requestedWaterQuantity = WaterQuantity.SMALL;
            case "2" -> this.requestedWaterQuantity = WaterQuantity.MEDIUM;
            case "3" -> this.requestedWaterQuantity= WaterQuantity.LARGE;
        }
    }

    public enum WaterType {
        COLD_FIZZY_DRINK(1),
        COLD_NORMAL_DRINK(-2),
        HOT_NORMAL_DRINK(3);

        public final int temp;

        private WaterType(int temp) {
            this.temp = temp;
        }
    }

    public enum WaterQuantity {
        SMALL(1),
        MEDIUM(3),
        LARGE(5);

        public final int quantity;

        private WaterQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
