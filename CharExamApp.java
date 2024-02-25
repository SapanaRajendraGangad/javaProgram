import java.util.*;
interface charOperator
{
void setcharacter( char [] ch);
void getresult();
}
class Connverttoupper implements charOperator
{
private char [] a;
public void setcharacter( char[] ch)
{
this.a=ch;
}
public void getresult()
{
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
}
}
class ChangeAlterNateChar implements charOperator
{
private char ch[];
public void setcharacter(char a[])
{
this.ch=a;
}
public void getresult()
{
for(int i=0;i<ch.length;i++)
{
if(i%2==1)
{
System.out.println((char)(ch[i]+32));
}
else
{
System.out.println(ch[i]);
}
}
}
}
public class CharExamApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
	
System.out.println("enter the string");
String ch=sc.next();
char ch1[]=ch.toCharArray();
Connverttoupper ct=new Connverttoupper();
ct.setcharacter(ch1);
ct.getresult();
ChangeAlterNateChar ca=new ChangeAlterNateChar();
ca.setcharacter(ch1);
ca.getresult();
}
}
 
