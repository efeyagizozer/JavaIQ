package Java.Topics.Arrays;

import java.util.Arrays;

public class ArraysMethods {

    public static void main(String[] args) {


        /////// Arrays Equals \\\\\\\\\

        // it should  Arrays EQUAL() Bbe same order same value

        int score1=85;
        int score2=75;


        String [] array= {"a", "b", "c", "d", "e", "f"};
        String [] array2= {"a", "b", "c", "d", "e", "f"};

        System.out.println(Arrays.equals(array, array2)); // true

        /////// Arrays Sort() \\\\\\\\\
        // sort()
        String [] array3= {"a", "b","z", "c", "d", "e", "f"};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3)); // [a, b, c, d, e, f, z]

        /////// Arrays CopyOfMethod() \\\\\\\\\
        // cpy()

            int [] numbers={100,200,300,400};
            int [] newNumbers=Arrays.copyOf(numbers, 10);
            System.out.println(Arrays.toString(newNumbers)); // [100, 200, 300, 400]

            // or
        int [] secondNumbers=Arrays.copyOf(numbers, 2);
        System.out.println(Arrays.toString(secondNumbers)); // [100, 200]


        /////// Arrays CopyOfRangeMethod() \\\\\\\\\
        // cpyRange()

        int [] numbers1={100,200,300,400};
        int [] numbers2={100,200,300,400};


        int[] numbers3=Arrays.copyOfRange(numbers1,1,3);
        System.out.println(Arrays.toString(numbers3));
        // [200, 300]



        /////// Arrays Looping through  \\\\\\\\\
        // Arrays Looping through
        String [] arrays1={"Cydeo", "java", "Wooden Spoon"};
       for(int i=0;i<=numbers1.length-1;i++){
           System.out.println(arrays1[i]);
       }

       // or

        for(int i=0;i<numbers1.length;i++){
            System.out.println(arrays1[i]);
        }
        /////// Arrays Reverse order through  \\\\\\\\\
        for(int i=numbers1.length-1 ;i>=0;i--){
            System.out.println(arrays1[i]);
        }

        System.out.println("Multi Dimensional Arrays");


        //  int[][]arr2D=new int[3][]; yani iki tane paragrafin icinde 3 tane kume olacak demek

        int[][] arr2dPart = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        System.out.println(arr2dPart.length);//3

        System.out.println("Multi Dimensional Arrays with TosTRING ");

        System.out.println("arr2dPart[1] = " + Arrays.toString(arr2dPart[1]));

        System.out.println("Multi Dimensional Arrays with DeepTosTRING ");

        System.out.println("arr2dPart = " + Arrays.deepToString(arr2dPart));


        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        for(int i=0; i<arr2D.length; i++) {
            int []arr1d=arr2D[i];
            for(int j=0; j<arr1d.length; j++){
                System.out.println(arr1d[j]);
            }
        }

        System.out.println("Loop");



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






    /////// Arrays Multi d Looping through  \\\\\\\\\

