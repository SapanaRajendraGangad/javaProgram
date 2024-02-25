import java.util.*;
public class TableApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
int t;
for(int i=1;i<=10;i++)
{
t=no*i;
System.out.printf("%d*%d=%d\n",no,i,t);
}
}
}