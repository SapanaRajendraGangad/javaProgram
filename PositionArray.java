import java.util.*;
public class PositionArray
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[6];
System.out.println("enter the value of array");
for(int i=0;i<a.length-1;i++)
{
a[i]=xyz.nextInt();
}
System.out.println("Display the value of array");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
int index,value;
System.out.println("enter the value");
value=xyz.nextInt();
System.out.println("enter the index");
index=xyz.nextInt();
for(int i=a.length-2;i<=index;i--)
{

a[i+1]=a[i];
}
a[index]=value;
System.out.println("Display the value of array");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}