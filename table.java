public class table
{
public static void main(String x[])
{
int limit,no,c=1;
limit=Integer.parseInt(x[0]);
no=Integer.parseInt(x[1]);
while(c<=limit)
{
int s=c*no;
System.out.printf("%d\n",s);
c++;
}
}
}