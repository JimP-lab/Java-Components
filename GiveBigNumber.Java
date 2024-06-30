import java.util.Scanner;
class HelloWorld
{
    public static void main(String[] args)
    {
    int v,e;
    
    
    Scanner in = new Scanner(System.in);
    
    
    System.out.println("enter v value: ");
    v= in.nextInt();
    
    
    
    System.out.println("enter e value: ");
    e= in.nextInt();
    
    if(v>e)
    {
        System.out.println("megalitero einai to v="+v);
    }
    
    else if(e>v)
    {
        System.out.println("megalitero einai to e="+e);
    }
    
    }
}