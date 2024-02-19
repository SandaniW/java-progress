import java.util.Scanner;
public class OddEven {
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scan.nextInt(); // Integer.parseINT to convert string to int
        int remainder =  x % 2;
        if (remainder == 0){
            System.out.println(x+" is even");

        }else {
            System.out.println(x+" is odd");
        }

    }


}
