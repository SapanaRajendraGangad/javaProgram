import java.util.*;
class Student
{
 int id;
String name;
float per;     
int totalFees;     
int actualPaidFees; 
void setid(int id) 
    {
     this.id=id; 
    }
    int getid() 
    {
     return id; 
    } 
    void setname(String name) 
     {
      this.name=name; 
     } 
   String getname() 
    { 
    return name; 
   }
}
class Discountfees
{
Student Student;
void setStudent(Student student)
{
this.Student=student;
}
void cheakeligibilitycriteria(int per ,int totalFees)
{
if(per>60)
{
 int disfees=totalFees+(totalFees/30)*100;
 System.out.println("discount fees of student is" +disfees);
int actualpaid=totalfees-Disfees;
System.out.println("\nupdate fees is:" +actualpaid);
}
else
{
int disfees=totalFees;
System.out.println("discount fees of student is" +disfees);
}
}
void showdetails()
{
System.out.println(student.getid()+"\t"+student.getname());
}
}
public class StudentDiscountApp 
{
public static void main(String x[])
{
Student s1=new Student();
Discountfees d=new Discountfees(s);
s1.setid(101);
s1.setname("Sapana");
d.setStudent(s1);
d.cheakeligibilitycriteria(78,1234);
d.showdetails();
}
}