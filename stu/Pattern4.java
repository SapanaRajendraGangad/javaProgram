
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k;
for(i=1;i<=5;i++)
{
k=1;
	for(j=1;j<=9;j++)
	{
		if((j>=6-i && j<6)|| (j<=4+i && j>=6))
		{
                   System.out.printf("%d",k);
			if(j<5)
			{ 
				k++;
			}
			else
			{
			k--;
				}
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
