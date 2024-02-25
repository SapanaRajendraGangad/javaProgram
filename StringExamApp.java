import java.util.*;
public class StringExamApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String ch=sc.next();
char a[]=ch.toCharArray();
for(int i=0;i<a.length;i++)
{
if(a[i]>='a'&&a[i]<='z')
{
a[i]=(char) (a[i]-32);
}
}
System.out.println("string in uppercase is");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
//String v=a.toString();
//System.out.println(v);
}
}
