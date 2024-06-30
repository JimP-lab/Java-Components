import java.util.Scanner;
import java.lang.Math;
class Run {
    
    public static void main(String[] args) {
            double a,b,x,y,z;
            Scanner in = new Scanner(System.in);
         System.out.println("enter a value: ");
            a = in.nextInt();
         
       
       System.out.println("enter a value: ");
            b = in.nextInt();
        
        
        

         System.out.println("enter x value:");
            x = in.nextInt();
        
        
        System.out.println("enter y value:");
        y = in.nextInt();
        x= Math.pow(x,5.0);
        y= Math.pow(y,5.0);
        z=(x+y)*(a/b);
        System.out.println("z= "+z);
        
    }
}
