import java.util.*;
public class DucknoApp
{
public static void main(String x[])
{
int flag=0,rem;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
while(a!=0)
{
rem=a%10;
a=a/10;
if(rem==0)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("Number is Duck");
}
else
{
System.out.println("Number is not Duck");
}
}
}