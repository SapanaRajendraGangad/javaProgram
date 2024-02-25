import java.util.*;
public class MergeArray
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[4];
int b[]=new int[3];
int c[]=new int[7];
int i,j,k;
System.out.println("Enter the value of array1=-->");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
System.out.println("Display the value of array1");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
System.out.println("Enter the value of array2");
for(i=0;i<b.length;i++)
{
b[i]=xyz.nextInt();
}
System.out.println("Display the value of array2");
for(i=0;i<b.length;i++)
{
System.out.println(b[i]);
}
for(i=0,k=0;i<a.length;i++,k++)
{
    c[i]=a[i];
}

for(i=0;i<b.length;i++,k++)
{
    c[k]=b[i];
}
System.out.println("merge array is");
for(i=0;i<c.length;i++)
{
System.out.println(c[i]);
}
for(i=0;i<c.length;i++)
{
for(j=i+1;j<c.length;j++)
{
if(c[i]>c[j])
{
int temp=c[i];
c[i]=c[j];
c[j]=temp;
}
}
}
System.out.println("merge array after assending is");
for(i=0;i<c.length;i++)
{
System.out.println(c[i]);
}
}
}

