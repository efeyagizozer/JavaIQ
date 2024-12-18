package Java.JavaEmirSolution;

public class Rectangle {

    public static void main(String[] args) {
        /*
1. Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
 */

        for(int i = 0; i <10 ; i++){
            for(int j = 0; j <9 ; j++){
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
