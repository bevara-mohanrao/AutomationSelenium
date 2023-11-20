package javaprogramming;
import java.util.Arrays;

public class Arraysamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    //char vowels[] = {'i','u','o','a','e'};

		char Vowels[] = new char[5];
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		//int tableval = 6;
		int output;
		
		Vowels[0] = 'u';
		Vowels[1] = 'e';
		Vowels[2] = 'a';
		Vowels[3] = 'i';
		Vowels[4] = 'o';

Arrays.sort(Vowels);
		
		System.out.println(Arrays.toString(Vowels));
		
		
		for(int i=0;i<numbers.length;i++)
		{
			sum = sum+numbers[i];
		//	System.out.println(numbers[i]);
		}
		System.out.println(sum);
		
		
		
	/*	for(int tableval=1;tableval <=10;tableval++)
				{
		for(int multiply=1;multiply <= 20;multiply++)
		{
			
			System.out.printf(" %d x %d = %d \n",tableval,multiply,tableval * multiply);
			
		}
		
				} */
		
    

	}

}
