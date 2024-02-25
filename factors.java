public class factors
{
public static void main(String x[])
{
int no,a;
no=Integer.parseInt(x[0]);
System.out.println("power of number is");
for(int i=1;i<no;i++)
{
if(no%i==0)
{
System.out.println(+i);
}
}
}
}