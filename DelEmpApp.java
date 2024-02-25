import java.util.*;
class Employee
{
String name;
int id;
int salary;
  void setId(int id)
  {
    this.id=id;
  }
  int getId(){
  return id;
  }
 void setName(String name)
  {
    this.name=name;
  }
  String getName(){
  return name;
  }
  void setSal(int sal)
  {
    this.salary=sal;
  }
  int getSal(){
  return salary;
  }
}
public class DelEmpApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int size=sc.nextInt();
     Employee emp[]=new Employee[size];
    for(int i=0;i<size;i++)
      {
        emp[i]=new Employee();
       System.out.println("enter the id name and salary of employee");
       int id=sc.nextInt();
       String name=sc.next();
       int salary=sc.nextInt();
       emp[i].setId(id);
       emp[i].setName(name);
       emp[i].setSal(salary);
}
    System.out.println("enter the id of delete employee");
     int del=sc.nextInt();

  for(int i=0;i<size;i++)
{
if(emp[i].id>=del)
{

for(int j=i;j<size;j++)
{
emp[i]=emp[i+1];
}

size--;
}
}
for(int i=0;i<size;i++)
{
System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
}
}
}