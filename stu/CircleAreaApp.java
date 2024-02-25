//1). WAP to create the class name as Circle with a following methods  
//class Circle {    void setRadius(float radius)//accept the radius 
//    {    }    void showArea()    { //write here calculation logics of circle area and display it 
//   } } public class AreaApp {     public static void main(String x[])     {       
//create here object of scanner and accept the radius as input      
 //create the object of area and call setRadius and pass radius input as parameter     
 //call showArea() for display the display the area     } } 
 import java.util.*;
class Circle
{
float r;
void setRadius(float radius)
{
r=radius;
}
void ShowArea()
{
float pi=3.14f;
float area=pi*r;
System.out.println("Area of circle is"+area);
}
}
public class CircleAreaApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius of circle");
float r=sc.nextFloat();
Circle c=new Circle();
c.setRadius(r);
c.ShowArea();
}
}
