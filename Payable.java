package Hotel;
public interface Payable {
    double calculateTotal();
    void printReceipt();
    void applyDiscount(double rate); 
    boolean paymentSuccessful();
    
    
}