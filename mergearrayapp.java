import java.util.*;
class Merge
{
int a[],b[];
Merge(int a[],int b[])
{
this.a=a;
this.b=b;
}
int[] getmergearray()
{
int c1=a.length+b.length;
int c[]=new int[c1];
for(int i=0;i<a.length;i++)
{
c[i]=a[i];
}
for(int i=0;i<b.length;i++)
{
c[a.length+i]=b[i];
}
return c;
}
}
public class mergearrayapp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[3];
int b[]=new int[4];
System.out.println("enter the value of first array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the value of second array");
for(int i=0;i<b.length;i++)
{
b[i]=sc.nextInt();
}
Merge m=new Merge(a,b);
int c[]=m.getmergearray();
System.out.println("array after merge");
for(int i=0;i<c.length;i++)
{
System.out.println(c[i]);
}
}
}