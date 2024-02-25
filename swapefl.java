public class swapefl
{
 public static int reverse(int no)
  {
      int rev=0,rem=0;
       while(no!=0)
       {
	  rem=no%10;
          rev=rev*10+rem;
          no/=10; 	
       }
    System.out.println("reverse Number :"+rev);
      return rev;
  }
public static void main(String x[])
{
	int no,fd=0,ld=0,c=0,temp=0,mid,i=1;
	no=Integer.parseInt(x[0]);
	ld=no%10;
	no/=10;
	no= reverse(no) ;
        temp=no;
           while(temp!=0)
           {
          c++;
          temp/=10;
           }
        fd=no%10;
         no/=10;
        mid= reverse(no) ;
     
         mid*=10;
          System.out.println("Mid Number :"+mid);
           while(i<=c)
           {
                 ld*=10;
               i++;
            }
            System.out.println("Last Number :"+ld);
           ld+=mid+fd;	
         System.out.println("after swaping first and last digit :"+ld);
}
}