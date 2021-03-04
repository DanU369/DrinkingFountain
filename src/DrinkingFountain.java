public class DrinkingFountain {
    boolean working = true;
    int actualTemp=5;
    int maxTemp=90;



    public boolean checkIfOk(Student student){
        if (!student.haveBottle()){
            System.out.println("Please use a bottle");
            return false;
        } else if (student.requestedWaterQuantity.quantity>student.getBottleCapacity()-student.getBottleExistingWater()){
            System.out.println("Your bottle is too small. Try a bigger bottle or request a smaller quantity");
            return false;
        }else {
            System.out.println("Stand by for the elixir of life");
            return true;
        }

    }

    public void processRequest(Student student){
        if (this.maxTemp>this.actualTemp){
            student.setBottleExistingWater(student.getBottleExistingWater()+student.requestedWaterQuantity.quantity);
            this.actualTemp+=student.requestedWaterType.temp*student.requestedWaterQuantity.quantity;
        }else {
            System.out.println("The fountain needs to cool down please come back later");
            this.working=false;
        }
    }



}
