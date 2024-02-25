
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
for(i=1;i<=5;i++)
{
	for(j=1;j<=5;j++)
	{
		if(j<=6-i)
		{
			System.out.printf("%d",j);
		}
	}
	System.out.printf("\n");
}
	}

}
