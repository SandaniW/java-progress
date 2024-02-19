import java.util.Scanner;
public class Calc {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        float n1 = scan.nextInt();
        System.out.print("Input number 2: ");
        float n2 = scan.nextInt();
        float total=0;
        System.out.println("1 for addition");
        System.out.println("2 for substraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        int option;
        System.out.print("Enter your option: ");
        option = scan.nextInt();
        switch (option) {
            case 1: {
                total = add(n1,n2);
                break;
            }
            case 2: {
                total = sub(n1,n2);
                break;
            }
            case 3: {
                total = mul(n1,n2);
                break;
            }
            case 4: {
                total = div(n1,n2);
                break;
            }
            default: {
                System.out.println("Not valid");
                break;
            }
        }
        System.out.println("Total is, "+total);

    }
    public static float add(float num1,float num2){
        return num1+num2;
    }
    public static float sub(float num1,float num2){
        return num1-num2;
    }
    public static float mul(float num1,float num2){
        return num1*num2;
    }
    public static float div(float num1,float num2){
        return num1/num2;
    }
}