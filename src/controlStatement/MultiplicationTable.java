package controlStatement;
import java.util.Scanner;
public class MultiplicationTable {
		public static void main(String[] args) {
			int n,m,i=1,sum;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n");
			n=sc.nextInt();
			System.out.println("Enter m");
			m=sc.nextInt();
			while(i<=m) {
				sum=i*n;
				System.out.println(+i+"*"+n+"="+sum);
				i++;
			}
		}

	}
