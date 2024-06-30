 public interface shape 
{
    double getArea();
    
}
class Rectangle implements shape { 
     private  double length;    // μεταβλητες 
      private double width;
     
     public Rectangle(double length,double width);  // κατασκευαστης
     {
    this.length=length;
    this.Width=Width;
     }
     public double getArea() 
     {
        return length*.width;
       
     }
     
    
}
 public class Circle implements shape {
    double radius;
    
    public Circle(double radius)
    {
        this.radius=radius;
     
    }
    public double getArea() 
    {
        return Math.PI * radius*radius;
    }
    
}

 public class Triangle implements shape {
     private double base;
     private double height;
    
    public Triangle(double base,double height)
    {
    this.base=base;
    this.height=height;
    }
    
    public double getArea() 
     {
        return 0.5* base * height;
       
     }
}