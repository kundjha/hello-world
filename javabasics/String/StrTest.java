class StrTest{

public static void main(String args[]){

String s1 = "Hello";//String literal
String s2 ="Hello";//String literal
String s3 = s1;//Same ref
String s4 = new String("Hello");//String object 
String s5 = new String("Hello");//String object 

if(s1 == s1)
System.out.println("s1 == s1 -->true"); //true ,same pointer


if(s1 == s2)
System.out.println("s1 == s2 -->true"); //true ,same pointer


if(s1 == s3)
System.out.println("s1 == s3 -->true"); //true ,same pointer

if(s1.equals(s3))//True,same content
System.out.println("s1.equals(s3) -->true"); //true ,same pointer


if(s1 == s4 )

System.out.println("s1 == s4 -->true");

//false , different pointers 

else 
System.out.println("s1 == s4 -->False ");

if(s1 == s5 )

System.out.println("s1 == s5 -->true");

//false , different pointers  in heap

else 
System.out.println("s1 == s5 -->False ");

if ( s4.equals(s5))// true ,same contents 

System.out.println("s4.equals(s5)-->true " ) ;

}

}
