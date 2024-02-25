abstract class Animal
{
abstract void sleep();
abstract void eat();
}
class Dog extends Animal
{
void sleep()
{
System.out.println("Dog is sleeping");
}
void eat()
{
System.out.println("Dog is Eatting");
}
void breed()
{
System.out.println("Dog is Breeding");
}
void bark()
{
System.out.println("Dog is Barkking");
}
}
public class AnimalApp
{
public static void main(String x[])
{
Dog a=new Dog();
a.sleep();
a.eat();
a.breed();
a.bark();
}
}