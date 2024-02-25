public class count
{
public static void main(String x[])
{
int a,rem,c;
a=Integer.parseInt(x[0]);
c=0;
while(a!=0){
a=a/10;
c++;
}
System.out.printf("number of digit is %d",c);
}
}