import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = scan.nextLine(); //to get the first char of a string -> .charAt(0); and make the type char
        switch (letter){
            case "a", "e","i","o","u","A","E","I","O","U":{
                System.out.println(letter+" is a vowel");
                break;
            }
            default:{
                System.out.println("Its a consonant");
            }
        }
    }
}
