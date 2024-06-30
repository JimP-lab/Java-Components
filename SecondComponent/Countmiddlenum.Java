import java.util.Scanner;

class HelloWorld
{
    public static void main(String[] args)
    {
    int i,g;
    
    
    Scanner in = new Scanner(System.in);
    
    
    System.out.println("enter i value: ");
    i= in.nextInt();
    
    
    
    System.out.println("enter g value: ");
    g= in.nextInt();
    
    System.out.println("sum is "+(i+g));
}