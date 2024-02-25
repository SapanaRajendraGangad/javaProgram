import java .util.*;
public class MaxDiff
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
int i,j;
System.out.println("enter the velue of array");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
int max=0,sum=0,a1=0,b1=0;
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
sum=a[i]-a[j];
System.out.printf("\n[%d %d]=%d\n",a[i],a[j],sum);
}
if(sum>max)      
	         	{
                   max=sum; //  6    8  
                a1=i;
                b1=j;
                }
}
}
System.out.printf("\nThe maximum difference element in the array is : %d\n",max); //8
 System.out.printf("\nThe elements which provide maximum difference is :(%d %d) \n",a[a1],a[b1]);
        
}
}