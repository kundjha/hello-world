class Employee{

int empId;
String name ;


//define constructor
Employee(int empId,String name){

this.empId=empId;
this.name=name;

System.out.println("Inside constructor empid is"+empId);


System.out.println("Inside Constructor empname is"+name);

}

void getEmpDetails(){

System.out.println("empid is"+empId);


System.out.println("empname is"+name);

}


	public static void main(String args[]){

Employee e1=new Employee(1001,"Amit");
Employee e2=new Employee(1002,"Sumit");

e1.getEmpDetails();
e2.getEmpDetails();
}
}