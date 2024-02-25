package Inheritance;
import java.util.*;
public class package Inheritance;
import java.util.*;
class Voter extends ArithmeticException{
    String getVoterError(){
	return  "Invalid Voter because below 18";
  }
}
class VotingMachine
{
  void verifyVoter(int age)
  {
	  if(age<18)
	  {
			 Voter  ve = new Voter();
			   throw ve;
			}
			else{
			  System.out.println("valid voter");
			}
		   }
		} 
public class Exceptionapp {
	static int v[];
public static void main(String x[])
{
	int ch;
Scanner sc=new Scanner(System.in);
System.out.println("1.Classnotfoundexception\n"
		+ "2.Arrayindexoutofboundexception\n"
		+ "3.NumberFormatException\n"
		+ "4.InputmismatchException\n"
		+ "5.Nullpointerexception\n"
		+ "6.userdefinedexception");
do {
System.out.println("enter your choice");
 ch=sc.nextInt();
switch(ch)
{
case 1:
try
{
	Class.forName("com.delver");
}
catch(ClassNotFoundException ex)
{
	System.out.println("error is" +ex);
}
break;
case 2:
	try
	{
		int c[]=new int[]{10,20};
		System.out.println(c[2]);	
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("Error is" +ex);
	}
break;

case 3:
	try{
	    String s="12345 ";
	 int h =Integer.parseInt(s);
	System.out.println(h);
	}
	catch(NumberFormatException ex)
	{
	   System.out.println("Error is  "+ex);
	}
	break;
case 4:
	try
	{
		System.out.println("enter the value");
		int j=sc.nextInt();
		int k=sc.nextInt();
	}
	catch(InputMismatchException ex)
	{
		System.out.println("error is " +ex);
	}
break;
case 5:
try{
    v[0]=100;
     System.out.println(v[0]);
  }
  catch(NullPointerException ex)
   { 
	   System.out.println("Allocate memory for array");
      System.out.println("Error is "+ex);
   }
break;
case 6:
	try{
		VotingMachine vm = new VotingMachine();
		vm.verifyVoter(10);
	}
	catch(Voter ve){
	  System.out.println(ve.getVoterError());
	}
	break;

}
}
while(ch<=6);
}
}
 {
	static int v[];
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Arithmatic operation\n"
		+ "2.Arrayindexoutofboundexception\n"
		+ "3.Nullpointerexception\n"
		+ "4.Classnotfoundexception\n"
		+ "5.NumberFormatException\n"
		+ "6.InputmismatchException\n");
System.out.println("enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
	System.out.println("enter two values");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try
	{
		int c=a/b;
		System.out.println("division of two number is" +c);
	}
	catch(ArithmeticException ex)
	{
		System.out.println("exception handling" +ex);
	}
	System.out.println("Logic1 is exected");
	System.out.println("Logic2 is exeuted");
break;
case 2:
	try
	{
		int c[]=new int[]{10,20};
		System.out.println(c[2]);	
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("Error is" +ex);
	}
break;
case 3:
	
	try{
	     v[0]=100;
	      System.out.println(v[0]);
	   }
	   catch(NullPointerException ex)
	    { 
		   System.out.println("Allocate memory for array");
	       System.out.println("Error is "+ex);
	    }
  break;
case 4:
	try
	{
		Class.forName("com.delver");
	}
	catch(ClassNotFoundException ex)
	{
		System.out.println("error is" +ex);
	}
	break;
case 5:
	   try{
	        String s="12345 ";
		 int h =Integer.parseInt(s);
		System.out.println(h);
	    }
	   catch(NumberFormatException ex)
	    {
		   System.out.println("Error is  "+ex);
	    }
break;
case 6:
	try
	{
		System.out.println("enter the value");
		int j=sc.nextInt();
		//int k=sc.nextInt();
	}
	catch(InputMismatchException ex)
	{
		System.out.println("error is " +ex);
	}
break;

}

}
}
