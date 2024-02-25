import java.util.*;
public class DuckApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int rem=0,flag=0;
System.out.println("enter the value ");
package Inheritance;
import java.util.*;
class CheakDuck
{
	int no;
	boolean flag=false;
	CheakDuck(int a)
	{
		this.no=a;
	}
	boolean isDuck()
	{
		int rem;
		int temp=no;
		while(no!=0){
			rem = no % 10;
			no  = no /10;
			if(rem==0){
				flag=true;
				break;
			}
		}
		if(flag){

			return true;
		}
		else {
			return false;
		}
	}
}
public class DuckApp {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int no=sc.nextInt();
     CheakDuck cd=new  CheakDuck(no);
     boolean r=cd.isDuck();
     System.out.println(r);
	}

}

System.out.println("number is Duck");
}
else
{
System.out.println("number is not a Duck");
}
}
}












