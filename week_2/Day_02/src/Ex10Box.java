import java.util.Scanner;
public class Ex10Box {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scan.nextInt();
        if(num>0){
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }else{
            System.out.println("Input not valid");
        }
    }
}