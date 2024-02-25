import java.util.*;
class Employee{
  int id;
   String name;
   int sal;
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
    this.sal=sal;
  }
  int getSal(){
  return sal;
  }
 
}
public class EmployeeAscenApp
  {
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     Employee emp[]=new Employee[3];
    for(int i=0;i<emp.length;i++)
      {
        emp[i]=new Employee();
        
  System.out.println("enter name,id,sal of employee");
  String name=sc.next();
  int id=sc.nextInt();
  int sal=sc.nextInt();
  emp[i].setName(name);
  emp[i].setId(id); 
  emp[i].setSal(sal);
}
System.out.println("Array after sorting");
for(int i=0;i<emp.length;i++)
{
  System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
}
for(int i=0;i<emp.length;i++)
{
  for(int j=i+1;j<emp.length;j++){
  if(emp[i].getSal()>emp[j].getSal())
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