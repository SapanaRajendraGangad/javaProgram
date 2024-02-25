import java.util.*;
public class MaxMin
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
System.out.println("enter the value of array");
for(int i=0;i<5;i++)
{
a[i]=xyz.nextInt();
}
int max=0;
for(int i=0;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.printf("\nmax value is%d\n",max);
int min=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
System.out.printf("\n min value is %d\n",min);
}
}
