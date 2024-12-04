package Java.Topics.Ifs;

public class IfTalha {

    public static void main(String[] args) {

        int score = -5;

        if(score>=0 && score<101){
                if(score>=85 && score<= 100){
                System.out.println("A");
            }else if(score<85 && score>=75){
                System.out.println("B");
            }else if(score<75 && score>=65){
                System.out.println("C");
            }else {
                System.out.println("failed");
            }
        }else{
            System.out.println("Invalid score");
        }


        System.out.println("=====Ternary Statement ============");

        String result1=(score>=0 && score<101)?(score>=85 && score<= 100)?"A":(score<85 && score>=75)?"B":(score<75 && score>=65)?"C":"failed":"invalid score";
        System.out.println(result1);

        System.out.println("=====Switch Statement ============");


        String result2;






    }
}
