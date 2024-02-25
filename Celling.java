import java.util.*;
public class Celling
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[6];
int i;
System.out.println("enter the value");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
for(i=0;i<a.length;i++)
{
System.out.printf("a[%d]=%d\n",i,a[i]);
}
	System.out.println("enter celling element");
	int p=xyz.nextInt();
	for(i=0;i<a.length;i++)
	{
	if(a[i]>=p)
	{
        System.out.printf("celling of  is %d",a[i]);
	break;
		}
	     }
}
}
