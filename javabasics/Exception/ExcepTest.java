class ExcepTest1{



void m1(){

	int a[] = new int[2];

try{

		
		String s1=null;
		int i =10/0;
		s1.toString();
		System.out.println(" Access element three : "+a[32]);

	}

catch(ArithmeticException e){

	System.out.println("Null exception Thrown : " +e);
	e.printStackTrace();

}

catch(NullPointerException e){

	System.out.println("index exception Thrown : " +e);
	e.printStackTrace();

}

catch(ArrayIndexOutOfBoundsException e){

	System.out.println("Arthmetic exception Thrown : " +e);
	e.printStackTrace();

}
catch(Exception e){

		System.out.println("Exception thrown : " + e) ;
		e.printStackTrace();

}

}

	public static void main ( String args[]){
	
	ExcepTest1 e1 = new ExcepTest1();
	e1.m1();
	System.out.println("Out of the block " );

}
}