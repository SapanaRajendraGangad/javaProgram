import java.util.*;
public class Missing
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
System.out.println("missing value");
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
for(int j=a[i];j<a[i+1]-1;j++)
{
System.out.println(++j);
}
}
}
}