import java.util.*;
public class Occurance
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[10]
System.out.println("Enter the value of array");
for(int i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
c++;
}
}
System.out.println("\n" +a[i],c);
}
}
}