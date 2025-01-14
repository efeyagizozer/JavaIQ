package Java.Topics.Arrays.ArraySorular.Cozduklerimiz;

import java.util.Arrays;

public class IQ02_ConcatArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5};
        int[] arr2 = {8, 12, 5, 9};

        int[] arr3 = new int[arr1.length + arr2.length];

        int k=0;

        for(int i=0;i<arr1.length;i++) {
            arr3[k]=arr1[i];
            k++;
        }

      for(int i=0;i<arr2.length;i++){
          arr3[k]=arr2[i];
          k++;
      }

      System.out.println(Arrays.toString(arr3));  // Output: [1, 4, 5, 8, 12, 5, 9]




    }
     /*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */
}
