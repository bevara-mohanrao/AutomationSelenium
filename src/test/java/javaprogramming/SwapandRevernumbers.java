package javaprogramming;
import java.util.Scanner;


public class SwapandRevernumbers {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 15;
		int b = 30;
		int c = 48;
		
		System.out.println("Numbers before the Reverse order " +a+ " and " +b+ " and "+c);
	
		
		int k = c;   // k = 48
		  c=b;       // c=30
		  b=a;       //  b=15
		  a=k;       // a=48

        System.out.println("Numbers after the Reverse order " +a+ " and " +b+ " and "+c);
       
  //Method 2 
        
        int d = 25;
        int e = 40;
        System.out.println("Numbers before the Reverse order "  +d+ " and " +e);
        
        d = d+e;    //65
        e = d-e;    //25
        d=  d-e;   // 40
        
        System.out.println("Numbers after the Reverse order using method 2  "  +d+ " and " +e); 

        //Method 3
        
        d = d*e;   // 1000
        e = d/e;   //25
        d = d/e;  //40
        
        System.out.println("Numbers after the Reverse order using method 3  "  +d+ " and " +e);

    
        //Method 4
        
        e = d+e-(d=e);  // 25
        System.out.println("Numbers after the Reverse order using method 4  "  +d+ " and " +e);

	}*/

	 public static void main(String[] args) {
	

/*	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number for reverse print  ");
	
	int num = sc.nextInt();
	
	int revnum = 0;
	
	while(num!=0)
	{
		
		revnum = revnum * 10 + num%10;
		num = num /10;
	
	}
	
	System.out.println("Reverse print number display "+revnum);  */

	// 2nd method using string builder
	
Scanner sc1 = new Scanner(System.in);
	
	System.out.println("Enter the number for reverse print 2nd method  ");
	
	int num1 = sc1.nextInt();

	
	StringBuilder sb = new StringBuilder();
	sb.append(num1);
	
	StringBuilder rev = sb.reverse();
   
	System.out.println("Reverse print number display "+rev);
	
	

	//3rd method using string buffer
	
	/*Scanner sc3 = new Scanner(System.in);

	System.out.println("Enter the number for reverse Print 3rd method ");
	 
	int num2 = sc3.nextInt();
	
	StringBuffer sb1 = new StringBuffer(String.valueOf(num2));
	 
	StringBuffer revnum1 =  sb1.reverse();
	 
		System.out.println("Enter the number for reverse Print 3rd method " +revnum1);
*/
	sc1.close();
	//sc3.close();
  //  sc.close();
	
	
}
	 
}


