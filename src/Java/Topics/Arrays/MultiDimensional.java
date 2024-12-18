package Java.Topics.Arrays;

import java.util.Arrays;

public class MultiDimensional {

    public static void main(String[] args) {
        System.out.println("Multi Dimensional Arrays");


        //  int[][]arr2D=new int[3][]; yani iki tane paragrafin icinde 3 tane kume olacak demek

        int[][] arr2dPart = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        System.out.println(arr2dPart.length);//3

        System.out.println("Multi Dimensional Arrays with TosTRING ");

        System.out.println("arr2dPart[1] = " + Arrays.toString(arr2dPart[1]));

        System.out.println("Multi Dimensional Arrays with DeepTosTRING ");

        System.out.println("arr2dPart[1] = " + Arrays.deepToString(arr2dPart));


        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        System.out.println("Loop");

        for(int i=0; i<arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
          int []arr1d=arr2D[i];
            for(int j=0; j<arr1d.length; j++){
                System.out.println(arr1d[j]);
            }
        }

        System.out.println("ForEachLoop");
        int[][] newArr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for(int newArr1D[] : newArr2D){
        System.out.println(Arrays.toString(newArr1D));
        for(int each: newArr1D){
            System.out.println(each);

        }
        }



        System.out.println("Reverse Loop");
        int[][] reverse2dLoop = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        for(int i= reverse2dLoop.length-1; i>=0 ; i-- ){
            System.out.println("reverse2dLoop = " + Arrays.deepToString(reverse2dLoop));
            int [] reverse1d= reverse2dLoop[i];
            for(int j=reverse1d.length-1; j>=0; j--){
              System.out.println(reverse1d[j]);
            }

        }









    }
}
