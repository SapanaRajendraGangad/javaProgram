import java.util.*;
public class Rearrange
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[8];
int max=0,size;
System.out.println("enter the value of array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the value of size of array");
int size=sc.nextInt();
	System.out.printf("array after sorting\n");
		for(i=0;i<a.length-(size-1);i++)
  {
  for(j=i+1;j<a.length;j++)
{
	if(a[j]>max)

	max=0;
	 int count=0;
   for(j=i;j<size+i;j++)
   {
   System.out.printf("%d\t",a[j]);
   if(max<a[j])
	{
	max=a[j];
   }
}
  }
   System.out.printf(" Max : %d\n",max);
}
}
}
