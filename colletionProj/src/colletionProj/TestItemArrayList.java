package colletionProj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import vo.Item;
import vo.ItemIDComparator;
import vo.ItemNameComparator;
import vo.ItemValueComparator;

public class TestItemArrayList {
	
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<>();
		items.add(new Item(102, "Galaxy", 250));
		items.add( new Item(103, "One Plus", 400));
		items.add( new Item(101, "Samsung", 300));
		items.add(new Item(102, "Galaxy", 250));
		//comparator
//		Collections.sort(items, new ItemNameComparator());
//		Collections.sort(items, new ItemIDComparator());
//		Collections.sort(items, new ItemValueComparator());
		
		//Anon class ..
//		Comparator<Item> c = new Comparator<Item>() {
//			
//			@Override
//			public int compare(Item o1, Item o2) {
//				if(o1.getId() > o2.getId()) {
//					return 1;
//				} else if (o1.getId() < o2.getId()) {
//					return -1;
//				}
//				return 0;
//			}
//		};	
		//anon
//		Collections.sort(items, new Comparator<Item>() {
//			@Override
//			public int compare(Item o1, Item o2) {
//				if(o1.getId() > o2.getId()) {
//					return 1;
//				} else if (o1.getId() < o2.getId()) {
//					return -1;
//				}
//				return 0;
//			}
//		});
//		
//		for(Item item : items) {
////			System.out.println(item.hashCode());
//			System.out.println("Items: " + "id=" + item.getId() + ", item.name=" + item.getName() + ", price=" + item.getPrice());
//		}
		
//		Collections.sort(items, Item :: comparePrice);
		Collections.sort(items, Item :: compareName);

		//		
//		//comparable
//		Collections.sort(items);
		for(Item item : items) {
			System.out.println(item.hashCode());
			System.out.println("Items: " + "id=" + item.getId() + ", item.name=" + item.getName() + ", price=" + item.getPrice());
		}
		
//		Item itemC = new Item(101, "Samsung", 300);
//		System.out.println(items.contains(itemC));
//		
//		Object[] objArr= items.toArray();
//		for(Object obj : objArr) {
//			System.out.println(obj);
//		}
//		Item item = new Item();
//		item.setId(101);
//		
//		Item item1 = new Item(301, "Samsung", 5000);
//		Item item2 = new Item(301, "Samsung", 5000);
//		
////		System.out.println(items.contains(item));
//		System.out.println(items.contains(item1));
//		
//		if(item1== item2) {
//			System.out.println("Items are equal");
//		}
//		else {
//			System.out.println("Items are not equal");
//		}
//		if(item1.getId()==item2.getId() && item1.getName().equals(item2.getName()) && item1.getPrice() == item2.getPrice()) {
//			
//			System.out.println("Items are equal");
//		}
//		else {
//			System.out.println("Items are not equal");
//		}
//		if(item1.toString().equals(item2.toString())){
//			System.out.println("Items are equal");
//		}
//		else {
//			System.out.println("Items are not equal");
//		}
//		if(item1.equals(item2)) {
//			System.out.println("Items are equal");
//		}
//		else {
//			System.out.println("Items are not equal");
//		}
}
}
