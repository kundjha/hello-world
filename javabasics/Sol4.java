class Sol4 {

int a;
int b;
int c;


int Proba(int a, int b,int c) 
{
int d;
d=a+b*c;
System.out.println("The proba solution is :" + d);
return d;
}

int Probb(int a, int b,int c) 
{
int d;
int e;
d=(a+b);
e=d%9;

System.out.println("The proba solution is :" + e);
return d;
}

public static void main (String[] args )
{
Sol4 d =new Sol4();
d.Proba(-5,8,6);
d.Probb(55,9,9);
}
  }