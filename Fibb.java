package Introductiontofunction;

public class Fibb {

	public static void main(String[] args) {
		int n1=0,n2=1,sum,i,count=10;
		System.out.println(" "+n1 +"  "+ n2);
		for(i=2;i<count;i++) {
			sum=n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
		}
			

	}

}
