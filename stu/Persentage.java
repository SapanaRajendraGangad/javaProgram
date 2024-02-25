class Percentage
{
int []s;
String name;
int id;
String address;
String year;
Percentage(String name,int id,String Addres,String year)
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
for(int i=0;i<a.length;i++)
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
public CSE(int id,String name,String add,String year)
{
super(id,name,add,year);
}
}
public class Persentage
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int []a=new int[6];
System.out.println("enter the marks of student");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the name  of student);
String name=sc.next();
System.out.println("enter the id of student);
int id=sc.nextInt();
System.out.println("enter the address  of student);
String ad=sc.next();
System.out.println("enter the year  of student);
String year=sc.next();
System.out.println("**********CSE***********");
Percentage p1=new CSE(a,name,id ,ad,year);
p1.calpercentage();
p1.show();
}
}
