import java.util.*;
class Percentage
{
int []s;
String name;
int id;
String address;
String year;
Percentage(int a[],String name,int id,String Addres,String year)
{
this.s=a;
this.name=name;
this.id=id;
this.address=Addres;
this.year=year;
}
void calpercentage()
{
int agg=0;
for(int i=0;i<s.length;i++)
{
agg=agg+s[i];
}
int per=agg/6;
System.out.println("percentage of student is"+per);
}
void show()
{
System.out.println("Name\t"+name+"\tId\t"+id+"\tAddress\t"+address+"\tYear\t"+year);
}
}
class CSE extends  Percentage
{
public CSE(int a[],String name,int id,String add,String year)
{
super(a,name,id ,add,year);
}
}
class ETC extends  Percentage
{
public ETC(int a[],String name,int id,String add,String year)
{
super(a,name,id ,add,year);
}
}
public class ParsIntApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int []a=new int[6];

System.out.println("enter the name  of student");
String name=sc.next();
System.out.println("enter the id of student");
int id=sc.nextInt();
System.out.println("enter the address  of student");
String ad=sc.next();
System.out.println("enter the year  of student");
String year=sc.next();
System.out.println("enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
{
System.out.println("enter the marks of CSE student");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("**********CSE***********");
Percentage p1=new CSE(a,name,id ,ad,year);
p1.calpercentage();
p1.show();
break;
}
case 2:
{
System.out.println("enter the marks of ETC student");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
Percentage p=new ETC(a,name,id ,ad,year);
p.calpercentage();
p.show();
break;
}
}
}
}
