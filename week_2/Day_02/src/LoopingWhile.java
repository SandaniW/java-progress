import java.util.Scanner;
public class LoopingWhile {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 - 100: ");
        int x = scan.nextInt();while(x<10){
            x++;
            System.out.println(x);
        }
    }
}
