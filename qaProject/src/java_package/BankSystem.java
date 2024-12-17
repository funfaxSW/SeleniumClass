package java_package;

public class BankSystem {

	int amt=5000;
	void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("The balance after the deposit "+amt);
	}
	void withdraw(int wt)
	{
		amt=amt-wt;
		System.out.println("The amount after the withdraw "+amt);
	}
	int display()
	{
		return amt;
	}
	
	public static void main(String[] args) {
		// Create a object
		BankSystem obj= new BankSystem();
		obj.deposit(1000);
		obj.withdraw(1000);
		System.out.println(obj.display());

	}

}
