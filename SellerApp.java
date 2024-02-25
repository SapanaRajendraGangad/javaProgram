
import java.util.*;
class seller
{
int sp,cp;
void acceptsellingcostprice(int selingprice,int costprice)
{
sp=selingprice;
cp=costprice;
}
void showProfitLoss() 
{
if(cp>sp)
{
System.out.println("profit");
}
else if(cp<sp)
{
System.out.println("Loss");
}
else
{
System.out.println("no profit no loss");
}
}
}
class SellerApp
{
public static void main(String x[])
{
int cp,sp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the cost price");
cp=sc.nextInt();
sp=sc.nextInt();
seller s=new seller();
s.acceptsellingcostprice(cp,sp);
s.showProfitLoss();
}
}


