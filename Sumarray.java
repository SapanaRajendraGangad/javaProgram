import java.util.*;
public class Sumarray
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[6];
int sum=0,i,j;
System.out.println("Enter the value of array");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
System.out.println("enter the value of sum");
sum=xyz.nextInt();
for(i=0;i<a.length;i++)
{
for(j=i+1;i<a.length;j++)
{
if(a[i]+a[j]==sum)
{
System.out.printf("%d\t%d",i,j);
}
}
}
}
}
