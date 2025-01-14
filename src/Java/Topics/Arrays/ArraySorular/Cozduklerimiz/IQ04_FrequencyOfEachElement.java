package Java.Topics.Arrays.ArraySorular.Cozduklerimiz;

public class IQ04_FrequencyOfEachElement {
     /*
        Frequency Of Each Element

        Given an array find the frequency of each element. The frequency is the number of times each element appears in the array

        Ex:
            input:
                frequencyElement("Apple","Banana","Apple","Cherry")
            output:
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static void main(String[] args) {

        String[] arr = {"Apple", "Banana", "Apple", "Cherry"};

        String result="";

        for(String first : arr) {
            int count = 0;
            if(!result.contains(first)){
                for(String second : arr) {
                    if(first.equals(second)) {
                        count++;
                    }
                }

                result += first + " = " + count + "\n";


            }

            System.out.println(result);



        }
        System.out.println(result);


       }
    }

