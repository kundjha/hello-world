class ExcepTest1{



void m1(){

	int a[] = new int[2];

try{

		
		
		String s1=null;
		int i =10/0;
		s1.toString();
		System.out.println(" Access element three : "+a[32]);

	}


/*catch(ArithmeticException e){

	System.out.println("Arithmetic exception Thrown : " +e);
	e.printStackTrace();

}

catch(NullPointerException e){

	System.out.println("null exception Thrown : " +e);
	e.printStackTrace();

}

catch(ArrayIndexOutOfBoundsException e){

	System.out.println("Array index  exception Thrown : " +e);
	e.printStackTrace();

}

catch(Exception e){

		System.out.println("Exception thrown : " + e) ;
		e.printStackTrace();

}*/

finally{

//conn = null ;
//rs=null;

 a[0] =6;
 System.out.println("First element value : " +a[0]);
 System.out.println("The finally statement is executed ");


}
}

	public static void main ( String args[]){
	
	ExcepTest1 e1 = new ExcepTest1();
	e1.m1();
	System.out.println("Out of the block " );

}
}