import java.util.*;
 class Product {
  private int id;     
private String name;     
private int qty;     
private int rate; 
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
 public void setqty(int qty) 
    { 
this.qty=qty; 
    } 
  public int getqty() 
   { 
return qty; 
   } 
 public void setrate(int rate) 
    { 
this.rate=rate; 
    } 
  public int getrate() 
   { 
return rate; 
   } 
}
class CalculateBill
{
Product pro;
void CalBill(Product pro)
{
this.pro=pro;
}
void cheakcriteria()
{
int totalbill=pro.getrate()*pro.getqty();
System.out.println("total bill is\t\t" +totalbill);
}
void show()
{
for(int i=0;i<3;i++)
{
System.out.println("ID\t\tPRODUCT NAME\t\tRATE\t\tQTY");
System.out.println(pro.getid()+"\t\t"+pro.getname()+"\t\t\t"+pro.getrate()+"\t\t"+pro.getqty());
}
}
}
public class ProductApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
int size=sc.nextInt();
Product pro=new Product();
CalculateBill c1=new CalculateBill();
for(int i=0;i<size;i++)
{
System.out.println("enter the id of product");
int id=sc.nextInt();
System.out.println("enter the name of product");
String name=sc.next();
System.out.println("enter the qty of product");
int qty=sc.nextInt();
System.out.println("enter the rate of product");
int rate=sc.nextInt();
pro.setid(id);
pro.setname(name);
pro.setqty(qty);
pro.setrate(rate);
c1.CalBill(pro);

c1.cheakcriteria();
}
c1.show();
}
}