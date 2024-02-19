public class Child extends Parent {
    private int noOfMobiles;
    public  void talk(){
        System.out.println("Child is talking...");
    }

    public int getNoOfMobiles() {
        return noOfMobiles;
    }

    public void setNoOfMobiles(int noOfMobiles) {
        this.noOfMobiles = noOfMobiles;
    }
}
