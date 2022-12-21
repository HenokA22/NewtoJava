import java.util.Scanner;
// code that uses a scanner, a feature that creates user inputs and that in this case affects variables functions
// E.X studentGPA
// added if and else to reward good GPA :)
public class Student2 {
    public static void main(String[] args) {
        double studentGPA = 3.9;
        String studentfirstname = "Henok";
        String studentlastname = "Assalif";
        System.out.println(studentfirstname + " " + studentlastname + " " + "has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        String Outputme = studentfirstname + " " + studentlastname + " now has a GPA of " + studentGPA;
        //System.out.println(Outputme);

        if (studentGPA >= 3.5) {
            System.out.println(Outputme + " :)");
        }
        else if (studentGPA <= 2.7 && studentGPA >= 2.0 )  {
            System.out.println(Outputme + " :(");
        }
        else if ( studentGPA < 2.0 ) {
            System.out.println(Outputme + " Lock in!!!" + " :( " );
        }
        else {
                System.out.println(Outputme);
            }



            }
    }

