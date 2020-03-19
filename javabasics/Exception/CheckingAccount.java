public class CheckingAccount

{
	public double balance;
	private int number;
	public CheckingAccount(int number1)
	{
		number = number1;
	}


void m1(){

try{

int i =10/0;

}

catch(Exception e)

{

System.out.println("exception in m1 method " +e);
e.printStackTrace();

}

}
/*public void deposit(double amount)
{

try{
balance = balance + amount ;
System.out.println("In Deposit method : " +balance);
throw new OTPException();
}
catch(OTPException e)
{

System.out.println("OTPException caught "+e);
e.printStackTrace();
}


}*/

public void deposit(double amount) throws OTPException
{

balance = balance + amount ; 
System.out.println("In deposit method : " +balance ) ; 
throw new OTPException();

}

public void withdraw(double amount) throws InsufficientFundsException
{

if ( amount <= balance)
{

balance=balance-amount;
System.out.println("In withdraw method if block :" +balance);

}

else 
{

System.out.println("In withdraw method else block : " +balance);
double needs = amount-balance;
throw new InsufficientFundsException(needs);

}


}

}