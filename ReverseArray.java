import java.util.*;
public class ReverseArray
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
System.out.println("enter the value of array");
for(int i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
System.out.println("Array after reverse");
int start=0;
int mid=a.length/2;
int end=a.length-1;
for(start=0;start<=mid;start++)
{
int temp=a[start];
a[start]=a[end];
a[end]=temp;
end--;
}System.out.println("Display the array");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}