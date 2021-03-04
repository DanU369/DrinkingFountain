public class Drink {
    WaterType requestedWaterType;
    WaterQuantity requestedWaterQuantity;


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
