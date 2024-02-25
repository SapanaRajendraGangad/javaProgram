import java.util.*;
public class CheakAlpDig
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the character");
char ch=sc.next().charAt(0);
if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
{
System.out.println("character is alphabet");
}
else if(ch>='0'&&ch<='9')
{
System.out.println("character is digit");
}
else
{
System.out.println("character is special symbol");
}
}
}