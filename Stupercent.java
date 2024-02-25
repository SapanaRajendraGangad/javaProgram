class Percentage
{
int []s;
String name;
int id;
String address;
String year;
Percentage(int []a)
{
this.s=a;
}
Percentage(String name,int id,String Addres,String year)
{
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
class CSE extends Percentage
{
public CSE(int S[])
{
super(int s[]);
}

class ETC extends  Percentage
{
public ETC(int []s)
{
super([]s);
}
public ETC(int id,String name,String add,String year)
{
super(id,name,add,year);
}
}
public class Stupercent
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
System.out.println("enter the name ,id,address,year of student);
String name=sc.next();
int id=sc.nextInt();
String ad=sc.next();
String year=sc.next();
System.out.println("**********CSE***********");
Percentage p=new CSE(a);
Percentage p1=new CSE(name,id ,ad,year);
p.calpercentage();
p1.show();
