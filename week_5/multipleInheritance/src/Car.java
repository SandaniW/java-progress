public class Car implements Vehicle,Engine{
    //Override shows shows that the method is taken from somewhere else, that its abstract
    //interface makes the variables a standard 
    @Override //does not need to declare if wanted
    public void start(){
        System.out.println("Vehicle started...");
    }
    // like here
    public void start(int a){
        System.out.println("Vehicle started...");
    }
    @Override
    public void stop(){
        System.out.println("Vehicle stopped...");
    }
    @Override
    public void run(){
        System.out.println("Vehicle running...");
    }

}
