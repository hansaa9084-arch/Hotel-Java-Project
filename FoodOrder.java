package Hotel;
import java.util.ArrayList;
public class FoodOrder extends Service{

//---Attributes---
private ArrayList<String>item;
private double foodTotalPrice;
private String deliveryTime;
private int roomNumber;
//---Constructor---
public FoodOrder (String serviceId,int roomNumber,String deliveryTime){
    super(serviceId,"Food Order",0.0);
    this.item = new ArrayList<>();
    this.foodTotalPrice = 0.0;
    this.roomNumber = roomNumber;
    this.deliveryTime = deliveryTime;
}
//---OverRide Methods---
@Override
pubic void processService(){
    setStatus("In Progress");
    System.out.println("Processing food order for room " + roomNumber +"-- delivery at" + deliveryTime);
}
@Override
pubic String getServiceDetalis(){
    return "Food Order"
         +  "| Item : "       + item
         +  "| Room : "       + roomNumber
         +  "| Delivery : "   + deliveryTime
         + " | Price: "       + foodTotalPrice
         + " | Status: "      + getStatus(); 
}
//---Food Methods---
public void addItem(String item,double price){
    items.add(item);
    foodTotalPrice + = price;
    setPrice(foodTotalPrice);
    System.out.println(item+ "added. Total : " + foodTotalPrice);
}
public void removeItem(String item){
    if(item.remove(item)){
        System.out.println(item + "removed from order.");
    }
    else{
      System.out.println(item + "not found in order.")
    }
pubic double calculateFoodTotal(){
    return foodTotalPrice;
}
public void displayOrderItems(){
    System.out.println("Order Items (Room" + roomNumber + ")");
    if(items.isEmpty()){
         System.out.println("No items ordered yet.");
    }
    else {
        for(String item: items){
            System.out.println(item + " /");
        }
        System.out.println("Total :" +foodTotalPrice);
    }

}
}

//---Getters---
public ArrayList<String> getItems(){ return items;}
public int getQuqntity(){return items.size();}
public String getDeliveryTime(){return deliveryTime;}
public int getRoomNumber(){return roomNumber;}
//---Setters---
public void setDeliveryTime(String deliveryTime){this.deliveryTime=deliveryTime;}
}