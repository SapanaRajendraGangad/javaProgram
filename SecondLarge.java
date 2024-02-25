import java.util.*;
public class SecondLarge
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
int i,j;
System.out.println("enter the value of");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println(" the value after sorting");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
int large=1;
int slarge=0;
for(i=0;i<a.length;i++)
{
if(a[i]>large)
{
slarge=large;
large=a[i];
}
}
System.out.println("second large element is"+slarge);
}
}