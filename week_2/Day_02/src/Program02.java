import java.util.Scanner;

public class Program02 {
    public static void main(String []arg){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scan.nextInt();
        System.out.print("Enter another number: ");
        int y =scan.nextInt();
        if ((x>5) && (y>0)){
            System.out.println("x and y is greater than 0");
        }else{
            System.out.println("x or y is lesser than 5");
        }
    }
}
