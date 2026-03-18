package Hotel;
public class DoubleRoom extends Room {

    // Extra attribute

    private int numberOfBeds;

    // Constructor

    public DoubleRoom(int roomNumber, double pricePerNight, int numberOfBeds) {
        super(roomNumber, pricePerNight, true, "Double");
        this.numberOfBeds = numberOfBeds;
    }

    // Getter

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    // Setter

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    // Override abstract method

    @Override
    public void getDetails() {
        System.out.println("Double Room Details");
        System.out.println("Room Number   : " + getRoomNumber());
        System.out.println("Room Type     : " + getRoomType());
        System.out.println("Price/Night   : $" + getPricePerNight());
        System.out.println("Available     : " + isAvailable());
        System.out.println("Number of Beds: " + numberOfBeds);
    }

    // Override displayInfo() 

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Beds: " + numberOfBeds);
    }

public void addExtraBed() {
    this.numberOfBeds++;
    System.out.println("Extra bed added. Total beds: " + numberOfBeds);
}

public double applyDiscount(double discountPercent) {
    return getPricePerNight() - (getPricePerNight() * discountPercent / 100);
}



public double calculatePricePerBed() {
    return getPricePerNight() / numberOfBeds;
}


}

