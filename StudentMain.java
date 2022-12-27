// the one downside of profile one is if the user makes a input error than the program breaks
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Student1 First Name");
        String FirstName = input.next();

        System.out.println("Input Student1 Last Name");
        String LastName = input.next();

        System.out.println("Input Student1 GradYear");
        int GradYear = input.nextInt();

        System.out.println("Input Student1 GPA");
        double GPA = input.nextDouble();

        System.out.println("Input Student1 DeclaredMajor");
        String DeclaredMajor = input.next();

        StudentProfile student1 = new StudentProfile(FirstName,LastName,GradYear,GPA,DeclaredMajor);
        StudentProfile student2 = new StudentProfile("Henok", "Assalif", 2026, 3.9,"Engineering");

        int NoGradStudent = student2.OneGradYear();
        System.out.println(NoGradStudent);

        String Name = student1.FirstName;
        String Name2 = student1.LastName;
        System.out.println(Name + " " + Name2);

}
    }

