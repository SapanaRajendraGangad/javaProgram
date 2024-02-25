public class swipenumber
{
public static void main(String x[])
{
int a,b;
a=Integer.parseInt(x[0]);
b=Integer.parseInt(x[1]);
a=a+b;
b=a-b;
a=a-b;
System.out.println("number after swipe "+a+"\t"+b);
}
}