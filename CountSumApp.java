import java.io.*;
public class CountSumApp
{
public static void main(String x[])throws IOException
{
File f=new File("D:\\FileDemo\\ABC.txt");
FileReader br=new FileReader(f);
int data,sum=0;
while((data=br.read())!=-1)
{
if(data>='0'&&data<='9')
{
sum=(data-48)+sum;
System.out.println((char)data+"\t");
}
}
System.out.println("sum is" +sum);

}
}