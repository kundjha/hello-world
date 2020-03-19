abstract class A{

	//abstract public void m1();
	//abstract public void m2();



//non -abstract method -method with a body 

public void m3(){

System.out.println("This is a method body");

}
}

class B extends A{

public void m2(){

 System.out.println("This is m2 method in class B");

}

public void m1(){

 System.out.println("This is m1 method in class B");

}

public static void main(String args[]){

B b =new B();
b.m1();
b.m2();
b.m3();




}

}