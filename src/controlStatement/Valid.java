package controlStatement;
import java.util.Scanner;
public class Valid {
			public static void main(String[] args) {
		long n;
		int count=0,i=0,m,a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter m value");
			m=sc.nextInt();
			while(i<=m) {
				System.out.println("enter the number");
				a=sc.nextInt();
				if(a%m==0)
				{
					count++;
					
				}else {
					System.out.println("The number of valid numbers entered is"+count);break;
				}i++;
			}
		}

	}

