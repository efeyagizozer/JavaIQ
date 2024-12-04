package Java.Topics.ScannerAndCustomMethod;

public class Methods {


    public static void main(String[] args) {
        displayMessage(7);
        cubeNumber(5);
        System.out.println(isOdd(4));
        System.out.println(num(4));



    }



    public static void displayMessage( int num){
        System.out.println("Hello i love Java" + num);
        System.out.println("Hi Hello");


    }


    // CREATE A FUNCTION THAT CAN DISLAY THE CUBE OF THE NUMBER
    public static void cubeNumber(int num){
       int cubeNumber= num* num* num;
       System.out.println("Cube of " + num +"is" + cubeNumber);
    }


    public static int squareNumber(int num){
        int squareNumber= num* num;
        System.out.println("Cube of " + num +"is" + squareNumber);
        return squareNumber;

    }

     public static boolean isOdd(int number){

        if(number%2!=0){
            return true;
        }
            return false;
    }


    /*
    1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false
     */


    /*
    5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25
     */

    public static double num(int number){
        return  number* number;

    }







}
