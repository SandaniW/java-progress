import java.util.Scanner;

public class Excercise01 {
    public static void main(String []args){
        System.out.println("What's the temperature(in Celsius)? :");
        Scanner obj = new Scanner(System.in);
        double c = obj.nextDouble(); //declare variables
        double f = c*(1.8) + 32;
        System.out.println("The temperature in F is: " + f);

    }
}
