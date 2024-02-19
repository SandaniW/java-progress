public class Tickets {
    //static keyword to share common values btwn new objects
    //can access static variable using the class without having to make an object
    static int availableTickets=100;
    int name;

    public void doBooking(int Tickets){
        availableTickets=-Tickets;
    }
    public void checkAvailableTickets(){
        System.out.println("No of available tickets: "+ availableTickets);
    }
}
