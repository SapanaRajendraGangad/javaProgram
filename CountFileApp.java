import java.util.*;
import java.io.*;
public class CountFileApp
{
public static void main(String x[])throws IOException,InterruptedException
{
File f=new File("D:\\FileDemo\\ABC.txt");
FileReader fr=new FileReader(f);
int data,count=0;
while((data=fr.read())!=-1)
{
count++;
System.out.println((char)data);
Thread.sleep(100);
}
System.out.println(count);
}
}
