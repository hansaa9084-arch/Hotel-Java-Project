package Hotel;
import java.util.ArrayList;
public class Bill implements Payable {

// Attributes

private String billId;
private Booking booking;
private ArrayList<Service> services;
private double totalAmount;
private boolean paymentSuccessful;
private String paymentDate;

//Constructor

public Bill(String billId, Booking booking, boolean PayementSuccessful, double totalAmount){
this.billId = billId;
this.booking = booking;
this.services= new ArrayList<>();
this.paymentSuccessful= false;    
this.totalAmount= 0;
}


//Getters and setters
public String getBillId(){return billId; }
public void setBillId(String billId){this.billId= billId;}    

public Booking getBooking(){return booking;}
public void setBooking(Booking booking){this.booking = booking;}

public ArrayList<Service> getServices(){return services;}
public void setServices(ArrayList<Service> services){this.services = services;} 

public double getTotalAmount(){return totalAmount;}
//set total amuont is through calculateTotal in payable :)

public boolean getPaymentSuccessful(){return paymentSuccessful;}                          
public void setPaymentSuccessful(boolean paymentSuccessful){this.paymentSuccessful= paymentSuccessful;}  


public String getPaymentDate() {return paymentDate; }

public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate;}


//methods


  // Add aservice to bill
    public void addService(Service service) {
        services.add(service);
    }

    // saves payement date and if its successful or not
    public void markAsPaid(String date) {
        this.paymentSuccessful = true;
        this.paymentDate = date;
    }

    //overriden from payable

    @Override
    public double calculateTotal() {                              
        double roomCost = booking.getRoom().getPricePerNight() * booking.calculateNights();
        double servicesCost = 0;
        for (Service s : services) {
            servicesCost += s.getPrice();
        }
        totalAmount = roomCost + servicesCost;
        return totalAmount;
    }

    @Override
    public void printReceipt() {
System.out.println("--------------------- ");
        System.out.println("RECEIPT: ");
        System.out.println("Bill ID      : " + billId);
        System.out.println("Client       : " + booking.getClient().getName());
        System.out.println("Room         : " + booking.getRoom().getRoomNumber());
        System.out.println("Nights       : " + booking.calculateNights());
        System.out.println("Room cost    : $" + (booking.getRoom().getPricePerNight() * booking.calculateNights()));
           System.out.println("--------------------- ");
        System.out.println("Services: ");
        for (Service s : services) {
            System.out.println("  " + s.getServiceDetails() + " - $" + s.getPrice());
        }
System.out.println("-----------------------------");
        System.out.println("Total Amount : $" + totalAmount);
        System.out.println("Status       : " + (paymentSuccessful ? "Paid" : "Unpaid"));
        if (paymentSuccessful) {
            System.out.println("Paid on      : " + paymentDate);
        }
        System.out.println("-----------------------");
    }

    @Override
    public void applyDiscount(double rate) {
        totalAmount -= totalAmount * rate;
    }

    
    @Override
    public boolean paymentSuccessful() {
        return paymentSuccessful;
    }

}
