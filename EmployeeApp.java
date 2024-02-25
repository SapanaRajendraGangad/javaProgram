import java.util.*;
class Employee
{
int id;
String name;
int bsalary;
int salary;
void setpersonaldetails(int eid,String ename,int esalary)
{
id=eid;
name=ename;
bsalary=esalary;
}
void setprogress(int progress)
{
if(progress>60)
{
salary=bsalary + (bsalary/100)*30;
System.out.println("increased salary of employee is" +salary);
}
else{
salary=bsalary;
System.out.println("increased salary of employee is" +salary);
}
}
void show()
{
System.out.println("ID\t" +id+ "NAME\t"+name+ "SALARY\t"+salary+  "BASIC\t"+bsalary); 
}
};
public class EmployeeApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
String name;
int id,progress;
int salary;
System.out.println("enter the information of employee id");
id=sc.nextInt();
System.out.println("enter the information of employee name");
name=sc.next();
System.out.println("enter the information of employee salary");
salary=sc.nextInt();
System.out.println("enter the information of employee progress");
progress=sc.nextInt();
Employee emp=new Employee();
emp.setpersonaldetails(id,name,salary);
emp.setprogress(progress);
emp.show();
}
}

