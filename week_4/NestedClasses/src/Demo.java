public class Demo {
    public static void main(){
        Outer outer = new Outer();
        outer.out = 100;

        Outer.Inner inner = outer.new Inner();
        inner.in = 200;
    }
}
