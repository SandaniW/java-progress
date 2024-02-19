import java.util.Scanner;

public class UserInputs {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in); //creating  new obj from class Scanner for a system input
        System.out.print("What's your name? : "); //ui
        String name = obj.nextLine(); //using the obj to get the input in variable name which is a String type
        System.out.println("Hi, "+name+" Welcome to Java!");
        System.out.print("How old are you? :");
        String age = obj.nextLine();



    }
}
