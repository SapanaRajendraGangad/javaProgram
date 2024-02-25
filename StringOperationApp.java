import java.util.*;
abstract class StringOperation
{
abstract void performOperation(String s);
}
class ConvertToUpper extends StringOperation
{
 void performOperation(String x)
{
String x1=x.toUpperCase();
System.out.println("string in uppercase is\t" +x1);
}
}
class MaxRepetativeChar extends StringOperation
{
int max=1,count=1;
char character;
void performOperation(String x)
{
char ch[]=x.toCharArray();
for(int i=0;i<ch.length;i++)
{
count=1;
for(int j=i+1;j<ch.length;j++)
{
if(ch[i]==ch[j])
{
count++;
if(count>max)
{
max=count;
character=ch[i];
}
}
}
}
System.out.println("maximumrepatitative character is" +character+"--->"+max);
}
}
class WordReverse extends StringOperation
{
void performOperation(String x)
{
char ch[]=x.toCharArray();
int start=0;
int mid=ch.length/2;
int end=ch.length-1;
for(start=0;start<=mid;start++)
{
char temp=ch[start];
ch[start]=ch[end];
ch[end]=temp;
end--;
}
for(int i=0;i<'\0';i++)
{
System.out.println("rev string is\t" +ch[i]);
}
}
}
public class StringOperationApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
String s="good morning";
System.out.println("enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
ConvertToUpper Cv=new ConvertToUpper();
Cv.performOperation(s);
break;
case 2:
MaxRepetativeChar m=new MaxRepetativeChar();
m.performOperation(s);
break;
case 3:
WordReverse w=new WordReverse();
w.performOperation(s);
break;
}
}
}