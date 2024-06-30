public class Main
{
	public static void main(String[] args) {
	    double eisodima=22000, tax;
	    if(eisodima<5000 && eisodima<=10000)
	    {   
	        tax=(5/100.0)*eisodima;
	        
	    }
	    else if(eisodima>100000 && eisodima<=30000)
	    {
	        tax=(15/100.0)*eisodima;
	    }
	    else 
	    {
	        tax=(35/100.0)*eisodima;
	    }
	   System.out.println("For the annual income: " + eisodima + ", tax is " + tax + "\n");
	}
}
