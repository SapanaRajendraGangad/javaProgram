import java.util.*;
abstract class Area
{
abstract void showArea();
}

class circle extends Area
{
int radius;
void setRadius(int rad)
{
radius=rad;
}
float pi=3.14f;
void showArea()
{
float area=pi*radius*radius;
System.out.println("area of circle is\t"+area);
}
}
class Rectangle extends Area
{
int length;
int width;
void setLengtWidth(int len,int wid)
{
this.length=len;
this.width=wid;
}
void showArea()
{
int area=length*width;
System.out.println("area of rectangle is\t"+area);
}
}
public class AreaApplication
{
public static void main(String x[])
{
circle c=new circle();
c.setRadius(12);
c.showArea();
Rectangle r=new  Rectangle();
r.setLengtWidth(12,5);
r.showArea();
}
}