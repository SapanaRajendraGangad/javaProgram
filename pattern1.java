import java.util.*;
public class pattern1
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int r,c,i,j;
System.out.printf("enter the row ");
r=xyz.nextInt();
System.out.printf("enter the column ");
c=xyz.nextInt();
for(i=1;i<=r;i++)
{
for(j=1;j<=c;j++)
{
if(j>=6-i && j<=4+i)
{
System.out.printf("*");
}
else
{
System.out.printf(" ");
}
}
System.out.printf("\n");
}
}
}
