package Java.Topics.Loops;

public class Loops {


    public static void main(String[] args) {

        //What is loop
        // Loop is repeated action/ for loop- while loop- do while loop


        // branching statement = break statement / continue statement/ return statement

        // break statement exiting from the loop
        System.out.println("  // break statement 1  ");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i== 5) {
                break;
            }
        }

        System.out.println("  // break statement 2  ");
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // Eğer day 1 ise sadece bu blok çalışır ve çıkılır.
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break; // Default her zaman çalışabilir.
        }

        // continue statement skips the current iteration and moves to the next iteration


        System.out.println("  // continue statement skips the current iteration and moves to the next iteration\n");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // return statement exits the method// we can use anywhere // aftert he return exits the method

        System.out.println("  // return statement ");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Current number: " + i);
            if (i == 3) {
                return; // Döngüyü ve metodu burada sonlandırır.
            }
            System.out.println("This is after the return check for i: " + i);
        }
        // Bu kısım asla çalışmaz çünkü return metodu bitirir.
        System.out.println("This line will never be printed.");


    }


    }

