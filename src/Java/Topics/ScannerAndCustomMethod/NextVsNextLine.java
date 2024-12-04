package Java.Topics.ScannerAndCustomMethod;
import java.util.Scanner;
public class NextVsNextLine {


    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.println("Enter Your name");
        String name = input.next();



        input.nextLine();// it clean the Enter

        // Ask the user to enter a whole sentence
        System.out.println("Enter Your Full sentence");
        String fullName = input.nextLine();// it will read whole sentence till the end of line
        System.out.println("Full Name: " + fullName);





    }
}