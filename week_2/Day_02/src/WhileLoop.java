import java.util.Scanner;
public class WhileLoop {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int c = 0;
        System.out.print("Enter Number: ");
        int n = scan.nextInt();
        while(c<n){
            c++;
            System.out.println(c);
        }
    }
}
