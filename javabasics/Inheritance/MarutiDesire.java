class MarutiSwift
{
String name = "Swift";

void engine ()
{

System.out.println("In Swift engine method ");

}

}

class MarutiDesire extends MarutiSwift

{

String name = "Swift Desire";

void accelaration()

{

System.out.println("In Accelaration method" );
}

void engine()
{

super.engine();
System.out.println(super.name);
System.out.println("In Swift Desire engine method ");

}
public static void main ( String[] args)
{
MarutiDesire s= new MarutiDesire();
s.engine();
System.out.println(s.name);
s.accelaration();

}
}

class MarutiDZ extends MarutiDesire

{

String name = "Swift DZ";
public static void main ( String[] args)

{

System.out.println("In Main Method of Maruti DZ class ");
MarutiDZ d = new MarutiDZ();
d.engine();

System.out.println(d.name);

MarutiSwift s=new MarutiSwift();
s.engine();

}

}



