package classand;
import java.util.*;
public class PrimitiveConversion {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String s=sc.next();
    int sum=0;
    char []c=s.toCharArray();
    for(int i=0;i<c.length;i++)
    {
    	if(c[i]>'a'&&c[i]<'z');
    	{
    		System.out.println(c[i]);
    	}
    	else {
    		sum=sum+c[i];
    	System.out.println(sum);
    	}
    }
	}

}
