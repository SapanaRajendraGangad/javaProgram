import java.util.*;
class Student
{
int a[],i,sum=0;
float per;
void setsubmarks(int x[])
{
a=x;
}
void calculatepercent()
{
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
}
per=sum/6;
System.out.println("per of student is" +per);
} 
void cheakgrade()
{
if(per>75 && per<=100)
{
System.out.println("Student in distinction");
}
else if (per>60 && per<=75)
{
 System.out.println("Student in first division");
}
else if (per>=50 && per<=60 )
{
 System.out.println("Student in second division");
}
else if (per>40 && per<=50)
{
 System.out.println("Student in second division");
}
else
{
System.out.println("student is Fail");
}
}
}
public class StudentApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[6];
System.out.println("enter the value of array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
Student st=new Student();
st.setsubmarks(a);
st.calculatepercent();
st.cheakgrade();
}
}
