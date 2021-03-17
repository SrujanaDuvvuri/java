package colletionProj;

import vo.Item;

public class TestHashCode {
	public static void main(String[] args) {
		Item item1 = new Item(301, "Samsung", 5000);
		Item item2 = new Item(301, "Samsung", 5000);
		
		//not same
		System.out.println(item1.hashCode());
		System.out.println(item2.hashCode());
		System.out.println(item1.toString());
		
		String s1 = new String("Hello world!");
		String s2 = new String("Hello world!");
		System.out.println(s1==s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
	}
}
