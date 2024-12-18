package Java.JavaEmirSolution;

import javax.xml.transform.Result;
import java.security.PublicKey;

public class Finra {

    public static void main(String[] args) {
          /*
        FINRA - Divisibility by 3 & 5
            alternatives: FIZZBUZZ

        Create a method that will print the numbers from 1 to the given N, but
        if the number is divisible by 3 print "FIN" instead, or
        if the number is divisible by 5 print "RA" instead, or
        if the number is divisible by both 3 & 5 print "FINRA" instead

        parameter: int
        return: void

        Ex:
            input: 30
            output:
                1
                2
                FIN
                4
                RA
                FIN
                7
                8
                FIN
                RA
                11
                FIN
                13
                14
                FINRA
                16
                17
                FIN
                19
                RA
        */

        finRa(14);
        int object = 20;

        for (int i = 1; i <= object; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "Fin";
            }


            if (i % 5 == 0) {
                result += "Ra";
            }

            if (result.isEmpty()) { // Ne 3'e ne 5'e bölünüyorsa
                result += "" + i;
            }

            System.out.println(result);


        }


    }


    public static void finRa(int number) {
        for (int i = 1; i <= number; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "Fin";
            }


            if (i % 5 == 0) {
                result += "Ra";
            }

            if (result.isEmpty()) { // Ne 3'e ne 5'e bölünüyorsa
                result += "" + i;
            }

            System.out.println(result);


        }
    }






}

   /*     public static String today ( int numero) {
            for (int i = 1; i <= numero; i++) {
                String result = "";

                if (i % 3 == 0) {
                    result += "Fin";
                }


                if (i % 5 == 0) {
                    result += "Ra";
                }

                if (result.isEmpty()) { // Ne 3'e ne 5'e bölünüyorsa
                    result += "" + i;
                }

                System.out.println(result);


            }
}
*/








