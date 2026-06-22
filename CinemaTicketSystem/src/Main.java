import java.util.Scanner; //scanner
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Cinema Saloon.");
        System.out.println("The standart price for the ticket is 10 dollars. But we offer discounts for people under 18 and above 65");
        System.out.println("We have 3 movies to offer you to watch!");
        System.out.println("1. Batman");
        System.out.println("2. Saw");
        System.out.println("3. Love");
        System.out.println("Which one you would like the ticket for?");
        int movie = scanner.nextInt();
        if (movie > 3 ||  movie < 1) {
            System.out.println("You have chosen a wrong number.");
            return;
        }
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int price = 10;
        boolean isUnderage = false;
        if (age < 18) {
          price = 8;
          isUnderage = true;
        } else if (age >= 65) {
            price = 7;
        }
        System.out.println("Proccessing the given data...");
        if (movie == 2 && isUnderage) {
            System.out.println("Sorry. This movie is not available for people under 18.");
        } else {
            System.out.println("Your total will be: " + price + " dollars.");
        }
        scanner.close();
    }
}