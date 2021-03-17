package colletionProj;

public class TestRecursive {

	public static void main(String[] args) {

		System.out.println(factorial(3));
		System.out.println(sum(10));
		reverseStr("Hello");
	}
	
	public static int factorial(int n){
		if(n == 0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}else {
			return n+sum(n-1);
		}
	}
	
	public static void reverseStr(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println(sb.reverse().toString());
		
		char c[] = s.toCharArray();
		String newString = "";
		for(int i=s.length()-1; i>=0;i--) {
			newString += c[i] ;
		}
		System.out.println(newString);
		
	}
	
	

}
