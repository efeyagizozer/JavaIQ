package Java.Topics.Arrays.ArraySorular.Cozduklerimiz;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
      /*/  1. Create a class named ArrayElements and write a program with the following specifications:
        1.1 Create an array of integers with a length of 100.
        1.2 Assign values from 1 to 100 to the indexes of the array.
        1.3 Display the array elements in a single line separated by spaces.
        1.4 Display the array elements in a single line in reversed order, separated by spaces.
        1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
*/
        int [] number= new int[100];
        System.out.println("number.length = " + number.length);

        for(int i=1 ; i<= number.length ; i++ ){
           number[i-1]=i;
        }
        System.out.println("number = " + Arrays.toString(number));


        for(int i= number.length-1;i>=0;i-- ){
            System.out.println("number[i] = " +number[i]);
        }


        /*

        number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]

         */
















        /* int [] numbers=new int[100];



        for(int i=1; i<=100 ; i++){
            numbers[i-1]=i;
           // nums[i-1]--> converts the i which is the number to an index
        }


        System.out.println(Arrays.toString(numbers));


        for(int i=0; i< numbers.length ; i++){

           System.out.println(numbers[i] + " ");
        }


        for(int i=numbers.length-1; i>=0 ; i--){

            System.out.println(numbers[i] + " ");
        }

        for(int i=0; i< numbers.length ; i++){
            if(numbers[i]%5==0){
                System.out.print(numbers[i]+ " ");
            }
        }

*/

    }
}
