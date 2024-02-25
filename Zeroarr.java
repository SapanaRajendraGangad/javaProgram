import java .util.*;
public class Zeroarr
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
int i,j;
System.out.println("enter the velue of array");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]!=0)
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}