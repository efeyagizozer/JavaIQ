package Java.Topics.Arrays;

public class ForEach {

    public static void main(String[] args) {
        String[]array={"Ruby", "Java", "Python", "C#"};
//array.for

        for(int i=0; i<array.length; i++){

            System.out.println(array[i]);
        }

       for(String partOfArray : array){
            System.out.println(partOfArray);

       }


    }
}
