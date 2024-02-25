import java.util.*;
public class ArmstrongApp
{
public static void main(String x[])
{
int c=0,rem,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
int temp=no;
while(temp>0)
{
c++;
temp=temp/10;
}
temp=no;
int a=1;
while(temp!=0)
{
rem=temp%10;
sum=(int)(sum+(Math.pow(rem,c)));
temp=temp/10;
}
if(sum==no)
{
System.out.println("number is armstrong");
}
else
{
System.out.println("number is not Armstrong");
}
}
}