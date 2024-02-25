public class circlearea
{
public static void main(String x[])
{
float radius,PI=3.14f;
radius=Float.parseFloat(x[0]);
float area=PI*radius*radius;
System.out.printf("area of circle is %f\n",area);
float circum=2*PI*radius;
System.out.printf("circumferance of circle is %f\n",circum);
float diameter=2*radius;
System.out.printf("diameter of circle is %f\n",diameter);
}
}