package Java.Topics.Arrays.ArraySorular.Task;
import java.util.Arrays;
import java.util.Scanner;
public class AverageNumber {

    public static void main(String[] args) {
/*
        Scanner input= new Scanner(System.in);
        System.out.println("Enter how many number you want");
        int number=input.nextInt();

        while (number > 0) {

            System.out.println("Enter your number");
            int nums=input.nextInt();
            number--;

        }

        int [] totalNumber=new int[number];


        for(int i=0; totalNumber.length>i ; i++){
            totalNumber[i]=nums;
        }
*/
     /*   Scanner input= new Scanner(System.in);

        System.out.println("Enter how many number you want");
        int total=input.nextInt();

        int[] numbers = new int[total];

        int sum=0;

        for(int i=0 ; total>i ; i++){
            System.out.println("Enter your number");
            numbers[i]=input.nextInt();
            sum+=numbers[i];
            double average= (double)sum/ total;
        System.out.println("Numbers: "+ Arrays.toString(numbers));

      */

            /*
      */

        /*Programlama Sorusu

Aşağıdaki özellikleri sağlayan bir Java programı yazınız:

Kullanıcıdan kaç adet sayı girmek istediğini sorunuz.
Girilen sayı kadar kullanıcıdan tam sayılar alınız ve bu sayıları bir dizi içinde saklayınız.
Girilen tüm sayıların toplamını ve ortalamasını hesaplayarak ekrana yazdırınız.
Dizi içindeki tüm sayıları ekrana yazdırınız.*/


        Scanner input= new Scanner(System.in);
        System.out.println("Enter how many number you want");
        int total= input.nextInt();
        System.out.println("total = " + total);

        int [] numbers =  new int[total];

        int sum=0;


        for (int i = 0; i < total; i++) {
            System.out.println("Bir sayı giriniz:" );
            numbers[i] = input.nextInt(); // Kullanıcının girdiği sayı dizide saklanır
            sum += numbers[i]; // Girilen sayı toplam değişkenine eklenir
        }


    }





    }

