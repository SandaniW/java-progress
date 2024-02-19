package package1;

public class A {
    public int numOne;
    protected  int numTwo;
    private  int numThree;
    int numFour;

    public void display(){
        System.out.println(this.numOne);
        System.out.println(this.numTwo);
        System.out.println(this.numThree);
        System.out.println(this.numFour);
    }
    // all modifiers working for same class
}
