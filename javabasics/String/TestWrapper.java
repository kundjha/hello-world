public class TestWrapper{

public static void main ( String args[]){

Integer x = 5 ; //boxes int to an integre object int i = 5 ;
x= x + 10 ;// Unboxes the interger to an int 

System.out.println(x);

Integer y = 5 ;
System.out.println(y.toString());
System.out.println(Integer.toString(12));


int e = Integer.parseInt("9");

double f = Double.parseDouble("5.2");


System.out.println(e);
System.out.println(f);

}

}

