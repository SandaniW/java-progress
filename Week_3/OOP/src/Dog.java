public class Dog {
    String name;
    int age;

    //creating a constructor method explicitly or else java makes on its own
    //constructor method starts with a capital
    public Dog(){
        System.out.println("Dog object created using default constructor");
        //if dont explicitly declare default values for the attributes java assigns default values

        age=5;
        name= "rex";
    }
    public Dog(int age,String name){
        this.age = age;
        this.name = name;
        System.out.println("Object created from parameterized constructor");
    }

    public Dog(Dog dog){
        System.out.println("Object created from copy constructor");
        this.age = dog.age;
        this.name = dog.name;
    }

}
