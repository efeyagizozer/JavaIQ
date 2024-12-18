package Java.JavaEmirSolution;

public class Factoriel {

    public static void main(String[] args) {
        /*
5. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2 * 1 = 120 )
 */
        
        
        int number = 5;
        
        int sum=1;
        
        for(int i=1; i<= number ; i++ ){
            sum*=i;
        }

        System.out.println("sum = " + sum);


        int fack= 5;
        int sumFack= 1;

        while(fack>=1){
            sumFack*=fack;
            fack--;

        }

        System.out.println("sumfack" + sumFack);


    }
}
