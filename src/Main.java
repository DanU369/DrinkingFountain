import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student student1=new Student(true,10000,3);
        Student student2=new Student(false,0,0);
        Student student3=new Student(true,10,10);

        DrinkingFountain fountain=new DrinkingFountain();

        System.out.println("welcome student!");
        while (fountain.working){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Who are you?");
            System.out.println("1.Student1");
            System.out.println("2.Student2");

            String option = myObj.nextLine();

            Student actual;
            switch (option) {
                case "1" -> actual = student1;
                case "2" -> actual = student2;
                default -> actual=student3;
            }
            actual.selectWaterType();
            actual.selectWaterQuantity();
            if (fountain.checkIfOk(actual)){
                fountain.processRequest(actual);
            }
            System.out.println("Fountain temp is: " + fountain.actualTemp);
            System.out.println("Student water bottle: "+ actual.getBottleExistingWater()+"/"+actual.getBottleCapacity());
        }




    }
}
