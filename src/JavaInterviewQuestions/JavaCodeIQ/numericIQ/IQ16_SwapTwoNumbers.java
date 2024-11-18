package JavaInterviewQuestions.JavaCodeIQ.numericIQ;

public class IQ16_SwapTwoNumbers {
     /*
        Swap Two Numbers

        Create a program that will swap two variables' values
            Do it without a third variable
     */

    public static void main(String[] args) {

        int a = 1,b=2;

        a = a + b; // a = 1 + 2 = 3
        b= a - b; // b = 3 - 2 = 1
        a = a - b; // a = 3 - 1 = 2 --> a become 2 , b become 1 by basic calc.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
         logic: try to add or sum the values and reach the target number.
         */

    }
}
