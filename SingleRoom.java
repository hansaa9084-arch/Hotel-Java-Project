package Hotel;
public class SingleRoom extends Room {

    // Extra attribute

    private boolean hasBalcony;

    // Constructor

    public SingleRoom(int roomNumber, double pricePerNight, boolean hasBalcony) {

        super(roomNumber, pricePerNight, true, "Single");
        this.hasBalcony = hasBalcony;
    }

    // Getter

    public boolean getHasBalcony() {
        return hasBalcony;
    }

    // Setter

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    // Override abstract method

    @Override
    public void getDetails() {

        System.out.println("=== Single Room Details ===");
        System.out.println("Room Number   : " + getRoomNumber());
        System.out.println("Room Type     : " + getRoomType());
        System.out.println("Price/Night   : $" + getPricePerNight());
        System.out.println("Available     : " + isAvailable());
        System.out.println("Has Balcony   : " + hasBalcony);
    }

    // Override displayInfo() 

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Balcony   : " + hasBalcony);
    }


public void checkBalconyView() {
    if (hasBalcony) {
        System.out.println("Room " + getRoomNumber() + " has a balcony");
    } else {
        System.out.println("Room " + getRoomNumber() + " has no balcony");
    }
}


public double applyDiscount(double discountPercent) {
    return getPricePerNight() - (getPricePerNight() * discountPercent / 100);
}


public String getBalconyDescription() {
    if (hasBalcony)
        return "Room " + getRoomNumber() + " includes a private balcony";
    else
        return "Room " + getRoomNumber() + " does not have a balcony";
}


s
public double calculateLongStayDiscount(int nights) {
    if (nights >= 7)
        return getPricePerNight() * nights * 0.90;
    else
        return getPricePerNight() * nights;
}

}

