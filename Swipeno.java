import java.util.*;
public class Swipeno
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.println("enter the value of array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
int max=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Display the value of array after sorting");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}