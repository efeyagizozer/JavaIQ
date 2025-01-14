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


    }


}
