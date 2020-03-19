interface Bank{

abstract public void credit ( int depAmt); //Abstract method doesn't have a body 

public void debit( int wAMT);
}

interface RBI{
public void interest (int amt);
}

class WorldBank{

public void bonus(int amt){

System.out.println("In bonus method of worldbamk"+amt);

}

}

class HDFCBank extands WorldBank implements Bank,RBI
{

int currentBal=500;


public void debit(int wAmt){

currentBal=currentBal-wAmt;
System.out.println(currentBal);

}

public void interest(int amt){

currentBal=currentBal+amt;
System.out.println(currentBal);

}


public void credit(int depAmt){


currentBal =currentBal + depAmt;
System.out.println(currentBal);
}

public static void main(String[] args){

HDFCBank d =new HDFCBank();
d.debit(100);
d.credit(200);
d.interest(10);
d.bonus();

}
}
}