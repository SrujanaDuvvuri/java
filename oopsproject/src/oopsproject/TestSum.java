package oopsproject;

public class TestSum {

	public static void main(String[] args) {

		Sum sum = new Sum();
		int[] sumVales = {12,25,30,43};
		int sumValue = sum.add(sumVales);
		System.out.println("sum = " + sumValue);
		
		IArthimetic a = new Arthimetic();
		a.sum(12, 20);
	}

}
