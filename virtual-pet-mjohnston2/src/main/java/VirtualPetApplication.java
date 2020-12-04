import java.util.Scanner;
public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        VirtualPet akiraTheAlligator = new VirtualPet(5, 5, 5, 0, 0, 0, "Akira");

        // INFINITE LOOP =====================================================================================
        for (int h = 0; h < 1; h--) {
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if (akiraTheAlligator.foodLevel<0) {
                akiraTheAlligator.foodLevel=0;
            }
            if (akiraTheAlligator.foodLevel>100) {
                akiraTheAlligator.foodLevel=100;
            }
            if (akiraTheAlligator.happyLevel<0) {
                akiraTheAlligator.happyLevel=0;
            }
            if (akiraTheAlligator.happyLevel>100) {
                akiraTheAlligator.happyLevel = 100;
            }
            if (akiraTheAlligator.awakeLevel<0) {
                akiraTheAlligator.awakeLevel=0;
            }
            if (akiraTheAlligator.awakeLevel>100) {
                akiraTheAlligator.awakeLevel=100;
            }
            if (akiraTheAlligator.isAlive==false) {
                break;
            }
            System.out.println("Welcome to the Game! Try to keep " +akiraTheAlligator.name+" alive!");




            // BAR CHART =====================================================================================
            String foodBarChart = ""; // must be inside the infinite loop
            String happyBarChart = ""; // must be inside the infinite loop
            String awakeBarChart = ""; // must be inside the infinite loop
            for (int i = 0; i < akiraTheAlligator.foodLevel; i++) {
                foodBarChart += "=";
            }
            for (int j = 0; j < akiraTheAlligator.happyLevel; j++) {
                happyBarChart += "=";
            }
            for (int k = 0; k < akiraTheAlligator.awakeLevel; k++) {
                awakeBarChart += "=";
            }

            // USER INTERFACE =====================================================================================
            System.out.println("Food:  " + foodBarChart + " " + akiraTheAlligator.foodLevel + "% ");
            System.out.println("Happy: " + happyBarChart + " " + akiraTheAlligator.happyLevel + "% ");
            System.out.println("Awake: " + awakeBarChart + " " + akiraTheAlligator.awakeLevel + "% ");
            System.out.println("Select 1 to feed " + akiraTheAlligator.name);
            System.out.println("Select 2 to play with " + akiraTheAlligator.name);
            System.out.println("Select 3 to put " + akiraTheAlligator.name + " to bed");
            System.out.println("Select 4 to do nothing at all. ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    akiraTheAlligator.getChangeInFoodLevel();
                    break;
                case 2:
                    akiraTheAlligator.getChangeInHappyLevel();
                    break;
                case 3:
                    akiraTheAlligator.getChangeInAwakeLevel();
                    break;
                case 4:
                    akiraTheAlligator.getDoNothing();
                    break;
            }


        } //end of infinite loop

    } //end of main() method
} //end of Main class

