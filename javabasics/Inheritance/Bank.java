class Bank {
/*Bank(){

System.out.println("In default Constructor");

}
*/
Bank (int i ) {

System.out.println("In overloaded amd parameterized Constructor : " +i);

}

public static void main ( String args[]){

Bank b =new Bank();
Bank b1 =new Bank(100);
}

}