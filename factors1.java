public class factors1
{
public static void main(String x[])
{
int no,a,i,j;
no=Integer.parseInt(x[0]);
System.out.println("power of number is");
for(i=1;i<no;i++)
{
if(no%i==0)
{
for(j=2;j<i;j++)
{
if(i%j==1)
{
System.out.println(i);
}
}
}
}
}
}