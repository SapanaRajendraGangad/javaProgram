import java.io.*;
public class CreateFolderApp
{
public static void main(String x[])
{
File f=new File("D:\\FileDemo");
File f1[]=f.listFiles();
System.out.println("List of files are");
for(int i=0;i<f1.length;i++)
{
System.out.println(f1[i]);
}
}
}