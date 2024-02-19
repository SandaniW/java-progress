public class Demo {
    public static void main(String[]args){

        Calculator calculator = new Calculator();
        calculator.getUserInputs();
        if(calculator.operation.contains("+")){
            calculator.add();
        }else if (calculator.operation.contains("-")){
            calculator.sub();
        }else if (calculator.operation.contains("/")){
            calculator.divide();
        }else if (calculator.operation.contains("*")){
            calculator.mul();
        }else{
            System.out.println("Invalid input");
        }
        calculator.total();
    }
}
