import java.util.*;
public class ExceptionExamApp
{
static int a[];
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
try{
 a[0]=100;
System.out.println(a[0]);
}
catch(NullPointerException ex)
{
System.out.println("Eception occur\t"+ex);
}
break;
case 2:
try
{
int a,b;
System.out.println("enter the two value");
a=sc.nextInt();
b=sc.nextInt();
int c=a/b;
System.out.println("division of nuber is" +c);
}
catch( ArithmeticException ex)
{
System.out.println("Exception occur \t"+ex);
}
System.out.println("logic outside the try catch block");
break;
case 4:
class exception
{
int a,b;
void setvalue(int a,int b)
{
this.a=a;
this.b=b;
}
int getDiv()throws Exception
{
int c=a/b;
return c;
} 
}
int r=9,j=0;
exception ex=new exception();
ex.setvalue(r,j);
try{
int g=ex.getDiv();
System.out.println(g);
}
catch(Exception ep)
{
System.out.println("Exception occur \t"+ep);
}
System.out.println("logic outside the try catch block");
break;
case 5:
try {
Object o=new String("Hello");
System.out.println((Integer) o);
}
catch(ClassCastException e)
{
System.out.println("Exception is"+e);
}
break;
case 6:
try{
Class.forName("abc.dev");
System.out.println("class found");
}
catch( ClassNotFoundException z)
{
System.out.println("exception occur" +z);
}
break;
}
}
}