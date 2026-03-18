package HotelExceptions;
public class RoomAlreadyBookedException extends Exception {
    public RoomAlreadyBookedException() { super("Room is already booked."); }
    public RoomAlreadyBookedException(String message) { super(message); }
}
