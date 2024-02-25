import java.util.*;
class InsertArrEle 
{  int c[]; 
int count;
   void setIntArray(int ch[]) 
   {
c=ch;
}
 void insertValueOnIndex() 
   {
 for(int i=0;i<c.length;i++)
{ 
for(int j=i+1;j<c.length;j++)
{
if(c[i]>c[j])
{
int temp=c[i];
c[i]=c[j];
c[j]=temp;
}
}
}
System.out.println("array after sorting");
for(int i=0;i<c.length;i++)
{ 
System.out.println(+c[i]);
}
System.out.println("array of counting");
int j;
for(int i=0;i<c.length;)
{ 
count=1;
for( j=i+1;j<c.length;j++)
{
if(c[i]==c[j])
{
count++;
}
else
{
break;
}
}
System.out.printf(" %d-->%d\n",c[i],count);
i=j;
}
}
}
public class CountArrApp
{ 
   public static void main(String x[]) 
   {
int i;
    Scanner sc=new Scanner(System.in);
    int a[]=new int[6];
System.out.println("enter the value of array");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
InsertArrEle ae=new InsertArrEle();
ae.setIntArray(a);
ae.insertValueOnIndex();

}
}

 


