import java.util.*;
public class MinSum
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
int k=0,l=0,i,j;
System.out.println("enter the value of array");
for( i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
int sum,max=0;
for(i=0;i<a.length;i++)
{
for( j=i+1;j<a.length;j++)
{
sum=a[i]+a[j];
if(sum<0)
{
   if(sum>max)
 {
 max=sum;
k=i;
 l=j;
   }
	}			   }
		
	}
 System.out.printf("%d %d = %d\n",a[k],a[l],max);

}
}