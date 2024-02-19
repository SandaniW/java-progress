package package2;

import package1.A;

public class C {
    public void display(){
        A a = new A();
        System.out.println(a.numOne); //public - can access in other package
        System.out.println(a.numTwo); // protected - cant on diff package
        System.out.println(a.numThree); //private -cant on diff package
        System.out.println(a.numFour); //default - cant on diff package
    }
}

