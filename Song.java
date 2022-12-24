import java.util.Scanner;
//using a while loop to demonstrate a type of conditional in Java using boolean data type
public class Song {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Would you like to take song off repeat? If so, answer yes");
            String UserInput = input.next();

            if( UserInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }

}
