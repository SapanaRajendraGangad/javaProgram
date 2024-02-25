import java.util.*;
public class Primeno
{
public static void main(String x[])
{
int flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
for(int i=2;i<no;i++)
{
if(no%i==0)
{
flag=1;
}
}
if(flag==0)
{
System.out.println("number is prime:");
}
else 
{
System.out.println("number is not prime:");
}
}
}
