
class HelloWorld

{
    
    public static void main(String[] args)
    {
        
        int[] myArray1=new int[10];
        int i;
        
        for(i=0;i<10;i++)
        {
             myArray1[i]=i;
             System.out.println(myArray1[i]);
            
        }
        
        
        
    }
}
 

class HelloWorld
{
    
    public static void main(String[] args)
    {
        
        int[] myArray1=new int[10];
        int i;
        int sum=0;
        
        for(i=0;i<10;i++)
        {
             myArray1[i]=i;
             sum=sum-myArray1[i];
             System.out.println(myArray1[i]);
            
        }
        
        
        
    }
}

class HelloWorld {
    public static void main(String[] args) {
    int a,b,c;
    double mesos_oros;
    a=7;
    b=10;
    c=5;
    mesos_oros=(a+b+c)/3.0;
    System.out.println("mesos_oros="+mesos_oros);
    }