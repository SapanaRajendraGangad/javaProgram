import java.util.*;
class AddAmount{
int no;
int a=50;
AddAmount()
{
System.out.println("Final amount of piggie bank"+a);
}
AddAmount(int no)
{
this.no=no;
int total=a+no;
System.out.println("Final amount of piggie bank"+total);
}
}
public class PiggiBank
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value which you wants to add in piggie bank");
int a=sc.nextInt();
AddAmount am=new AddAmount(a);
}
}

