import java.util.Scanner;
public class BackwardStrings {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a word: ");
        String name = scan.nextLine();
        int length = name.length();
        while(length!=0){
            length--;
            System.out.print(name.charAt(length));

        }
    }
}