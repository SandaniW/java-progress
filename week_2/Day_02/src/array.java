import java.util.Scanner;
public class array {
    public static void main(String[]args){
        int size = 5;
        int [] numbers = new int[size];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<size;i++){
            System.out.print("Input number: ");
            numbers[i] = scan.nextInt();
        }
        System.out.println("number array:");
        for(int j=0;j<size;j++){
            System.out.println("number["+j+"]: "+numbers[j]);
        }
    }
}
