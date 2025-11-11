import java.lang.*;

public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public void setAccountNumber (int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public float getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setBalance (double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}	
	public Account()
	{
		System.out.println("This is empty constructor");
	}
	public Account (int accountNumber, String accountHolderName, double balance)
	{ 
	System.out.println("This is parameterized constructor");
	
	this.accountNumber=accountNumber;
	this.accountHolderName=accountHolderName;
	this.balance=balance;
	}
	public void showDetails()
	{
		
		System.out.println("The accountNumber is "+accountNumber+" ");
		System.out.println("The accountHolderName is "+accountHolderName+" ");
	    System.out.println("The balance is "+balance+" ");
	}
} 