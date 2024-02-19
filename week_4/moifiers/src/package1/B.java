package package1;

public class B {
    public void display(){
        A a = new A();
        System.out.println(a.numOne);
        System.out.println(a.numTwo);
        System.out.println(a.numThree); //private not working for diff class in same package
        System.out.println(a.numFour);
    }
}
