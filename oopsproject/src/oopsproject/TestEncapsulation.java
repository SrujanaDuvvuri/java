package oopsproject;

public class TestEncapsulation {

	public static void main(String[] args) {

		SavingsAccount account = new SavingsAccount(101,5000,1234);
//		
//		account.balance =10000;
		
		account.deposit(6000);
		System.out.println(SavingsAccount.getMinBalance());
		System.out.println(account.getBalance());

	}
       
}
      