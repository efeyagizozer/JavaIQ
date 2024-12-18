package Java.Topics.Loops;

public class NestedLoop {

    public static void main(String[] args) {
        // Nested loop to print numbers from 1 to 10 in a 2D pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j+ " ");
            }
            System.out.println();
        }
    }
}
