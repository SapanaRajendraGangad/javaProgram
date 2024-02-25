abstract class Animal
{
abstract void makeSound();
}
class Cat extends Animal
{
void makeSound()
{
System.out.println("MAU");
}
}
class Dog extends Animal
{
void makeSound()
{
System.out.println("BARK");
}
}
public class AnimalApp
{
public static void main(String x[])
{
System.out.println("********CAT*********");
Cat c=new Cat();
c.makeSound();
System.out.println("********DOG*********");
Dog D=new Dog();
D.makeSound();
}
}
