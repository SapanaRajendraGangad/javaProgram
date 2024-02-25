import java.util.*;
public class CheakChar
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the String");
String str=sc.next();
char ch=str.next().charAt();
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
{
System.out.println("character is 