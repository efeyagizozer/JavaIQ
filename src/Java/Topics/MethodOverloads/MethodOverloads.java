package Java.Topics.MethodOverloads;

public class MethodOverloads {


    public static void main(String[] args) {

        //Method overloading allows us to have more than one method with the same name


        //class -> method(x)
        //class -> method(x,y)
        //class -> method(x,y,z)

        // parameters must be different

        // the return type, access modofiers of the overloaded method can be same or different




    }


    public static void displayMessage(){

        //PUBLIC = ACCESS MODIFIER
        //STATIC= STATIC MODIFIER- METHOD GONNA CAL THE THROUGH THE CLASSNAME
        // VOID-  RETURN TYPE
        // displayMessage() IN THERE PARANTHESIS FOR ARGUMENTS
        //method body
        System.out.println("Hello World");
        System.out.println("Hello World1");



    }


    public static int displayInt(){

        int value =10;

        //PUBLIC = ACCESS MODIFIER
        //STATIC= STATIC MODIFIER- METHOD GONNA CAL THE THROUGH THE CLASSNAME
        // VOID-  RETURN TYPE
        // displayMessage() IN THERE PARANTHESIS FOR ARGUMENTS
        //method body
        System.out.println("Hello World");
        System.out.println("Hello World1");


        return value;



    }



    public static int displayString(int a, int b ){

        return a+b;
    }



    public static int displayString(int a, int b, int c ){

        return (a+b+c);
    }

    public static void displayString(int a, int b, int c, int d ){
        int result =a +b +c + d;
        System.out.println(result);
    }
}
