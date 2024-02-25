import java .util.*;
public class Distinctpairs
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
System.out.println("enter the value of sum");
int p=xyz.nextInt();
int c=0;
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]-a[j]==p||a[j]-a[i]==p)
{
System.out.printf("the distinct pairs are [%d,%d]",a[i],a[j]);

}
}
}
}
}