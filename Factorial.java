package Introductiontofunction;
import java.util.*;


public class Factorial {

	public static void main(String[] args) {
		Scanner scn  =new Scanner(System.in);
		int n=scn.nextInt();
		int r=scn.nextInt();
		int nfact=1;
		for(int i=1;i<=n;i++)
		{
			nfact *=i;
		}
		int nmrfact=1;
		for(int i=1;i<=n-r;i++)
		{
			nmrfact *=i;
		}
		int npr=nfact/nmrfact;
		System.out.println("N= "+ n +" R= "+r+" factorial = "+npr);
		

	}

}
