package Hotel;
public class Client {
    private String clientName;
    private  String clientAddress;
    private String clientPhone;
    private  String clientEmail;
    private  String clientGender;
     private int clientID;
      private  String clientNationality;
      
      Client(){
          clientName = " ";
          clientAddress = " ";
          clientPhone = " ";
          clientEmail = " ";
          clientGender = " ";
          clientID = 0 ;
          clientNationality = " ";
          
          
          
      };
      public Client(int clientID,String clientName,String clientPhone,String clientGender,String clientNationality,String clientEmail,String clientAddress){
          
           this.clientID = clientID;
           this.clientName = clientName;
           this.clientPhone = clientPhone; 
           this.clientGender = clientGender;
           this.clientNationality = clientNationality;
           this.clientEmail =clientEmail ;
           this.clientAddress =clientAddress ;
              
}
      
      //getters
       public String getclientName(){
         return clientName;
     }
      
       public String getclientAddress(){
         return clientAddress;
     }
       
         public String getclientEmail(){
         return clientEmail;
     }
       
         public String getclientGender(){
         return clientGender;
     }
       
         public String getclientNationality(){
         return clientNationality;
     }
       
        public String getclientPhone(){
         return clientPhone;
     }
       
      
        public int getclientID(){
         return clientID;
     }
       
      
         
      //setters
        
        public void setclientName(String clientName){
            this.clientName = clientName;
        }
      
      
        public void setclientAddress(String clientAddress){
            this.clientAddress =clientAddress;
        }
      
      
        public void setclientEmail(String clientEmail){
            this.clientEmail =clientEmail ;
        }
      
      
         public void setclientGender(String clientGender){
            this.clientGender = clientGender;
        }
      
      
        public void setclientNationality(String clientNationality){
            this.clientNationality = clientNationality;
        }
      
      
        public void setclientPhone(String clientPhone){
            this.clientPhone = clientPhone; 
        }
      
        public void setclientID(int clientID){
            this.clientID = clientID;
        }
      
      public void displayClientInfo(){
          System.out.println("Client ID: " + clientID);
          System.out.println("Client Name: " + clientName);
          System.out.println("Client Phone: " + clientPhone);
          System.out.println("Client Gender: " + clientGender);
          System.out.println("Client Nationality: " + clientNationality);
          System.out.println("Client Email Address: " + clientEmail);
          System.out.println("Client Address: " + clientAddress);
      }
      
      
      public void updateDetails(String clientEmail,String clientPhone,String clientAddress){
          setclientEmail(clientEmail);
          setclientPhone(clientPhone);
          setclientAddress(clientAddress);
          System.out.println("Details Updates Succesfully.");
      
      
}
      
}

