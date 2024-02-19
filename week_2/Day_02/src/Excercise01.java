import java.util.Scanner;
public class Excercise01 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        for(int count=1;count<num;count++){
            //
            if ((count%23)==0){
                break;
            }
            //skip when 5
            if ((count%5)==0){
                continue;
            }
            System.out.println(count);
        }

    }
}
