package Constructor_and_Inheritance;
import java.util.*;
interface ArrayOperationApp
{
	void performOperation(int a[]);
}
class Sort implements ArrayOperationApp{
	int a[];
	public void performOperation(int x[])
	{
		this.a=x;
	}
	void sorting()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
	}
}
}
 class Insertion implements ArrayOperationApp{
	 int a[];
	 public void performOperation(int x[])
		{
			this.a=x;
		}
	 void insertelement()
	 {
		 Scanner sc=new Scanner(System.in);
		 int index,value;
		 System.out.println("enter the value");
		 value=sc.nextInt();
		 System.out.println("enter the index which you wants");
		 index=sc.nextInt();
		 for(int i=a.length-2;i<=index;i--)
		 {
			 a[i+1]=a[i];
		 }
		 a[index]=value;
		 for(int i=0;i<a.length+2;i++)
		 {
			 System.out.println(a[i]);
		 }
	 }
 }
public class ArrayOperation {
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("enter the value of array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	Sort s=new Sort();
	s.performOperation(a);
	s.sorting();
	Insertion in=new Insertion();
	in.performOperation(a);
	in.insertelement();
}
}
