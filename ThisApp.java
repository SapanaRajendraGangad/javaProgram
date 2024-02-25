class A
{
default A()
{
this(5);
System.out.println("I am default constructor");
}
 A(int p)
{
System.out.println(p);
}
}
public class ThisApp
{
public static void main(String x[])
{
A a1=new A();
}
}
