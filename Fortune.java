import java.util.Scanner;
// using a scanner , if, and else to make a basic fortune output program.
public class Fortune {
    public static void main(String[] args) {
        System.out.println("Pick a number from 1-10");
        Scanner input  = new Scanner(System.in);

        int UserChoice = input.nextInt();
        if (UserChoice < 5) {
            System.out.println("Enjoy good luck that a friend brings you.");
        }
        else {
            System.out.println("Your shoe selection will make you happy today");
        }

    }
}
