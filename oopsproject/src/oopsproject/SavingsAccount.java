package oopsproject;

//base class or parent class or base class
public class SavingsAccount {

	
	int accountNo;	
	private                float balance;
	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	int pin;
	
	public boolean isPinValid( int pin) {
		if(this.pin == pin) {
			
			return true;
		}
		return false;
	}
	final static int minBalance = 500;
	
	public static int getMinBalance() {
		return minBalance;
	}
//	public static void setMinBalance(int minBalance) {
//		SavingsAccount.minBalance = minBalance;
//	}
	
	
	//default constructor
	public SavingsAccount() {
		
	}
	//parameterised constructor 
							// parameters
	public SavingsAccount(int accNo, float bal, int pin) {
		this.accountNo = accNo;
		this.balance = bal;
		this.pin = pin;
	}
	protected void testProtected() {
		
	}
	public void deposit(int depositAmt) {
		if(depositAmt>0) {
			balance = balance + depositAmt;
		}else {
			System.out.println("Invalid amt");
		}
	}
	
	//withdraw(int)
	public void withdraw(int withdrawalAmt) {
		if(withdrawalAmt <= balance)
		{
			balance = balance - withdrawalAmt;
		}else {
			System.out.println("Insufficient funds");
		}
	}
	
	//withdraw(int,int)
	public void withdraw(int pin, int withdrawalAmt) {
		if(this.pin == pin)
		{
			if(withdrawalAmt <=4000)
			{
				withdraw(withdrawalAmt);
			}else {
				System.out.println("withdrawal lint exceeded");
			}
		}else {
			System.out.println("invalid pin");
		}
	}
	
	
	@Override
	public String toString() {
		return "SavingsAccount [accountNo=" + accountNo + ", balance=" + balance + ", pin=" + pin + "]";
	}	
}
