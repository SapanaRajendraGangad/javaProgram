public class power
{
public static void main(String x[])
{
int base,index,i,p=1;
base=Integer.parseInt(x[0]);
index=Integer.parseInt(x[1]);
for(i=1;i<=index;i++)
{
p=p*base;
}
System.out.printf("power of number is %d",p);
}
}