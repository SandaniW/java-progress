import java.util.Scanner;
public class Calculator {
    double numOne;
    double numTwo;
    double total;
    String operation;
    Scanner scan;
    public Calculator(){
        this.numOne=0;
        this.numTwo=0;
        this.total=0;
        this.operation="NA";

    }


    public void getUserInputs(){
        scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        numOne = scan.nextDouble();

        System.out.print("Input second number: ");
        numTwo = scan.nextDouble();

        System.out.print("Input operation(+,-,/,*): ");
        operation = scan.next();

    }
    public void check(){
        if((numOne)!=)
    }
    public void total(){
        System.out.println(numOne+" "+ operation +" "+numTwo +" = " +total);

    }
    public void add(){
        total = numOne + numTwo;

    }
    public void sub(){
        total = numOne - numTwo;

    }
    public void divide(){
        total = numOne / numTwo;

    }
    public void mul(){
        total = numOne * numTwo;

    }
}
