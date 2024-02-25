import java .util.*;
public class Assending
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
System.out.println("Display the array");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
System.out.println("array after assending order");
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