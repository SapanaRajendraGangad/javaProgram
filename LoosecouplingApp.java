import java.util.*;
abstract class value
{
int a,b;
void setvalue(int x,int y)
{
a=x;
b=y;
}
abstract void performCalculation();
}
class Add extends value
{
void performCalculation()
{
int c=a+b;
System.out.println("addition of number is\t" +c);
}
}
class Mul extends value
{
void performCalculation()
{
int d=a*b;
System.out.println("multiplication of number is\t" +d);
}
}
class Div extends value
{
void performCalculation()
{
float s=a/b;
System.out.println("division of number is\t" +s);
}
}
class Sub extends value
{
void performCalculation()
{
int w=a-b;
System.out.println("substracation of number is\t" +w);
}
}
class Calculator
{
void performopration(value v)
{
v.performCalculation();
}
}
public class LoosecouplingApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the two number");
int a=sc.nextInt();
int b=sc.nextInt();

System.out.println("enter the choice");
int ch=sc.nextInt();
Calculator C=new Calculator();

switch(ch)
{
case 1:
Add q=new Add();
q.setvalue(a,b);
C.performopration(q);
break;
case 2:
Mul u=new Mul();
u.setvalue(a,b);
C.performopration(u);
break;
case 3:
Div k=new Div();
k.setvalue(a,b);
C.performopration(k);
break;
case 4:
Sub r=new Sub();
r.setvalue(a,b);
C.performopration(r);
break;
}
}
}
