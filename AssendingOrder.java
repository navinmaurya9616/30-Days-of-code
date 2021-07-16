package ArraysSort;
import java.util.Scanner;

public class AssendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		
		System.out.println("Enter the number");
		int m=sc.nextInt();
		System.out.println("Enter Array");
		for(int i=0;i<m;i++)
		{
			int num[]=new int[i];
			for(int j=i+1;j<m;j++)
			{
				if(num[i]>num[j])
				{
					a=num[i];
					num[i]=num[j];
					num[j]=a;
				}
			}
			System.out.println("Assending order");
		}
	System.out.println("Assending order");

		
		
		
		

	}

}
