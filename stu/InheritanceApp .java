class value{
	int x;
	void show(int no)
	{
		int c=no*no;
		System.out.println("square of number is"+c);
	}
}
class Add extends value{
	int no;
	public void show(int no)
	{
		int b=no*no*no;
		System.out.println("cube is\t"+b);
	}
}
public class InheritanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
value v=new value();
v.show(0);
	}

}
