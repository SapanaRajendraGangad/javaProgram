
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
boolean flag=true;
for(i=1;i<=5;i++)
{
flag=true;
	for(j=1;j<=17;j++)
	{
		if(j>=10-i && j<=8+i  && flag)
		{
			System.out.printf("%d",i);
			flag=false;
		}
		else {
			System.out.printf("*");
			flag=true;
		}
	}
	System.out.printf("\n");
}
	}

}
