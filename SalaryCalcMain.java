import java.util.Scanner;
//Used a function to calculate the salary of employee over a given year then placed it into the main class
//and added some user functionality by using scanner and while loops to do so. The Scanner is used for the user
//to change parameters of function and the while loop is used to fix user errors if input is wrong
public class Main {
    public static double calculateEmployeeSalary(double hoursperweek, double hourlyrate, int VacationDay){
        double Timeoff = VacationDay * 8*hourlyrate;
        double grosssalary = (hoursperweek * hourlyrate);
        return ((grosssalary*52) - Timeoff);


    }
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        System.out.println("Select hours per week (use a double)");
        double hours = a.nextDouble();

        while(hours<0){
            System.out.println("Invalid input try again");
            hours= a.nextDouble();

        }

        System.out.println("Select hourly rate (use a double)");
        double rate = b.nextDouble();

        while(rate<0){
            System.out.println("Invalid input try again");
            rate = b.nextDouble();

        }

        System.out.println("Select how many vacation days (use a int)");
        int VacationDay = c.nextInt();

        while(VacationDay<0){
            System.out.println("Invalid input try again");
            VacationDay= c.nextInt();

        }

        double salary = calculateEmployeeSalary(hours,rate,VacationDay);
        System.out.println(salary);

    }
}
