package anonymous;

public class TestAnonClass {
	
	public static void main(String[] args) {
		IArthimetic ia = new IArthimetic() {
			
			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println("Result is.. " + ia.sum(35, 29));
	}
}
