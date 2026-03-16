package Hotel;
public abstract class Service{
//---Attributes---
    private String seviceId;
    private String serviceDescription;
    private double servicePrice;
    private String serviceStatus;
}
//---Constructor---
public Service(String serviceId,String serviceDescription,double servicePrice,String serviceStatus){
    this.serviceId=serviceId;
    this.serviceDescription=serviceDescription;
    this.servicePrice = servicePrice;
    this.serviceStatus= "pending";//The Defualt for the system is to be "Panding"
}
//---Abstract Methods---
public abstract void processService();
public abstract String getServiceDetalis();

//---Concrete Methods---
public void cancelService(){
    this.serviceStatus="Cancelled";
    System.out.println("Service"+serviceId+"has been cancelled.");
}
public void displayServices(){
    System.out.println("====Service Informations===");
System.out.println("ID          : " + serviceId);
        System.out.println("Description : " + serviceDescription);
        System.out.println("Price       : " + servicePrice);
        System.out.println("Status      : " + serviceStatus);}
//---Getters---
public String getServiceId(){return serviceId;}
public String getDescription(){return serviceDescription}
public double getPrice(){return servicePrice}
public String getStatus(){return serviceStatus}
//---Setters---
public void setServiceId(String serviceId){this.serviceId=serviceId;}
public void setDescription(String serviceDescription){this.serviceDescription=serviceDescription;}
public void setPrice(double servicePrice){this.servicePrice = servicePrice;}
public void setStatus(String serviceStatus){this.serviceStatus= serviceStatus}