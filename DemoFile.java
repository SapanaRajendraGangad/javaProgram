import java.io.*;
import java.util.*;
public class DemoFile
{
public static void main(String x[])throws IOException
{
FileWriter fw=new FileWriter("D:\\FileDemo\\ABC.txt",true);
BufferedWriter bw=new BufferedWriter(fw);
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of string");
String data=sc.nextLine();
bw.write(data);
bw.newLine();
bw.close();
fw.close();
System.out.println("Data save successfully.....................");
}
}