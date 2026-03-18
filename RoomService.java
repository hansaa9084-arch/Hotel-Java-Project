package Hotel;
public class RoomService extends Service{
//---Attributes---
private String serviceType;
private String scheduledTime;
private int roomNumber;
//---Constructor---
public RoomService(String serviceId,String serviceType,String scheduledTime,int roomNumber){
    super(serviceId,serviceType,50.0);
    this.serviceType=serviceType;
    this.scheduledTime=scheduledTime;
    this.roomNumber=roomNumber;
}
//---OverRide Methods---
@Override
public void processService(){
    setStatus("in progress");
    System.out.println("Processing room service:" + serviceType + "for room" + roomNumber + "at" + scheduledTime );
}
@Override
public String getServiceDetalis(){
    return "Room Service"
    + "| Type :" + serviceType
    + "| Room :" + roomNumber
    + "| Time :" + scheduledTime
    + "| Price :"+ getPrice()
    + "| Status :"+ getStatus();
}
//---Getters---
public String getServiceType()   { return serviceType; }
public String getScheduledTime() { return scheduledTime; }
public int    getRoomNumber()    { return roomNumber; }
//---Setters---
public void setServiceType(String serviceType)     { this.serviceType   = serviceType; }
    public void setScheduledTime(String scheduledTime) { this.scheduledTime = scheduledTime; }
}