public class Unchecked {
    public static void main(String []args){
        int x=10;
        int y=0;
        int z=0;
        int []nums = new int[5];
        try{
            nums[5]=10;
            z=x/y;

        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("I handled the exception");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("I handled the exception in the array index");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("using exception class");
        }finally{
            System.out.println("cleaning memory and closing connections");
        }
        System.out.println(z);
    }
}
