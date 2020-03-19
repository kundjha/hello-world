class Division {

int a;
int b;


int Div(int a, int b) 
{
int d;
d=a/b;
System.out.println("The Division of numbers is :" + d);
return d;
}


public static void main (String[] args )
{
Division d =new Division();
d.Div(50,3);


}
  }