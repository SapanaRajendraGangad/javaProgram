import java .util.*;
public class NextApp
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
System.out.println("Enter the value of array");
for(int i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
for(int i=0;i<a.length;i++)
{
int next=-1;
for(int j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
next=a[j];
break;
}
}
System.out.printf("next bigger element of %d is %d \n",a[i],next);
}
System.out.printf("next bigger element in array\n");
	for(int i=0;i<a.length;i++)
	{
		int next=-1;
		for(int j=i+1;j<a.length;j++)
		{
		     if(a[i]<a[j])
		      {
		       next=a[j];
		      	break;
		      }
      	}
		System.out.printf("%d\t",next);
	    
	
	}


}
}