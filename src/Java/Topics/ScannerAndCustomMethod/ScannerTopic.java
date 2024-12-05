package Java.Topics.ScannerAndCustomMethod;
import java.util.Scanner;
public class ScannerTopic {


    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input= new Scanner(System.in);

        // Ask the user to enter a string
        System.out.println("Enter Your Name");
        String  name= input.next();// it skip after the first  word then space// till the space

        System.out.println("name = " + name);

        // Ask the user to enter an integer
        System.out.println("Enter Your Age");
        int  age= input.nextInt();

        System.out.println("age = " + age);

        System.out.println("Enter Your Decimal Number");

        double decimalNumber = input.nextDouble();

        System.out.println("You have entered Decimal Number = " + decimalNumber);




    }
}
