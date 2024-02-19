public class Demo {
    public static void main(String []args){
        Parent parent = new Parent();
        parent.think();
        parent.setBankBalance(1);
        System.out.println(parent.getBankBalance());

        Child child = new Child();
        child.setNoOfMobiles(2);
        System.out.println(child.getNoOfMobiles());
        child.talk();
        child.think();
        child.getBankBalance();
    }
}
