import java.util.Scanner;
public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet akiraTheAlligator = new VirtualPet(50, 50, 50, 0, 0, 0, "Akira", true);
        // INFINITE LOOP =====================================================================================
        outerloop:
        do {
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("                                                ___.-----.______");
            System.out.println("                                               ___.-----'::::::::::::::::`---.___");
            System.out.println("                            _.--._            (:::;,-----'~~~~~`----::::::::::.. `-.");
            System.out.println("               _          .'_---. `--.__       `~~'                 `~`--.:::::`..  `..");
            System.out.println("              ; `-.____.-' ' {0} ` `--._`---.____                         `:::::::: : ::");
            System.out.println("             :_^              ~   `--.___ `----.__`----.____                ~::::::.`;':");
            System.out.println("              :`--.__,-----.___(         `---.___ `---.___  `----.___         ~|;:,' : |");
            System.out.println("               `-.___,---.____     _,        ._  `----.____ `----.__ `-----.___;--'  ; :");
            System.out.println("                              `---' `.  `._    `))  ,  , , `----.____.----.____   --' :|");
            System.out.println("                                    / `,--.\\    `.` `  ` ` ,   ,  ,     _.--   `-----'|'");
            System.out.println("                               __./'_/'     :   .:----.___ ` ` ` ``  .-'      , ,  :::'");
            System.out.println("                             ///--\\;        :   :'    ____`---.___.--::     , ` ` ::'");
            System.out.println("                             `'           _.'   (    /______     (   `-._   `-._,-'");
            System.out.println("                                       .-' __.-//     /_______---'       `-._   `.");
            System.out.println("                                      /////    `'       ~~~~~~      ~~ ______;   ::.");
            System.out.println("                                      `'`'                            /_______   _.'");
            System.out.println("                                                                        /___.---'");
            System.out.println("                                                                         ~~~");

            System.out.println(akiraTheAlligator.tick());

            if (akiraTheAlligator.foodLevel == 0 || akiraTheAlligator.happyLevel == 0 || akiraTheAlligator.awakeLevel == 0) {
                akiraTheAlligator.isAlive = false;
                akiraTheAlligator.tick();
                break outerloop;
            }
            else {
                akiraTheAlligator.isAlive = true;
                akiraTheAlligator.tick();
            }



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
            System.out.println("       Enter 1 to feed " + akiraTheAlligator.name);
            System.out.println("       Enter 2 to play with " + akiraTheAlligator.name);
            System.out.println("       Enter 3 to put " + akiraTheAlligator.name + " to bed");
            System.out.println("       Enter 4 to do nothing at all. ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    akiraTheAlligator.feedPet();
                    break;
                case 2:
                    akiraTheAlligator.playWithPet();
                    break;
                case 3:
                    akiraTheAlligator.putPetToBed();
                    break;
                case 4:
                    akiraTheAlligator.doNothing();
                    break;
            }

        }
        while (akiraTheAlligator.isAlive);
        System.out.println("          " + akiraTheAlligator.name + " died.");
        System.out.println("           GAME OVER");
    } //end of main() method
} //end of Main class