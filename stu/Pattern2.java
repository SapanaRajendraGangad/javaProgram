
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
boolean flag=true;
for(i=1;i<=7;i++)
{
flag=true;
	for(j=1;j<=7;j++)
	{
		if(i>=j)
		{
			System.out.printf("%d",j);
			//flag=false;
		}
	}
	System.out.printf("\n");
}
	}

}
