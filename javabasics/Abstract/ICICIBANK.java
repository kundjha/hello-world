abstract class Bank{

abstract public void credit(int depAmt);

abstract public void debit(int wAmt);

public void mf();

}

class ICICIBANK extends Bank

{

public void credit(int Dep)

{

System.out.println("ABC");

}

public void debit(int d)

{

System.out.println("DEF");

}

/*ICICIBANK I = new ICICIBANK();
I.credit(int a);
I.debit(int b);*/

public static void main (String args[]){

System.out.println("abbbb");

}

}