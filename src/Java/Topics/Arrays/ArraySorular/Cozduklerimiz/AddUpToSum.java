package Java.Topics.Arrays.ArraySorular.Cozduklerimiz;

public class AddUpToSum {
    public static void main(String[] args) {
         /*
        Add Up to Sum

        Given an int array and an int representing the sum number, create a program that can find the pair of numbers from the array that add up to the sum number

        Add the numbers from the array to determine the possible pairs that add up to the sum

        Ex:
            array = [8, 7, 2, 5, 3, 1]
            sum = 10

            output:
                8 & 2
                7 & 3
     */

        int[] array = {8, 7, 2, 5, 3, 1};


        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == 10) {
                    System.out.println(array[i] + " & " + array[j]);
                }
            }
        }
    }
}
