public class Demo {
    public static void main(String []args){
        Person personOne = new Person();
        personOne.name = "John Doe";
        personOne.age = 23;
        //another object
        Person personTwo = new Person(); //Person() is a constructor
        personTwo.name = "Kasun Dias";
        personTwo.age = 40;
        /*
        System.out.println(personOne.name);
        System.out.println(personOne.age);
        */
        personOne.talk();
        personTwo.talk();
        personOne.walk();
        personTwo.walk();

        //calling an object without a object reference
        //cant call it back since it has no name
        new Person().walk();

        //new - for instantiate
        //constructor - for initializing = assigning default values
        Dog dogOne=new Dog();
        System.out.println(dogOne.age);
        System.out.println(dogOne.name);

        Dog dogTwo = new Dog(12,"Max");
        System.out.println(dogTwo.name);
        System.out.println(dogTwo.age);



    }
}
