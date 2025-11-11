import java.lang.*;
public class Start 
{
	public static void main (String[] args)
	{
		Account a = new Account();
        a.setAccountNumber(46983);
        a.setAccountHolderName("FARHAN");
		a.setBalance(69.96);
		System.out.println("The Account number is "+a.getAccountNumber());

		System.out.println("This Account Holder Name is "+a.getAccountHolderName());

		System.out.println("This balance is "+a.getBalance());

		Account a1= new Account(23331,"Alif",45.23);
		a1.showDetails();

	}
}