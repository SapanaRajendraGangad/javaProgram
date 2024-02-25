//find the area of circle
import java.util.*;
class circle
{
int l,w;
void setlengthwidth(int length,int width)
{
l=length;
w=width;
}
void showarea()
{
int area=l*w;
System.out.println("area of rectangle is" +area);
}
};
public class AreaApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int l,w;
System.out.println("enter the length and width of rectangle");
l=sc.nextInt();
w=sc.nextInt();
circle c=new circle();
c.setlengthwidth(l,w);
c.showarea();
}
}
