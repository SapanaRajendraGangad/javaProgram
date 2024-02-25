public class Swipe
{
public static void main(String x[])
{
int a,b,c;
a=Integer.parseInt(x[0]);
b=Integer.parseInt(x[1]);
System.out.println("number before swapping:"+a+"\t"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("number after swapping" +a+"\t"+b);
}
}
