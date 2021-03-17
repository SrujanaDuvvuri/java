package oopsproject;


public class TestInheritance {

	public static void main(String[] args) {

		JuniorSavingsAccount account = new JuniorSavingsAccount();
		account.accountNo = 101;
//		account.balance = 1500;
		account.setBalance(1000);
		account.pin = 1230;
		account.guardianName = "Srujana";
		
		System.out.println(account.toString());
		account.withdraw(1230,1200);
		System.out.println(account.toString());
		
		JuniorSavingsAccount account2 = new JuniorSavingsAccount(102, 3000, 1222, "Addu");
		System.out.println(account2.toString());
		account2.deposit(1100);
		System.out.println(account2.toString());
		
//		Sample s = new Sample();
//		s.testProtected();
	}

}
