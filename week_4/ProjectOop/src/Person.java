public class Person {
    String name;
    int age;
    String email;

    public void Person(){
        System.out.println("Default");
        this.name="null";
        this.age=0;

    }
    public void Person(String name,int age){
        System.out.println("Parametric");

    }
    public void Person(Person person){
        System.out.println("copy");
    }
    public void Person(String name,int age,String email){
        //without calling the paras again, can use it by calling the default paras already called
        this();
        System.out.println("chain");
        this.email;
    }
}
