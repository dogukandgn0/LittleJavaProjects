//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Choose your structure");
            int choice = scanner.nextInt();
            if (choice == 5) {
                isRunning = false;
            }
            System.out.println("Input the dimensions:");
            int dimension = scanner.nextInt();
            if (choice == 1) {
                drawEmptySquare(dimension);
            } else if (choice == 2) {
                drawInvertedTriangle(dimension);
            } else if (choice == 3) {
                drawPyramid(dimension);
            } else if (choice == 4) {
                //drawDiamind
            }
            isRunning = false;
        }
    }
    public static void drawEmptySquare (int a) {
        if(a <= 0) {
            System.out.println("You have selected a dimension lower or equal to 0");
        } else if (a == 1) {
            System.out.println("*");
        } else if (a >= 2) {
            for(int x = a; x>0; x--) {
                System.out.println();
                for(int y = a; y>0; y--){
                    if (x == a || x == 1 || y == 1 || y == a) {
                        System.out.print("x  ");
                    } else {
                            System.out.print("   ");
                    }
                }
            }
        }
    }

    public static void drawInvertedTriangle(int a){
        if(a <= 0) {
            System.out.println("You have selected a dimension lower or equal to 0");
        } else if (a == 1) {
            System.out.println("*");
        } else if (a >= 2) {
            for(int x = a; x>0; x--) {
                System.out.println();
                for(int y = x; y>0; y--){
                        System.out.print("x ");
                }
            }
        }
    }

    public static void drawPyramid(int a) {
        if(a <= 0) {
            System.out.println("You have selected a dimension lower or equal to 0");
        } else if (a == 1) {
            System.out.println("*");
        } else if (a >= 2) {
            for(int x = a; x>0; x--) {
                for(int y = x/2; y>0; y--){
                    System.out.print(" ");
                }
                for (int z = 0; z<a; z++) {
                    System.out.print("x");
                }
                System.out.println();
            }
        }
    }
}
