package Java.Topics.Loops;

public class ForEachLoop {

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};

        // for-each döngüsü
        for (int number : numbers) {
            System.out.println("Current number: " + number);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Current number: " + numbers[i]);
        }
    }
}
