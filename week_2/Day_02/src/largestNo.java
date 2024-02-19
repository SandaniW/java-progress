import java.util.Scanner;

public class largestNo {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scan.nextInt();
        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        System.out.print("Enter third number: ");
        int z = scan.nextInt();
        if ((x>=y) && (x>=z)){
            System.out.println(x+" is the largest");
        }else if ((y>=x) && (y>=z)){
            System.out.println(y+" is the largest");
        }else{
            System.out.println(z+" is the largest");
        }

    }
}
