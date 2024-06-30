class Car
{ 
     private String brand;
     private String model;
     private double price;
     
     public double getPrice()
     {
         return this.price;
         
     }
     
    
        
    
    
    public Car(String brand,String model,double price )
    {
        this.brand=brand;
        this.model=model;  // μεθοδο 1
        this.price=price;
    }
   
   
   public Car(String brand)
    {
        this.brand=brand; // μεθοδο 2 
    
    }
    
    public Car(String brand,String model )
    {
        this.brand=brand;
        this.model=model; // μεθοδο 3 
    
    }
    
    
    
    
     public void setPrice(double price)
     {
         this.price=price; // μεθοδο 4 
         
     }
     
     public void setmodel(String model)
     {
         this.model=model; // μεθοδο 5 
         
     }
     
    
    public void showinfo()
    {
        System.out.println("brand:"+brand);
        System.out.println("model"+model);
        System.out.println("price:"+price);
        System.out.println();
    }
}



class Main 
{
    
    public static void main(String[] args) 
    {
       
            Car mycar1= new Car("nissan","micra",8000);
            
            mycar1.showinfo();
            
             
            
            Car mycar2= new Car("toyota","corola");
            mycar2.showinfo();
            
            
             mycar2.setPrice(13000);
            mycar2.showinfo();
            
            
            Car mycar3= new Car("fiat");
            mycar3.showinfo();
            
            
            mycar3.setPrice(20000);
            mycar3.showinfo();
            
        
            mycar3.setmodel("punto");
            mycar3.showinfo();
    
    }