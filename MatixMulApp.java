import java.util.*;
class Multiplication 
{
int a[][],b[][],c[][];
int i,j,k;
void acceptTwoDArray(int x[][],int y[][],int z[][])
{
a=x;
b=y;
c=z;
}
void showmatrixmaltiplicaton()
{
int sum;
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
 sum=0;
for(k=0;k<a.length;k++)
{
sum=sum+a[i][k]*b[k][j];
}
c[i][j]=sum;
}
}
}

}
public class MatixMulApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int i,j;
System.out.printf("enter the value of first array");
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.printf("enter the value of Second array");
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
b[i][j]=sc.nextInt();
}
}
Multiplication mu=new Multiplication();
mu.acceptTwoDArray(a,b,c);
mu.showmatrixmaltiplicaton();
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
System.out.printf("%d\t",c[i][j]);
}
System.out.println("\n");
}
}
}
