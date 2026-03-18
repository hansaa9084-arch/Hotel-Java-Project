package Hotel;
public class Suite extends Room {

    // Extra attributes

    private boolean hasJacuzzi;
    private int numberOfRooms;

    // Constructor

    public Suite(int roomNumber, double pricePerNight, boolean hasJacuzzi, int numberOfRooms) {
        super(roomNumber, pricePerNight, true, "Suite");
        this.hasJacuzzi = hasJacuzzi;
        this.numberOfRooms = numberOfRooms;
    }

    // Getters

    public boolean getHasJacuzzi() {
        return hasJacuzzi;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    // Setters

    public void setHasJacuzzi(boolean hasJacuzzi) {
        this.hasJacuzzi = hasJacuzzi;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    // Override abstract method

    @Override
    public void getDetails() {
        System.out.println("=== Suite Details ===");
        System.out.println("Room Number   : " + getRoomNumber());
        System.out.println("Room Type     : " + getRoomType());
        System.out.println("Price/Night   : $" + getPricePerNight());
        System.out.println("Available     : " + isAvailable());
        System.out.println("Has Jacuzzi   : " + hasJacuzzi);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }


public void displaySuiteFeatures() {
    System.out.println("Has Jacuzzi: " + hasJacuzzi);
    System.out.println("Number of Rooms: " + numberOfRooms);
}



public double applyRoomDiscount(double applyRoomDiscount) {
    return getPricePerNight() - (getPricePerNight() * applyRoomDiscount / 100);
}

public double calculateTotalRoomsPrice() {
    return getPricePerNight() * numberOfRooms;
}

public double applyLuxuryTax() {
    if (hasJacuzzi)
        return getPricePerNight() * 1.15;
    else
        return getPricePerNight();
}

}

