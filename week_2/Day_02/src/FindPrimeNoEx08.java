import java.util.Scanner;
public class FindPrimeNoEx08 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int remainder = 0;
        int count = 0;
        System.out.print("Enter a number: ");
        int x = scan.nextInt();
        for(int i=1;i<=(x/2);i++){
            remainder = x%i;
            System.out.println("remainder: "+remainder);
            if(remainder==0){
                count++;
                System.out.println("count: "+count);

            }

        }
        if (count==1){
            System.out.println(x+" is a prime");
        }else {
            System.out.println(x+" is not a prime");


        }

    }

}