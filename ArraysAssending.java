package Arrays;
import java.util.Arrays;
public class ArraysAssending {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       int arr[]= {23,45,767,8998,987,889};
       int temp=0;
        System.out.println("original Arrays");
        for(int i=0;i<=arr.length;i++)
        {
       	System.out.print(arr[i]+" ");
         }
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if (arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
			
	}
}
}

}
