//3. WAP to create the class Employee with a following methods  
//class Employee 
//{   void setPersonalInfo(String name,int id,int basicSal) 
 //in this function we need to store name ,id and basicSal in instance variable  
    //void setProgressPer(int progress) 
    //if progress value is greater than 60 per then increase the basic salary of        //employee with 30 percentage  
   // } 
   // void show() 
   // {//in this function we need to show the all details of employee like as  
     //name id and basic salary as well as incremental salary and total salary of employee 
//public class AreaApp 
  //  public static void main(String x[]) 
      // here create the object of Scanner class and accept the name id and basic salary as well  
       //progress per value not need to calculate it by using formual directly enter e.g 70         //means 70% 
      //create the object of Employee class and call setPersonalInfo and pass name id and salary      // in it as well as setProgressPer() and pass progress value in it     //call the show() method of Employee class. 
   

import java.util.*;
class Employee
{
private int id;
private String name;
private int sal;
private int salary;
private int tsalary;
public void setPersonalInfo(int id,String name,int sal)
{
this.id=id;
this.name=name;
this.sal=sal;
}
public void setProgressPer(int pro)
{
if(pro>60)
{
salary=sal+((sal/100)*30);
}
else{
salary=sal;
}
}
public void show()
{
int tsalary=sal+salary;
System.out.println("Id\t"+id+"\tName\t"+name+"\tSalary\t"+sal+"\tIncreamental Salary\t"+salary+"\tTotal Salary\t"+tsalary);

}
}
public class EmpApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the id , name ,salary,progress of employee");
int id=sc.nextInt();
String name=sc.next();
int sal=sc.nextInt();
int pro=sc.nextInt();
Employee emp=new Employee();
emp.setPersonalInfo(id,name,sal);
emp.setProgressPer(pro);
emp.show();
}
}