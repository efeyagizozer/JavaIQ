package Java.Topics.Arrays.ArraySorular.Cozduklerimiz;

public class IQ03_FirstDuplicateElement {
    /*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */

    public static void main(String[] args) {

        // int i=0 = 3
        // int j=0=3 manmtiksiz ikisi ayni sayi


        int[] numbers = {3, 5, 1, 5, -1, 5, 3};
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++){
                if(i!=j && numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                    return;
                }
            }
        }

    }
}
