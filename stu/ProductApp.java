
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
void CalBill(Product product)
{
this.Product=product;
}
void cheakcriteria()
{
System.out.println("ID\t\tPRODUCT NAME\t\tQTY\t\tRATE");
int totalbill=product.getrate()*product.getqty();
System.out.println( +totalbill);
}
void show()
{
System.out.println(p.getid()+"\t"+p.getname()+"\t"+p.getrate+"\t"+p.qty);
}
}
public class ProductApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the id of product");
int id=sc.nextInt();
System.out.println("enter the name of product");
String name=sc.next();
System.out.println("enter the qty of product");
int qty=sc.nextInt();
System.out.println("enter the rate of product");
int rate=sc.nextrate();
Product p1=new Product();
CalculateBill c1=new CalculateBill();
p1.getid(id);
p1.getname(name);
p1.getqty(qty);
p1.getrate(rate);
c1.CalBill(p1);
c1.cheakcriteria();
}
}