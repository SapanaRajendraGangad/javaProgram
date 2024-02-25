import java.util.*;
class Kbc
{
private int qid;
private String question;
private String option1;
private String option2;
private String option3;
private String option4;
private String correctanswer;
public void setid(int qid)
{
this.qid=qid;
}
public int getid()
{
return qid;
}
public void setquestion(String question)
{
this.question=question;
}
public string getquestion()
{
return question;
}
public void setoption1(String option1)
{
this.option1=option1;
}
public string getoption()
{
return option1;
}
public void setoption2(String option2)
{
this.option2=option2;
}
public string getoption2()
{
return option2;
}
public void setoption3(String option1)
{
this.option3=option3;
}
public string getoption()
{
return option3;
}
public void setoption4(String option1)
{
this.option4=option4;
}
public string getoption()
{
return option4;
}
public void setanswer(string correctanswer)
{
this.correctanswer=correctanswer;
}
public string getanswer()
{
return correctanswer;
}
}
public class Questions
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
Kbc[] k = new Kbc[5];
int c=0;
for(int i=0;i<5;i++)
{
 k[i]=new Kbc();
System.out.println("enter the questionid");
int qid=xyz.nextInt();
k.setid(qid);
int p=
System.out.println();
System.out.println("enter the question");
String question=xyz.nextString();
k[i].setquestion();
System.out.println(getquestion());
System.out.println("enter the option1");
String option1=xyz.nextString();
k[i].setoption1();
int i=getoption1();
System.out.println("enter the option2");
String option2=xyz.nextString();
k.setoption2();
System.out.println(k[i].getoption2());
System.out.println("enter the option3");
String option3=xyz.nextString();
k.setoption3();
System.out.println(k[i].getoption3());
System.out.println("enter the option4");
String option4=xyz.nextString();
k.setoption4();
System.out.println(k[i].getoption4());
System.out.println("enter the answer");
String answer=xyz.nextString();
k.setanswer();
System.out.println(k[i].getanswer());
System.out.println("enter the correct answer");
String ans=xyz.nextString();
if((k[i].getanswer==ans))
{
c++;
}
}
}
}




