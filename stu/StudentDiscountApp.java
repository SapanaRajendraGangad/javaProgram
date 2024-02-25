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
 int disfees=(totalFees*30)/100;
 System.out.println("discount fees of student is" +disfees);
int actualpaid=totalFees-disfees;
System.out.println("\nupdate fees is" +actualpaid);
}
else
{
System.out.println("discount fees of student is" +totalFees);
}
}
void showdetails()
{
System.out.println(Student.getid()+"\t"+Student.getname());
}
}
public class StudentDiscountApp 
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the id of student");
int id=sc.nextInt();
System.out.println("enter the name of student");
String name=sc.next();
System.out.println("enter the per of student");
int per=sc.nextInt();
System.out.println("enter the totalfees of student");
int totalfees=sc.nextInt();
Student s1=new Student();
Discountfees d=new Discountfees();
s1.setid(id);
s1.setname(name);
d.setStudent(s1);
d.cheakeligibilitycriteria(per, totalfees);
d.showdetails();
}
}