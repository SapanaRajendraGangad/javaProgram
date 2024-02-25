import java.util.*;
public class ReverseApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
int rem,sum=0;
while(a!=0)
{
rem=a%10;
a=a/10;
sum=(sum*10)+rem;
}
System.out.println("number after the reverse"+sum);
}
}