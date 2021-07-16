package Java_Foundation;

public class Variable {

	public static void main(String[] args) {
		int x=10;
		int y=15;
		int sum=x+y;
		System.out.println(sum);
		
		int mul=x*y;
		System.out.println(mul);
		
		int v1=x/y;
		int v2=y/x;
		int v3=y%x;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		int bod=x*y/x+x;
		System.out.println(bod);
		int bod1=(x*y)+(y%x);
		System.out.println(bod1);
	}

}
