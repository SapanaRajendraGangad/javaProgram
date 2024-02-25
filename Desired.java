import java.util.*;
public class Desired
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[6];
int i,j,index;
System.out.println("Enter the value of array");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
System.out.println("enter the index of array");
index=xyz.nextInt();
System.out.println("array after deleting the element");
for(i=index;i<a.length-1;i++)
{
a[i]=a[i+1];
}

for(i=0;i<a.length-1;i++)
{
System.out.println(a[i]);
}
}
}
