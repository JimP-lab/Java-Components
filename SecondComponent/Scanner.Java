.>>
import java.io.*;
import java.util.Scanner;


class Students {
    private int am;
    private String surname;
    private String name;

public Students (int am,String surname,String name )
     {
         this.am=am; 
         this.surname=surname; 
         this.name=name; 
         
     }
     
     public void printData()
     {
         System.out.println("---------------------");
         System.out.println("student information ");
         System.out.println("am: "+am);
         System.out.println("surname: "+surname );
         System.out.println("name: "+name);
     }
}

class Main
{
        
    
    public static void main(String[] args) throws IOException
    {
        String ams;
        String surname;
        String name;
        int am,i;
         Students[] foititis = new Students[3];
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        
        for(i=0; i<3; i++) 
        { 
            
        
        
        
            
        
        
        
        System.out.printf("Enter AM: ");
        
        ams=stdin.readLine();
        am=Integer.parseInt(ams); 
        
        System.out.printf("Enter Surname: ");
         surname=stdin.readLine(); 
        
        
        System.out.printf("Enter Name: ");
         name=stdin.readLine(); 
         
        foititis[i] = new Students(am,surname,name);
        
        }