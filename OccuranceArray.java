import java.util.*;
public class OccuranceArray
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[10];
int i,j;
System.out.println("Enter the value of array");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
System.out.println("array after assending order");
for( i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}

int c=1;
for( i=0;i<a.length;)
{
for( j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
c++;
}
else{
break;
}
}
System.out.printf("%d\t%d\n" ,a[i],c);
i=j;
c=1;
}
}
}