package HotelExceptions;
//
public class HotelExceptions {

public class RoomAlreadyBookedException extends Exception {
    
    public RoomAlreadyBookedException() {
        super("Room is already booked.");
    }

    public RoomAlreadyBookedException(String message) {
        super(message);
    }
}

public class ClientNotFoundException extends Exception {

    public ClientNotFoundException() {
        super("Client not found.");
    }

    public ClientNotFoundException(String message) {
        super(message);
    }
}



public class BookingNotFoundException extends Exception {

    public BookingNotFoundException() {
        super("Booking not found.");
    }

    public BookingNotFoundException(String message) {
        super(message);
    }
}


public class InvalidInputException extends Exception {

    public InvalidInputException() {
        super("Invalid input provided.");
    }

    public InvalidInputException(String message) {
        super(message);
    }
}
}