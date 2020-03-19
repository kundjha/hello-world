public class BankDemo
{

public static void main(String [] args)

{

CheckingAccount c = new CheckingAccount(101);

try 

{

//c.m1();
System.out.println("Depositing Rs500...");
c.deposit(500.00);
System.out.println( " Withdrawing rs 100.. ");
c.withdraw(100.00);
System.out.println( " Withdrawing rs 600.. ");
c.withdraw(600.00);
System.out.println("After withdrawing Rs 600 ... ");

}catch(InsufficientFundsException e)
{

 System.out.println("Sorry , but you are short Rs " + e.getAmount());
 e.printStackTrace();

}

catch(OTPException e)
{

System.out.println("OTPException caught" + e);
e.printStackTrace();

}

}

}