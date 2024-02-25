import java.util.*;
abstract class StringOperation
{
abstract void performOperation(String s);
}
class ConvertToUpper extends StringOperation
{
 void performOperation(String x)
{
String x=x.toUpperCase(x);
System.out.println("string in uppercase is\t" +x);
}
}
class MaxRepetativeChar extends StringOperation
{
void performOperation(String x)
{
int max=0;
for(int i=0;i<='\0';i++)
{
int count=1;
for(int j=i+1;i<='\0';j++)
{
count++;
}
if(count>max)
{
max=x[i];
}
}
System.out.println("maximum number of charchter is" +max);
}
}
class WordReverse extends StringOperation
{
void performOperation(String x)
{
String x=x.reverse(x);
System.out.println("string in uppercase is\t" +x);
}
}
public class StringOperation
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