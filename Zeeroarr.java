import java .util.*;
public class Zeeroarr
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
}j=0;
for(i=0;i<a.length;i++)
{
if(a[i]!=0)
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
j++;
}
}
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}