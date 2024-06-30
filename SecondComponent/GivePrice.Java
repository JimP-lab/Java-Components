public class  Boat {                  >> δηλωνω τις τιμες 
     private String color;
     private int number;
     private double timi;
     
     public double getPrice()
     {
         return this.timi;
     }
        
        
    
    }
    public Boat(String color, int number,double timh ){            κατασκευαστης 
        this.color=color;
        this.number=number;
        this.timh=timh;
    }
   
    
    
    public void showinfo()                                    δειχνει και εκτυπωνει την πληροφορια 
    {
        System.out.println("colour:"+colour);
        System.out.println("Number of machines"+number_machines);
        System.out.println("Price:"+Price);
    }
}