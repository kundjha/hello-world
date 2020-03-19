class Calculatormul
{
void multiply()
{
int i=10;
int j=20;
int k=i*j;
System.out.println("Multiplication in multiplication method is : " +k);
}

void multiply1(int x, int y)
{

int z =x*y;
System.out.println("Multiplication in multiply1 method is:" +z);
}

int multiply2(int a,int b)
{

int c =a*b;
System.out.println("Multiplication in multiply2 is :"+c);
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



public static void main (String[] args)
{
              Calculatormul a=new Calculatormul();

              a.multiply();
              a.multiply1(20,30);
              a.multiply2(30,40);

              int mul= a.multiply2(40,50);
              System.out.println("Multiplication returned is :"+mul);
              mul=mul*100;
              System.out.println("Multiltiplication  after multiplying :"+mul);

}
}