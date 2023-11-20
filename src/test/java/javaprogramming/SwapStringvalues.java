package javaprogramming;

import java.util.stream.IntStream;

public class SwapStringvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    
		swapstring();
		//arthematic();
		
		//printnumber(5,200);
		
	}
	
	public static void printnumber(int num,int gnum)
	{
		if(num <= gnum)
		{

			num++;
			System.out.println(num);

			printnumber(num,gnum);
			
		}
		
		
	}
	public static void swapstring()
	{
       String str1 = "Mohanrao";
		
	    String str2 = "Bevara";
	    
	     str1 = str1 + str2;  //MohanraoBevara
	     
	    str2 = str1.substring(0,str1.length()-str2.length());
	    str1 = str1.substring(str2.length());
	    
	      
	   String strcomb = str1 + "  " +str2;
	    
	    
       System.out.println("Print the sting value "+str1);
       System.out.println("Print the sting value "+str2);
       System.out.println("Print the sting value "+strcomb);
       
		
	}
	
	public static void arthematic()
	{
		try
		{
			System.out.println("Inside the Try block to execute");
			int i = 10;
			int j = i / 0; 
			//Below code will execute only if the above is satisfied condition to execute.
			System.out.println("This is valid arthematic expression");
	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid arthemetic expression to execute");
		}
		finally
		{
			System.out.println("Inside the finally block to execute");
		} 
		
		
	
		
		
	}

		
	}
	
	

