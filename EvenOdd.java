import java.util.*;
public class EvenOdd
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[6];
int i,j;
System.out.println("enter the value of array");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
System.out.println("even value is:\n");
for(i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
System.out.println(a[i]);
}
}
System.out.println("odd value is:\n");
for(i=0;i<a.length;i++)
{
if(a[i]%2==1)
{
System.out.println(a[i]);
}
}
}
}