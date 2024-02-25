import java.util.*;
class Student
{
 int id;
String name;
float per;     
int totalFees;
int disFees;     
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
  disFees=totalFees+(totalFees/30)*100;
 System.out.println("discount fees of student is" +disFees);
}
else
{
disFees=totalFees;
System.out.println("discount fees of student is"+disFees);
}
}
void showdetails()
{
System.out.println(student.getid()+"\t"+student.getname());
}
}
public class StudentPer
{
public static void main(String x[])
{
Student s=new Student();
Discountfees d=new Discountfees();
s.setid(101);
s.setname("Sapana");
d.setStudent(s);
d.cheakeligibilitycriteria(78,1234);
d.showdetails();
}
}