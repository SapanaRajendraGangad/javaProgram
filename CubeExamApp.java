import java.util.*;
class Cube
{
int a;
void setValue(int x)
{
a=x;
}
int getCube()
{
int c=a*a*a;
return c;
}
}
public class CubeExamApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
Cube c=new Cube();
c.setValue(no);
int r=c.getCube();
System.out.println("cube of number is\t" +r);
}
}