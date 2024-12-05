package Java.JavaEfeSolutions;

public class Armstorng {

    public static void main(String[] args) {

   /*     int armstrong = 157;
        int sum =0;

        String armstrongNum=""+armstrong;

        int ArmstrongLength = armstrongNum.length();

        for (int i = 0; i < ArmstrongLength; i++) {

           int ED = Integer.parseInt(armstrongNum.substring(i, i+1));
          sum += Math.pow(ED,ArmstrongLength);

        }

        boolean isArmstrongNum = sum == armstrong;*/

        System.out.println("isArmstrongM() = " + isArmstrongM(153));

    }

    public static Boolean isArmstrongM(int armstrongM) {

        int sum =0;

        String armstrongNum=""+armstrongM;

        int ArmstrongMLength = armstrongNum.length();

        for (int i = 0; i < ArmstrongMLength; i++) {

            int ED = Integer.parseInt(armstrongNum.substring(i, i+1));
            sum += Math.pow(ED,ArmstrongMLength);

        }

        return  sum == armstrongM;

    }





}
