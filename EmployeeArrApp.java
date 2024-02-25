import java.util.*;
class Employee
{
private int id;
private String name;
private int salary;
public void setid(int id)
{
this.id=id;
}
public int getid()
{
return id;
}
public void setname(String name)
{
this.name=name;
}
public String getname()
{
return name;
}
public void setsalary(int salary)
{
this.salary=salary;
}
public int getsalary()
{
return salary;
}
 class EmployeeArrApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
Employee emp=new Employee[3];
for(int i=0;i<emp.length;i++)
{
emp[i]=new Employee();
System.out.println("enter the id,name and salary of employee");
int id=sc.nextInt();
String name=sc.next();
int salary=sc.nextInt();
emp[i].setid(id);
emp[i].setname(name);
emp[i].setsalary(salary);
System.out.println("Array after sorting");
for(int i=0;i<emp.length;i++)
{
System.out.println(emp[i].getid()+"\t"+emp[i].getname()+"\t"+emp[i].getsalary());
}
for(int i=0;i<emp.length;i++)
{
for(int j=0;j<emp.length;j++)
{
 if(emp[i].getsalary()>emp[j].getsalary())
   {
     Employee temp=emp[i];
        emp[i]=emp[j];
       emp[j]=temp;
}
}
}
System.out.println("Array before sorting");
  for(int i=0;i<emp.length;i++)
{
  System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
}    

}
}
}
}
