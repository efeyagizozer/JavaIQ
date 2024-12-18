package Java.JavaEmirSolution;

public class Fibonacci {


    public static void main(String[] args) {


    fib(10);
         /*
        Fibonacci

        Create a method that will give you the Nth Fibonacci number where N is the given int parameter.
        Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
    Note: Fibonacci numbers are read like index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

        parameter: int
        return: int

        Ex:
            input:
                8
            output:
                21

            -> ex of the sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

        Test data:
            n -> result
            0 -> 0
            1 -> 1
            2 -> 1
            3 -> 2
            6 -> 8
            8 -> 21

            0, 1, 1, 2, 3, 5, 8, 13, 21


    */

// 0 1 1
        }
public static void fib(int n){
    int first= 0 ;
    int second= 1;
    int fibonacci=0;


    System.out.println(first);
    System.out.println(second);
        for (int i = 0; i < n; i++) {
            fibonacci=first + second;
            first=second;
            second= fibonacci;





            System.out.println("fibonacci = " + fibonacci);


        }

    }
}
