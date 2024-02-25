import java.util.*;
public class SumArray2D
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
int sum=0;
System.out.println("enter the value of array");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
a[i][j]=xyz.nextInt();
}
}
System.out.println("enter the value of array");
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b.length;j++)
{
b[i][j]=xyz.nextInt();
}
}
System.out.println("enter the value of array");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
System.out.printf("%d\t",a[i][j]);
}
System.out.printf("\n");
}
System.out.println("sum of the value of array");
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println(c[i][j]);
}
}
