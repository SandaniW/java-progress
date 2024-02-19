import java.util.Scanner;

public class Switching {
    public static void main(String []args){
        //if break not used will start running the rest of the cases
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter int(from 1-4): ");
        int x = scan.nextInt();
        switch(x){
            case 1 : {
                System.out.println("Selected option 1");
                break;
            }
            case 2 :{
                System.out.println("Selected option 2");
                break;
            }
            case 3 :{
                System.out.println("Selected option 3");
                break;
            }
            case 4 :{
                System.out.println("Selected option 4");
                break;
            }
            default:{
                System.out.println("Unavailable case");
            }
        }

    }
}
