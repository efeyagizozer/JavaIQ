package Java.Topics.Arrays.ArraySorular.Cozduklerimiz;
import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6};
        int k = 0;


        int[] arrSum = new int[arr2.length + arr1.length];


        for (int i = 0; i < arr1.length; i++) {
            arrSum[k] = arr1[i];
            k++;
        }

        System.out.println("arrSum = " + Arrays.toString(arrSum));


        for (int i = 0; i < arr2.length; i++) {
            if (arrSum[k].equals(arr2[i])) {
                k++;
            }

            System.out.println("arrSum = " + Arrays.toString(arrSum));






















     /*   for(int i=0; arr1.length>i ; i++){
            arr3[k]=arr1[i];
            k++;
        }

        for(int i=0 ; arr2.length>i ; i++){
            arr3[k]=arr2[i];
            k++;
        }


        System.out.println(Arrays.toString(arr3));


*/


        }
    }


}
