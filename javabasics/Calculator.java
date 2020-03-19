class Calculator
{
void add()
{
int i=10;
int j=20;
int k=i+j;
System.out.println("Sum in add method is : " +k);
}

void add1(int x, int y)
{

int z =x+y;
System.out.println("Sum in add1 method is:" +z);
}

int add2(int a,int b)
{

int c =a+b;
System.out.println("Sum in add2 method is :"+c);
return c;
}

String display()
{

String name="Selenium";
String name1 ="java";
String name2 = name + " " + name1;
System.out.println(name2);

return name2;
}

String display1()
{

char name = 'S';
char name1= 'J';
String name2 = name + " " + name1;
System.out.println(name2);
return name2;
}

public static void main (String[] args)
{
              Calculator a=new Calculator();
              Dog d = new Dog();
              d.barks();

              a.add1(20,30);
              a.add2(30,40);

              int sum= a.add2(40,50);
              System.out.println("sum returned is :"+sum);
              sum=sum+100;
              System.out.println("sum after adding :"+sum);
              String dis=a.display();
              String dis1=a.display1();
              System.out.println("Display value is :"+dis);
              System.out.println("Display1 value is :"+dis1);
}
}
