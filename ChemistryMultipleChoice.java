import java.util.Scanner;

public class ChemistryMultipleChoice {
    public static void main(String[] args) {
        String question = "What is correct molecular formula for Nitrate " + "A.) (NO2)^-1" + " B.) (NO3)^-1" + " C.) (NO)^-1";
        String choiceone = "a";
        String choicetwo = "b";
        String choicethree = "c";

        String correctanswer = choicetwo;

        System.out.println(question);
        System.out.println(choiceone);
        System.out.println(choicetwo);
        System.out.println(choicethree);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        while (input != correctanswer) {
            if (correctanswer.equals(input.toLowerCase())) {
                System.out.println("Congrats you are correct!!");
                input = correctanswer;
            }
            else {


                System.out.println("You are incorrect, try again");
                System.out.println(question);
                System.out.println(choiceone);
                System.out.println(choicetwo);
                System.out.println(choicethree);
                input = scanner.next();
            }

        }
        }

    }



