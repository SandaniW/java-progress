import java.util.Scanner;
public class PrintPrimes {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("Primes between 1 and "+ num+":");
        int count;
        int remainder;
        for(count=2;count<=num;count++){
            int remains=0;

            for(int i=1;i<=(count/2);i++){
                remainder = count%i;

                if (remainder==0){
                    remains++;

                }

            }
            if (remains==1){
                System.out.println(count);
            }
        }
    }
}
