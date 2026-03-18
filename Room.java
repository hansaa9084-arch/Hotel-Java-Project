package Hotel;
public abstract class Room {

    // Attributes 

    private int roomNumber;
    private double pricePerNight;
    private boolean isAvailable;
    private String roomType; 

    // Constructor

    public Room(int roomNumber, double pricePerNight, boolean isAvailable, String roomType) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
        this.roomType = roomType;
    }

    // Getters

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setters
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Abstract method 

    public abstract void getDetails();

    // Concrete method 

    public void displayInfo() {
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Room Type   : " + roomType);
        System.out.println("Price/Night : $" + pricePerNight);
        System.out.println("Available   : " + isAvailable);
    }


public void resetRoom() {
    this.isAvailable = true;
    System.out.println("Room " + roomNumber + " has been reset and is now available");
}


public boolean isExpensive() {
    return pricePerNight > 500;
}


public double calculateWeeklyPrice() {
    return pricePerNight * 7;
}

}



