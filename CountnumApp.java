import java.io.*;
import java.util.*;
public class CountnumApp
{
public static void main(String x[])throws IOException
{
File f=new File("D:\\FileDemo\\ABC.txt");
FileReader br=new FileReader(f);
BufferedReader fr=new BufferedReader(br);
int data,count=0,p=0,c=0,t=0,ch,g=0,v=0;
String d;
Scanner sc=new Scanner(System.in);
System.out.println("1.digit count\n2.vowel count consonat count\n3.Character\n 4.wordes\n 5.spacial symbol\n");
System.out.println("enter your choice");
 ch=sc.nextInt();
switch(ch)
{
case 1:
while((data=br.read())!=-1)
{
if(data>='0'&&data<='9')
{
count++;
System.out.println((char)data+"\t");
}
}
System.out.println("number of digit  is" +count);
break;
case 2:
while((data=br.read())!=-1)
{
if(data=='a'||data=='A'&&data=='e'||data=='E'||data=='i'||data=='I'||data=='o'||data=='O'||data=='u'||data=='U')
{
c++;
}
else
{
p++;
}
}
System.out.println("number of wovel  is" +c);
System.out.println("number of consonant  is" +p);
break;
case 3:
while((data=br.read())!=-1)
{
if(data>='a'&&data<='z'||data>='A'&&data<='Z')
{
t++;
}
System.out.println("number of character  is" +t);
break;
case 4:
while((d=fr.readLine())!=null)
{
String words[]=d.split(" ");
g=g+words.length;
}
System.out.println("number of wordes  is" +g);
break;
case 5:
while((data=br.read())!=-1)
{
if(data>='a'&&data<='z'||data>='A'&&data<='Z')
{
t++;
}
else if(data>='0'&&data<='9')
{
count++;
}
else
{
v++;
System.out.println((char)data+"\t");
}
}
System.out.println("number of special symbol  is" +v);
break;
}
}
}