import java.util.*;
public class NOccurance
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
int i,j;
System.out.println("enter the value of array");
for(i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
for(i=0;i<a.length;i++)
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
System.out.println("array after sorting");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
int c=1;
for(i=0;i<a.length;)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
c++;
}
else
{
break;
}
}
if(a.length/2<=c)
{
System.out.printf("%d---->%d",a[i],c);
}
i=j;
c=1;
}

}
}