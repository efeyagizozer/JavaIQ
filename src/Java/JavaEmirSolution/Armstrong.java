package Java.JavaEmirSolution;

public class Armstrong {

    public static void main(String[] args) {

        System.out.println(isArmstrong(153));

        boolean isFalseOrNot=isArmstrong(153);

        System.out.println(isFalseOrNot);


        int n= 157;
        int sum=0;

        String armstrongNumber="" + n;


        int nLength=armstrongNumber.length();

        for(int i=0; i<nLength ; i++){
            int number=Integer.parseInt(armstrongNumber.substring(i, i+1));
            sum+=   Math.pow(number,nLength);
        }


        boolean isArmstrongNumber= sum==n;

        System.out.println("isArmstrongNumber = " + isArmstrongNumber);

    }


    public static Boolean isArmstrong(int armstrong){
        int sum=0;
        String armstrongNumber=""+ armstrong;
        int length=armstrongNumber.length();
        for(int i=0; i<length ; i++){
            int number=Integer.parseInt(armstrongNumber.substring(i, i+1));
            sum+=   Math.pow(number,length);
        }

        return sum==armstrong;


    }
}
