package Java.Topics.Ifs;

public class IfTernary {
    public static void main(String[] args) {

/*
Bir kullanıcıdan bir tam sayı al.

Eğer sayı 10'a eşitse konsola "Sayı 10!" yazdır.
Eğer sayı 10'dan büyükse konsola "Sayı 10'dan büyük!" yazdır.
Eğer sayı 10'dan küçükse konsola "Sayı 10'dan küçük!" yazdır.
Bu işlemi önce if-else, sonra switch, ardından da ternary operatörüyle çöz.
İşte başlamak için kod iskeleti:
 */
        int score= 75;
        String result;

        if(score>=60){
            result = "Pass";
        }else {
            result = "Fail";
        }

        System.out.println(result);

        System.out.println("=======================");


        String resul2=(score>=60)?"Passed":"Failed";
        System.out.println(resul2);


        int number= 10;

        System.out.println("=====Ternary-Else============");

        String result3=(number>0)?"Positive":(number<0)?"Negative":"Zero";


        System.out.println(result3);


        System.out.println("=====Ternary Nested ============");


        int score1=185;
        String result1;

       result1= (score1>=0 && score1<=100)?(score1>=60)?"True":"Wrong":"Invalid";



        System.out.println( result1);


        System.out.println("=====Switch Statement ============");


        char grade='A';
        int gradScore;

        if(grade=='A'){
            gradScore=90;
        }else if(grade=='B'){
            gradScore=80;
        }else if(grade=='C'){
            gradScore=70;
        }else if(grade=='D'){
            gradScore=60;
        }else{
            gradScore=0;

        }




        switch(grade) {
            case 'A':
                gradScore=90;
                break;
            case 'B':
                gradScore=80;
                break;
            case 'C':
                gradScore=70;
                break;
            case 'D':
                gradScore=60;
                break;
            default:
                gradScore=0;
        }


        char grade1 = 'A';
        int gradScore1 = switch (grade1) {
            case 'A' -> 90;
            case 'B' -> 80;
            case 'C' -> 70;
            case 'D' -> 60;
            default -> 0;
        };

        System.out.println("Grade score: " + gradScore1);



        char emir1='B';
        int emirScore1 = switch (emir1) {
            case 'A' ->90;
            case 'B' ->80;
            case 'C' ->70;
            case 'D' ->60;
            default -> 0;

        };

        System.out.println("Emir score: " + emirScore1);

        System.out.println("=======================");



int finalGrade1=49;

        String finalGrade=(finalGrade1>=0 && finalGrade1<=100)?(finalGrade1<=100 && finalGrade1>=85)?"A":
                (finalGrade1<85 && finalGrade1>=65)?"B":(finalGrade1<65 && finalGrade1>=50)?"C":" failed":"invalid score ";

        System.out.println(finalGrade);


    }
}
