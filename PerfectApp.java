import java.util.*;
public class PerfectApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
int sum=0;
for(int i=1;i<no;i++)
{
if(no%i==0)
{
sum=sum+i;
}
}
if(sum==no)
{
System.out.println("number is the perfect number");
}
else
{
System.out.println("number is not perfect number");
}
}
}
