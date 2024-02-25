import java.util.*;
class Factorial
{
int a;
void setValue(int x)
{
this.a=x;
}
int getFactorial()
{
int i,sum=1;
for(i=1;i<=a;i++)
{
sum=sum*i;
}
return sum;
}
}
public class FactorialExamApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
Factorial f=new Factorial();
f.setValue(no);
int r=f.getFactorial();
System.out.println("factoriel of given number is"+r);
}
}