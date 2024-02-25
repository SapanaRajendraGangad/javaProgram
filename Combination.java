import java .util.*;
public class Combination
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
}int c=0;
System.out.println("the  inversion are");
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
System.out.printf("[%d,%d]",a[i],a[j]);
c++;
}
}
}
System.out.println("the number of inversion found" +c);
}
}