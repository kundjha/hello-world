class Dog {

int age=10;
String color ="brown";

void barks () 
{
System.out.println("DOG BARKS");
}

void run() 
{
System.out.println("Dog Runs");
}
public static void main (String[] args )
{
Dog d =new Dog();
d.barks();
d.run();

System.out.println("Age of the dog is " +d.age) ;

System.out.println("Color of the dog is " +d.color) ;
}
  }