import java.util.*;
public class StackApp{
public static void main(String x[])
{
Stack s=new Stack();
Scanner sc=new Scanner(System.in);
System.out.println("1.push the element \n2.pop the elements\n3.display the elements");
do{
System.out.println("enter your choice");
int c=sc.nextInt();
switch(c)
{
case 1:
System.out.println("enter the value in stack");
int value=sc.nextInt();
 Object b=s.push(value);
break;
case 2:
boolean a=s.isEmpty();
if(a)
{
System.out.println("stsck is empty");
}
else{
Object obj=s.pop();
System.out.println("whitch element is deleted"+obj);
}
break;
case 3:
for(Object ob:s)
{
System.out.println(ob);
}
}
}while(true);
}
}