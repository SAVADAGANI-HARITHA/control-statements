package controlStatement;
import java.util.Scanner;
public class VivaOnOddNumbers {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int a,i,n;
			float b=0;
			System.out.println("enter n value");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				System.out.println("enter the a vlaue");
				a=sc.nextInt();
			
				if(a%2==0)
				{
					b =b-0.5f;
					
				}
			    if(a<0)
				{
					b=b-1f;
					
				}
				else if(a%2!=0)
					
				{
					b=b+1f;
				}	System.out.println(b);
			
		}

		}}
