class Vehicle
{
String model;
int registerationno;
int speed;
int fuel;
int consumption;
Vehicle(String model,int rsno,int speed,int fuel,int consum)
{
 this.model=model;
this.registerationno=rsno;
this.speed=speed;
this.fuel=fuel;
this.consumption=consum;
}
void setmodel(String model)
{
this.model=model;
}
String getmodel()
{
return model;
}
void setregistno(int rsno)
{
this.registerationno=rsno;
}
int getregistno()
{
return registerationno;
}
void setspeed(int speed)
{
this.speed=speed;
}
int getspeed()
{
return speed;
}
void setfuel(int fuel)
{
this.fuel=fuel;
}
int getfuel()
{
return fuel;
}
void setconsum(int consum)
{
this.consumption=consum;
}
int getconsum()
{
return consumption;
}

void fuelneeded(int distance)
{
int fuelneed=distance/getconsum();
System.out.println("distance coversd by vehicle is" +fuelneed);
}
void distanceCovered(int time)
{
int distance=getspeed()*time;
System.out.println("distance coversd by vehicle is" +distance);
}
void show()
{
System.out.println("\tmodel\t"+model+"\tRegistration no\t"+registerationno+"\tSpeed\t"+speed+"\tFuel\t"+fuel+"\tFuel Consumtion\t"+consumption);
}
}
class Bus extends Vehicle
{
public Bus(String model,int registerationno,int speed,int fuel,int consumption)
{
super(model,registerationno, speed,fuel,consumption);
}
}
class Truck extends Vehicle
{
public Truck(String model,int registerationno,int speed,int fuel,int consumption)
{
super(model,registerationno, speed,fuel,consumption);
}
}
public class Transport
{
public static void main(String x[])
{
System.out.println("***********Bus**********");
Vehicle b=new Bus("achg34",12354,50,25,10);
b.fuelneeded(30);
b.distanceCovered(2);
b.show();
System.out.println("number of passenger is" +30);
System.out.println("***********Truck**********");
Vehicle t=new Truck("chnn67",6789,100,25,20);
t.fuelneeded(30);
t.distanceCovered(2);
t.show();
System.out.println("cargo weight is" +1230);
}
}
