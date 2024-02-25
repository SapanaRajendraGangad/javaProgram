import java.util.*;
class Sum
{
int sum=0,i,a[];
void add(int x[])
{
a=x;
}
void calsum()
{
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println("sum of array" +sum);
}
}
public class SumApplication
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.println("eneter the value array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
Sum s=new Sum();
s.add(a);
s.calsum();
}
}