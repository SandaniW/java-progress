public class InputValidationException extends RuntimeException{
    public InputValidationException(){

    }
    public InputValidationException(String message){
        //when super not called the string passed is not printed
        //calling super cuz it already has the ability to print a string
        //already has parameterized constructor
        super(message);
    }
}
