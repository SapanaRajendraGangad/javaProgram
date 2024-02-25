import java.util.*;
public class RotateArray
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[8];
int i,j;
System.out.println("Enter the value of array");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
System.out.println("Enter the value of index");
 int index=xyz.nextInt();
for(i=0;i<=index;i++)
{
int temp=a[0];
for(j=0;j<a.length-1;j++)
{
a[j]=a[j+1];
}
a[7]=temp;
}
System.out.println("the value of merge array");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
