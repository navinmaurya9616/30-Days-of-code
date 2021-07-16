import java.util.Scanner;

public class FirstJavaClass {

	public static void main(String[] args) {
		//System.out.println("Navin");
		//int,float,char,string,long,double
		//int age=18;
		//float avergemarks=19.2345f;
		//char grade='A';
		//String name="Navin";
		//boolean isValid=false;
		//long bigNumber=9876453602l;
		//System.out.println(avergemarks);
        //int firstNumber=1234;
       // int secondNumber=234;
        //double  sum=(double)firstNumber%(double)secondNumber;
        //System.out.println(sum);
        //+,-,*,/,%,++,--
		//int a=12;
		//a=a+1;
		//a++;
		//System.out.println(a++);
		//a--;
		//this statement increament by one
		//System.out.println(a);
		// taking user input
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter your name:");
		//String name=sc.nextLine();
		//System.out.println(name);
		//Conditional statement
		//>,<,>=,<=,==,!=
		//int age=12;
		//if(!(age >18 )) {
		//System.out.println("you can vote");
		//}else{
		//System.out.println("you can not vote");
		//}
		//}
		//System.out.println(19==19);
	   //char grade='A';
		//if(grade=='A')
		//{
			//System.out.println("your grade is very good");
	//	}else if(grade=='B') {
		//	System.out.println("very good,keep learning");
		//}
		//char grade='A';
		//switch(grade)
		//{
		//case 'A':
		//	System.out.println("your grade is very good");
			//break;
		//case 'B':
			//System.out.println("very good, keep learning");
	//	}
		//Loops
		//for,while,do while
		//for(int i=0;i<10;i++)
		//{
			//System.out.println("Navin"+i);
		//}
		//int a=23;
		//while(true)
		//{
			//System.out.println(a);
			//a++;
			//if(a<100)
			//{
				//break;
			//}
		//}
		//arrya;
		
				//	int marks[]=new int[5];
					// marks[0]=23;
					// marks[1]=12;
					// marks[2]=35;
					 //marks[3]=45;
					 //marks[4]=45;
					//for(int i=0;i<marks.length;i++)
				//	{
					//	System.out.println(marks[i]);
					//}
	//	int marks[]= {23,12,56,88,99,98,65};
		//for(int i=0;i<=marks.length;i++)
	//	{
		//	System.out.println(marks[i]);
		//}
		//int a[]	[]= {{1,2},{3,4}};
		 //System.out.println(a[1][1]);
		//Method
		//returnType,functionName(argument){}
		System.out.println(average(3,6));
		System.out.println(average(4,8));
	}
		 static int average(int firstNumber, int secondNumber) {
			int sum =firstNumber+secondNumber;
			return sum/2;
		}
		
	}



