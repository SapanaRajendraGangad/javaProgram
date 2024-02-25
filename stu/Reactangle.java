//1) Create a class named 'Rectangle' with two data members- length and breadth  and a method to calculate the area which is 
// 'length*breadth'.  The class has three constructors which are :  
//1	- having no parameter - values of both length and breadth are assigned zero. 
//2	- having two numbers as parameters  
//  - the two numbers are assigned as length and breadth respectively. 3 - having one number as parameter -
 //both length and breadth are assigned that number. Now, create objects of the 'Rectangle' class having none, one and two 
//parameters and print their areas. 
import java.util.*;
class Reactangle
{
int length;
int breadth;
Reactangle(){
}
Reactangle(int l,int b){
this.length=l;
this.breadth=b;
}
Reactangle(int a)
{
a=length*breadth;
System.out.println("area of reactangle is \t"+a);
}
}
public class RectangleArea
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of length and breadth of reactangle");
int l=sc.nextInt();
int b=sc.nextInt();
Rectangle r=new Reactagle(10,20);
}
}


