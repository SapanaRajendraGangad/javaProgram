public class fibo
{
public static void main(String x[])
{
int f1=0,f2=1,f,i=1,no;
no=Integer.parseInt(x[0]);
while(no>=i)
{
f=f1+f2;
f1=f2;
f2=f;
i++;
System.out.println(f);
}
}
}
