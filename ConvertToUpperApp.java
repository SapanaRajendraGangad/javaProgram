import java.util.*;
class InsertArrEle 
{  int c[]; 
   void setIntArray(int ch[]) 
   {
c=ch;
}
 void insertValueOnIndex() 
   {
    int index,i,value;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the index");
     index=sc.nextInt();
     System.out.println("enter the value");
     value=sc.nextInt();
     for(i=c.length-2;i<index;i--)
{
       c[i+1]=c[i];
}
c[index]=value;
}
}
public class ConvertToUpperApp 
{ 
   public static void main(String x[]) 
   {
int i;
    Scanner sc=new Scanner(System.in);
    int a[]=new int[6];
System.out.println("enter the value of array");
for(i=0;i<a.length-1;i++)
{
a[i]=sc.nextInt();
}
InsertArrEle ae=new InsertArrEle();
ae.setIntArray(a);
ae.insertValueOnIndex();
System.out.println("Display the value of array");
for( i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}

 


