package Hotel;

public abstract class Booking {
    // Attributes 
    private String bookingId;
    private String checkInDate;
    private String checkOutDate;
    private String bookingDate;
    private String bookingStatus;

    // Constructor
    public Booking(String bookingId, String checkInDate, String checkOutDate, String bookingDate) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingDate = bookingDate;
        this.bookingStatus = "Pending";
    }

    // Setters
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }
    public void setCheckInDate(String checkInDate) { this.checkInDate = checkInDate; }
    public void setCheckOutDate(String checkOutDate) { this.checkOutDate = checkOutDate; }
    public void setBookingDate(String bookingDate) { this.bookingDate = bookingDate; }
    public void setBookingStatus(String bookingStatus) { this.bookingStatus = bookingStatus; }

    // Getters
    public String getBookingId() { return bookingId; }
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
    public String getBookingDate() { return bookingDate; }
    public String getBookingStatus() { return bookingStatus; }

    // Concrete Methods
    public void confirmBooking() { this.bookingStatus = "Confirmed"; }

    public void cancelBooking() { 
        this.bookingStatus = "Cancelled"; 
        System.out.println("Booking " + bookingId + " has been cancelled."); 
    }

    public void extendBooking(String newCheckOutDate){
        System.out.println("Booking " + bookingId + " extended from " 
                           + checkOutDate + " to " + newCheckOutDate);
        this.checkOutDate = newCheckOutDate;
    }
    public void printBookingSummary() {
    System.out.println("Booking Summary:");
    System.out.println("ID: " + bookingId + ", Status: " + bookingStatus);
    System.out.println("Check-in: " + checkInDate + ", Check-out: " + checkOutDate);
}
    // Static Method
    public static void showBookingPolicy(){
        System.out.println("Booking Policy:");
        System.out.println("All bookings must be confirmed before arrival.");
        System.out.println("Check in time is after 2 PM, check out before 12 PM");
        System.out.println("Cancellations must be done at least 24 hours in advance.");
    }

}