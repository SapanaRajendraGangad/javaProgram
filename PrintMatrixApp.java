import java.util.*;
class Printmatrix
{
int a[][];
void acceptTwoDArray(int x[][])
{
this.a=x;
} 
 void showMatrix()
{
System.out.printf("array is\n");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
System.out.printf("%d\t\t",a[i][j]);
}
System.out.printf("\n");
}
}
}
public class PrintMatrixApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
System.out.printf("enter the value of array");
for(int i =0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
a[i][j]=sc.nextInt();
}
}
Printmatrix pm=new Printmatrix();
pm.acceptTwoDArray(a);
pm.showMatrix();
}
} 