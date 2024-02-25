import java.util.*;
class Student
  {
 int id;
 String name;
float per;
int totalFees;
int disFees;
int actualPaidFees;

	public int getId() {
		return id;
	   }
	public void setId(int id) {
		this.id = id;
            }
	public String getName() {
		return name;
	   }
	public void setName(String name) {
		this.name = name;
	  } 
        public void setPer(float per)
        {
             this.per=per;
          }
        public float getPer(){
               return per;
        } 
       public void setTotalFee(int totalFees)
        {
        this.totalFees=totalFees;
          }
        public int getTotalFee(){
              return totalFees;
        }
 }
 
class DiscountFees{
  
   Student s;
   void setStudent(Student s) 
    {
     this.s=s;
    }

   void checkDiscountEligibility(float per)
  {
   if(s.getPer()>60)
   {
   System.out.println("\neligible for discount....\n");
   int disFees=s.getTotalFee()*30/100;
   System.out.println ("\nfee decrease : "+disFees);
   int actualPaidFees= s.getTotalFee()-disFees;
   System.out.println("\nupdate fee is : "+actualPaidFees);
  }
else{
 System.out.println("\nnot eligible");
 }
}
 void show()
  {
   System.out.println("\nName="+s.getName()+"\tID="+s.getId()+"\tPercentage="+s.getPer());

  }
}

public class PojoApp
{
  public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
System.out.println("enter id");    
int id=sc.nextInt();
System.out.println("enter name");
String name=sc.next();
System.out.println("enter percentage");
float per=sc.nextFloat();
System.out.println("enter total fees");
int totalFees=sc.nextInt();
 
     Student s1=new Student();
     s1.setId(id);
     s1.setName(name);
     s1.setPer(per);
     s1.setTotalFee(totalFees);
     
    DiscountFees df=new  DiscountFees();
    df.setStudent(s1);
    df.checkDiscountEligibility(per);
    df.show();
}
}