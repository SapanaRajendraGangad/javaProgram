public class sumn
{
public static void main(String x[])
{
int n,i,sum=0;
n=Integer.parseInt(x[0]);
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.printf("sum of n number is %d",sum);
}
}