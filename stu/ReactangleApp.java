//2.Create the Class Name as Rectangle with a following methods and write its logics. class Rectangle 
//{ void setLengthWidth(int len,int wid)//accept the radius  
  // { 
   //} 
   //void showArea() 
   //{ //write here calculation logics of circle area and display it 
   //} 
//} 
//public class AreaApp 
//{  public static void main(String x[]) 
  //   {  //create here object of scanner and accept the length and width as input  
        //create the object of Rectangle and call setLengthWidth and pass radius input as parameter 
        //call showArea() for display the display the area 
    //} } 
import java.util.*;
class Rectangle{
int len ,wid;
void SetLengthWidth(int len,int wid)
{
this.len=len;
this.wid=wid;
}
void showarea()
{
int area=len*wid;
System.out.println("Area of recatangle is\t"+area);
}
}
public class ReactangleApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the length and width of rectangle");
int len=sc.nextInt();
int wid=sc.nextInt();
Rectangle re=new Rectangle();
re.SetLengthWidth(len,wid);
re.showarea();
}
}