public class CustomExceptions {
    public static void main(String []args){
        CustomExceptions exp = new CustomExceptions();
        int results = exp.div(100,0);
        System.out.println(results);
    }
    public int div(int x,int y) {
        if (y == 0) {
            throw new ArithmeticException("Y cannot be zero");
        } else {
            return x / y;
        }
    }
}
