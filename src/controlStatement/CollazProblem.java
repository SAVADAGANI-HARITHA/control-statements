package controlStatement;
import java.util.Scanner;

public class CollazProblem {

		public static void main(String[] args) {
			int n;
			Scanner sc= new Scanner(System.in);
			System.out.println("enate n value");
	        n =	sc.nextInt();
	        
	        while (n!=1)
	        {
	        	System.out.println(n+" ");
	        	if(n%2==0)
	        	{
	        		n=n/2;
	        	}
	        	else
	        	{
	        		n=3*n+1;
	        	}
	        	
	        	
	        }
	        	
	        System.out.print(n); 
	        	
	        
		}

	}
