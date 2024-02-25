import java.util.*;
class Interest
{
int pamt;
int irate;
int dur;
void setPRD(int pamt,int irate,int dur)
{
this.pamt=pamt;
this.irate=irate;
this.dur=dur;
}
}
class calculateInterest extends Interest
{
void callIntrest()
{
int total=pamt*irate*dur;
System.out.println("total intrest is\t\t" +total);
}
}
public class IntrestApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the amount");
int amt=sc.nextInt();
System.out.println("enter the rate");
int rate=sc.nextInt();
System.out.println("enter the dur");
int dur=sc.nextInt();
calculateInterest pu=new calculateInterest();
pu.setPRD(amt,rate,dur); 
pu.callIntrest();
}
}
