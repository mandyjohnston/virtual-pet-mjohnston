import java.util.Scanner;

public class VirtualPet {
    int foodLevel;
    int happyLevel;
    int awakeLevel;
    int changeInFoodLevel;
    int changeInHappyLevel;
    int changeInAwakeLevel;
    boolean isAlive;
    String name;

    public VirtualPet(int foodLevel, int happyLevel, int awakeLevel, int changeInFoodLevel, int changeInHappyLevel, int changeInAwakeLevel, String name) {
        this.foodLevel = foodLevel;
        this.happyLevel = happyLevel;
        this.awakeLevel = awakeLevel;
        this.changeInFoodLevel = changeInFoodLevel;
        this.changeInHappyLevel = changeInHappyLevel;
        this.changeInAwakeLevel = changeInAwakeLevel;
        this.name = name;
    }


    public boolean isAlive() {
        if (foodLevel == 0 || happyLevel == 0 || awakeLevel == 0) {
            isAlive = false;
            System.out.println("Sorry! You died.");
        }
        return isAlive;
    }

    Scanner input = new Scanner(System.in);

    public int getChangeInFoodLevel () {

        System.out.println("What do you want to feed " + name + "?");
        System.out.println("Select 1 for fish");
        System.out.println("Select 2 for rabbit");
        System.out.println("Select 3 for deer");
        System.out.println("Select 4 for people");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                foodLevel += 10;//feed fish
                happyLevel += 2;//happy level increase
                awakeLevel -= 2;
                System.out.println("Feeding " + name + " some fish.");
                break;
            case 2:
                foodLevel += 25;//feed rabbit
                happyLevel += 4;
                awakeLevel -= 2;
                System.out.println("Feeding " + name + " a rabbit.");
                break;
            case 3:
                foodLevel += 50;
                happyLevel += 6;//feed deer
                awakeLevel -= 2;
                System.out.println("Feeding " + name + " a deer.");
                break;

        }
        return choice;
    }

    public int getChangeInHappyLevel () {
        System.out.println("How do you want to play with " + name + "?");
        System.out.println("Select 1 for frisbee");
        System.out.println("Select 2 for throwing a beach ball");
        System.out.println("Select 3 for swimming");
        int choice = input.nextInt();
        switch (choice) {
            case 1://playing frisbee
                happyLevel += 10;
                foodLevel -= 2;
                awakeLevel -= 2;
                System.out.println("Playing frisbee with " + name);

            case 2://playing tag
                happyLevel += 20;
                foodLevel -= 4;
                awakeLevel -= 4;
                System.out.println("Playing tag with " + name);

            case 3://playing hide and seek
                happyLevel += 50;
                foodLevel -= 8;
                awakeLevel -= 8;
                System.out.println("Playing hide-and-seek with " + name);

        }
        return choice;
    }

    public int getChangeInAwakeLevel () {
        System.out.println("How do you want to put " + name + " to sleep");
        System.out.println("Select 1 for in a hammock");
        System.out.println("Select 2 for on a mattress");
        System.out.println("Select 3 for a hardwood floor");
        int choice = input.nextInt();
        switch (choice) {
            case 1://singing a lullaby
                awakeLevel += 25;
                foodLevel -= 15;
                happyLevel += 10;
                System.out.println("We rocked her back and forth. Now she has energy!");
                break;
            case 2://use a pillow
                awakeLevel += 35;
                foodLevel -= 15;
                happyLevel += 10;
                System.out.println("It was an ok sleep. ");
                break;
            case 3://give her Nyquil
                awakeLevel += 50;
                foodLevel -= 15;
                happyLevel += 10;
                System.out.println("Give " + name + " some Nyquil");
                break;
        }
        return choice;
    }

    public void getDoNothing () {
        System.out.println("Doing nothing...");
        awakeLevel -= (int) (20 * Math.random());
        happyLevel -= (int) (20 * Math.random());
        foodLevel -= (int) (20 * Math.random());
        System.out.println(changeInFoodLevel);
        System.out.println(changeInAwakeLevel);
        System.out.println(changeInHappyLevel);

        return;
    }
}

