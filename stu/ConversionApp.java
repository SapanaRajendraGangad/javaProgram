//2)	Write a program to convert decimal to binary  and binary to decimal number. 
//create class NumberConversion with appropriate data members and two constructors  NumberConversion(int number) { 	
//set decimal number here and write logic for decimal to binary number } 
//NumberConversion(int bin[],int size) { 
//set binary number here and write logic for binary number to decimal number }
import java.util.*;
class NumberConversion
{
int no,size,a[];
int rem,rev=0;
NumberConversion(int Number){
this.no=Number;
while(no!=0)
{
rem=no%2;
no=no/2;
rev=rev*10+rem;
}
int re,rv=0;
while(rev!=0)
{
re=rev%10;
rev=rev/10;
rv=rv*10+re;
}
System.out.println(rv);
}
NumberConversion(int bin[],int size)
{
this.a=bin;
this.size=size;
int sum=0,f=1;
for(int i=0;i<size;i++)
{
size--;
f=1;
for(int j=1;j<=size;j++)
{
f=f*2;
}
int p=a[i]*f;
sum=sum+p;
}
System.out.println(sum);
}
}
public class ConversionApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
NumberConversion nc=new NumberConversion(no);
System.out.println("enter the size of number");
int size=sc.nextInt();
int by[]=new int[size];
System.out.println("enter the binary number");
for(int i=0;i<size;i++)
{
by[i]=sc.nextInt();
}
NumberConversion pc=new NumberConversion(by,size);
}
}
 
