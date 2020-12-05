import java.util.Scanner;
public class VirtualPet {
    int foodLevel;
    int happyLevel;
    int awakeLevel;
    int changeInFoodLevel;
    int changeInHappyLevel;
    int changeInAwakeLevel;
    boolean isAlive;
    String tickOutput;
    String name;
    Scanner input = new Scanner(System.in);

    public VirtualPet(int foodLevel, int happyLevel, int awakeLevel, int changeInFoodLevel, int changeInHappyLevel, int changeInAwakeLevel, String name, boolean isAlive) {
        this.foodLevel = foodLevel;
        this.happyLevel = happyLevel;
        this.awakeLevel = awakeLevel;
        this.changeInFoodLevel = changeInFoodLevel;
        this.changeInHappyLevel = changeInHappyLevel;
        this.changeInAwakeLevel = changeInAwakeLevel;
        this.name = name;
        this.isAlive = isAlive;
    }


    public boolean isAlive() {
        if (foodLevel == 0 || happyLevel == 0 || awakeLevel == 0) ;
        isAlive = false;
        return isAlive;
    }


    public String tick() {
        foodLevel += changeInFoodLevel;
        changeInFoodLevel = 0;
        happyLevel += changeInHappyLevel;
        changeInHappyLevel = 0;
        awakeLevel += changeInAwakeLevel;
        changeInAwakeLevel = 0;

        if (foodLevel < 0) {
            foodLevel = 0;
        }
        if (foodLevel > 100) {
            foodLevel = 100;
        }
        if (happyLevel < 0) {
            happyLevel = 0;
        }
        if (happyLevel > 100) {
            happyLevel = 100;
        }
        if (awakeLevel < 0) {
            awakeLevel = 0;
        }
        if (awakeLevel > 100) {
            awakeLevel = 100;
        }
        return "Welcome to Virtual Pet!";



        /*tickOutput = "       Welcome to Virtual Pet! Please keep " + name + " alive!";
        if (!isAlive) {
            tickOutput = "          " + name + " died.";
        }

        if (foodLevel > 0 && foodLevel < 20) {
            tickOutput = name + " is extremely hungry";
        }
        // if (happyLevel) {}
        // if (awakeLevel) {}
        return tickOutput;*/

    }



    public int feedPet(){
        System.out.println("What do you want to feed " + name + "?");
        System.out.println("Select 1 for fish");
        System.out.println("Select 2 for rabbit");
        System.out.println("Select 3 for deer");
        System.out.println("Select 4 for people **favorite food");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                changeInFoodLevel = 10;//feed fish
                changeInHappyLevel = 2;//happy level increase
                changeInAwakeLevel = 2;
                System.out.println("Feeding " + name + " some fish.");
                break;
            case 2:
                changeInFoodLevel = 25;//feed rabbit
                changeInHappyLevel = 4;
                changeInAwakeLevel = 2;
                System.out.println("Feeding " + name + " a rabbit.");
                break;
            case 3:
                changeInFoodLevel = 50;
                changeInHappyLevel = 6;//feed deer
                changeInAwakeLevel = 2;
                System.out.println("Feeding " + name + " a deer.");
                break;
            case 4:
                changeInFoodLevel = 100;
                changeInHappyLevel = 100;//feed people 3x
                changeInAwakeLevel = -30;
                System.out.println("Feeding " + name + " 3 people.");
                break;
        }
        return choice;
    }


    public int playWithPet() {
        System.out.println("How do you want to play with " + name + "?");
        System.out.println("Select 1 for frisbee");
        System.out.println("Select 2 for throwing a beach ball");
        System.out.println("Select 3 for swimming");
        System.out.println("Select 4 for go hunt down some prey");
        int choice = input.nextInt();
        switch (choice) {
            case 1://playing frisbee
                changeInHappyLevel = 10;
                changeInFoodLevel = 2;
                changeInAwakeLevel = 2;
                System.out.println("Playing frisbee with " + name);
            case 2://playing tag
                changeInHappyLevel = 20;
                changeInFoodLevel = 4;
                changeInAwakeLevel = 4;
                System.out.println("Playing tag with " + name);
            case 3://playing hide and seek
                changeInHappyLevel = 50;
                changeInFoodLevel = 8;
                changeInAwakeLevel = 8;
                System.out.println("Playing hide-and-seek with " + name);
            case 4://playing hunt some prey
                changeInHappyLevel = 100;
                changeInFoodLevel = 75;
                changeInAwakeLevel = -30;
                System.out.println("Hunting with" + name + "n/Happy hunting!!");
        }
        return choice;
    }


    public int putPetToBed() {
        System.out.println("How do you want to put " + name + " to sleep");
        System.out.println("Select 1 for in a hammock");
        System.out.println("Select 2 for on a mattress");
        System.out.println("Select 3 for a hardwood floor");
        int choice = input.nextInt();
        switch (choice) {
            case 1://singing a lullaby
                changeInAwakeLevel = 25;
                changeInFoodLevel = -15;
                changeInHappyLevel = 10;
                System.out.println("We rocked her back and forth. Now she has energy!");
                break;
            case 2://use a pillow
                changeInAwakeLevel = 35;
                changeInFoodLevel = -15;
                changeInHappyLevel = 10;
                System.out.println("It was an ok sleep. ");
                break;
            case 3://give her Nyquil
                changeInAwakeLevel = 50;
                changeInFoodLevel = -15;
                changeInHappyLevel = 10;
                System.out.println("Give " + name + " some Nyquil");
                break;
            case 4://give her Nyquil
                changeInAwakeLevel = 100;
                changeInFoodLevel = -15;
                changeInHappyLevel = 30;
                System.out.println("Swamp nap");
                break;
        }
        return choice;
    }


    public void doNothing () {
        System.out.println("Doing nothing...");
        changeInAwakeLevel = -(int)(20 * Math.random());
        changeInHappyLevel = -(int)(20 * Math.random());
        changeInFoodLevel = -(int)(20 * Math.random());
        return;
    }
}