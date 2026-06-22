import java.util.Scanner;
public class Main {

    static int charHealth = 100;
    static int beastHealth = 100;
    static int turn = 1;
    static int choice;
    static boolean isCoward = false;

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GLADIATOR GAME");
        System.out.println("-----------------");
        System.out.print("Choose your character's name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome to the Arena -" + name + "-");
        System.out.println("You ara going to face a Tiger today.");
        System.out.println("Let the battle begin!");
        System.out.println("-----------------");



        while (charHealth > 0 && beastHealth > 0 && !isCoward) {
            userInterface();
            choice = scanner.nextInt();
            userAction();
            turn++;
        }

        if (charHealth <= 0) {
            System.out.println("YOU are DEAD!");
        } else if (beastHealth <= 0) {
            System.out.println("You slayed the Beast! You WON!");
        } else if (isCoward) {
            System.out.println("You are such a COWARD!");
        }
    }

    public static void userInterface() {
        System.out.println("TURN: " + turn);
        System.out.println("Character's Health: " + charHealth);
        System.out.println("Beast's Health: " + beastHealth);
        System.out.println("-----------------");
        System.out.println("Choose one of the following options");
        System.out.println("1.Attack (-5 damage to beast)");
        System.out.println("2.Health Potion (+15 Health to Character)");
        System.out.println("3.Block the upcoming attack");
        System.out.println("4.Run Away!");
    }
    public static void userAction() {
        if (choice == 1) {
            beastHealth = beastHealth - 5;
            charHealth = charHealth -8;
        } else if (choice == 2 && charHealth < 85) {
            charHealth = charHealth + 15;
            charHealth = charHealth -8;
        } else if (choice == 2 && charHealth >= 85) {
            charHealth = 100;
            charHealth = charHealth -8;
        } else if (choice == 3) {

        } else if (choice == 4) {
            isCoward = true;
        } else {
            System.out.println("You picked a wrong option, you suffer 15 HP!");
            charHealth = charHealth -15;
        }
    }
}