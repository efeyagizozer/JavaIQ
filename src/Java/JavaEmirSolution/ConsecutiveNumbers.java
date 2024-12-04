package Java.JavaEmirSolution;

import jdk.dynalink.beans.StaticClass;

public class ConsecutiveNumbers {


    public static void main(String[] args) {

        int number = 17;


        for (int i = 1; i <= number; i++) {

            String result = "";
            if (i % 2 == 0) {
                result += "Efe";
            }


            if (i % 3 == 0) {
                result += "Talha";
            }


            if (i % 5 == 0) {
                result += "Hayden";
            }

            if (result.isEmpty()) {
                result = ""+i;
            }

            System.out.println("result = " + result);
        }




    }


}









