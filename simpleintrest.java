public class simpleintrest
{
public static void main(String x[])
{
int p,t,r;
p=Integer.parseInt(x[0]);
t=Integer.parseInt(x[1]);
r=Integer.parseInt(x[2]);
int SI=(p*t*r)/100;
System.out.printf("simple intrest is SI=%d",SI);
}
}