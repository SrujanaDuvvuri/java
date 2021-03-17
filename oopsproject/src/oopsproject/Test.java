package oopsproject;

public class Test {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount(101, 5000, 1222);
		System.out.println("account" + account.toString());
		account.deposit(6000);
		System.out.println("account" + account.toString());

		System.out.println("SavingsAccount.minBalance" + SavingsAccount.minBalance);
//		SavingsAccount.minBalance = 1000;
		System.out.println("SavingsAccount.minBalance" + SavingsAccount.getMinBalance());

		SavingsAccount account2 = new SavingsAccount(102, 10000, 3442);
		
		System.out.println("account2" + account2.toString());

		account.withdraw(1222, 1000);
		System.out.println("account" + account.toString());

		
	}

}
