package oopsproject;

//child class or subclass or derived class
public class JuniorSavingsAccount extends SavingsAccount{
	
	String guardianName;
	


	public JuniorSavingsAccount(int accNo, float bal, int pin, String guardianName) {
		super(accNo, bal, pin);
		this.guardianName = guardianName;
	}


	public JuniorSavingsAccount() {
		
	}
	
	
//	public JuniorSavingsAccount(int accNo, float bal, int pin, String guardianName) {
//		this.accountNo = accNo;
//		this.balance = bal;
//		this.pin = pin;
//		this.guardianName = guardianName;
//	}
//	
	
	//withdraw(int,int)
	@Override
	public void withdraw(int pin, int withdrawalAmt) {
			if(this.pin == pin)
			{
				if(withdrawalAmt <=1000)
				{
					withdraw(withdrawalAmt);
				}else {
					System.out.println("withdrawal lint exceeded");
				}
			}else {
				System.out.println("invalid pin");
			}
		}
	
}
