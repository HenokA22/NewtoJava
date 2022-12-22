import java.util.Scanner;
// made a multiple choice game that gives the user another try is wrong. Used while loop , else, if conditionals to create this program. 
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

    if (correctanswer.equals(input.toLowerCase())) {
        System.out.println("Congrats you are correct");
    }
    else {
        System.out.println("You are incorrect, try again");
        System.out.println(question);
        boolean Secondchance = true;
        while(Secondchance){
            Scanner scanner1 = new Scanner(System.in);
            String input2 = scanner1.next();
            if(correctanswer.equals(input2.toLowerCase())) {
                System.out.println("Congrats you are correct");
                Secondchance = false;
            }
            else{
                System.out.println("You are incorrect, the correct answer is " + choicetwo);
                Secondchance = false;

            }
        }

    }


}
}


