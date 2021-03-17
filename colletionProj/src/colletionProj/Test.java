package colletionProj;

import vo.Item;

public class Test {

	public static void main(String[] args) {
		Item[] items = new Item[10];
		items[0] = new Item(101, "Samsung", 300);
		items[1] = new Item(102, "Galaxy", 250);
		items[2] = new Item(103, "One Plus", 400);
		
//		for(Item item : items) {
//			System.out.println("Items" + item.toString());
//		}
		System.out.println("Array lenght"+items.length);
	}

}