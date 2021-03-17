package colletionProj;

import vo.Item;

public class TestToString {

	public static void main(String[] args) {

		Item item1 = new Item(301, "Samsung", 5000);

		System.out.println(item1.toString());
		System.out.println(item1);
		
		String s1 = new String("Hello world!");
		System.out.println(s1.toString());

	}

}
