import java.util.*;
public class PalinApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int rem=0,rev=0;
System.out.println("enter the value ");
int no=sc.nextInt();
int temp=no;
while(no!=0)
{
rem=no%10;
no=no/10;
rev=(rev*10)+rem;
}

if(rev==temp)
{
System.out.println("number is palindrom");
}
else
{
System.out.println("number is not a palindrom");
}
}
}