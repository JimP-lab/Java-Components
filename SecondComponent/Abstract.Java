
public abstract class Employee  { 
    protected String name;
    double baseSalary;


public Employee( String name, double baseSalary;)
     {
         this.name=name;
         this.baseSalary=baseSalary; 
         
     }
     
     public  void calculateSalary();
    
     
      public  void display();
      System.out.prinln("Manager Name:"+name);
      System.out.prinln("Manager Name:"+name);
      System.out.prinln("Manager Name:"+name);
      System.out.prinln("Manager Name:"+name);
      
}



 public class Manager extends Employee{
     double bonus;
     
 
public Manager(double bonus,String name
    double baseSalary)
     {
         super(name,baseSalary);
         this.bonus=bonus;
         
         public  void calculateSalary(){
             
             
         }
     
     
      public  void display(){
          
      }
     }
 }     
 
public class Programmer extends Employee{
   private double overtimeHours;
   private double hourlyRate;


public Programmer(double overtimeHours,double hourlyRate,String name
    double baseSalary)
     {
         super(name,baseSalary);
         this.overtimeHours=overtimeHours;
         this.hourlyRate=hourlyRate; 
         
     }
     
      public  void calculateSalary(){
             
             
         }
     
     
      public  void display(){
          
      }
}
