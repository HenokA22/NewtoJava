import java.util.Scanner;
//using functions in Java to organize code so we don't need to copy multiple lines of code
public class Main {
    public static void announceteatime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type a random word and press Enter to start tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's tea time!");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");

        announceteatime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceteatime();

        System.out.println("Get promoted!");
    }
}
