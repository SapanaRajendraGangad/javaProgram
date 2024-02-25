import java.util.*;
public class SwpreNoExamApp
{
public static void main(String x[])
{
int a,b;
a=Integer.parseInt(x[0]);
b=Integer.parseInt(x[1]);
System.out.printf("number before swapping A=%d\t B=%d/t",a,b);
a=a+b;
b=a-b;
a=a-b;
System.out.printf("number after swapping A=%d\t B=%d/t",a,b);
}
}