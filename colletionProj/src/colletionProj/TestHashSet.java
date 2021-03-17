package colletionProj;

import java.util.TreeSet;

import vo.Item;
import vo.ItemNameComparator;

public class TestHashSet {

	public static void main(String[] args) {

//		HashSet<String> names = new HashSet<>();
//		
//		names.add("Addu");
//		names.add("Sujji");
//		names.add("Satya");
//		names.add("Adrija");
//		names.add("Srujana");
//		names.add("Satya");
//		
//		for(String str : names) {
//			System.out.println(str);
//		}
		
//		LinkedHashSet<String> names = new LinkedHashSet<>();
//		
//		names.add("Addu");
//		names.add("Sujji");
//		names.add("Satya");
//		names.add("Adrija");
//		names.add("Srujana");
//		names.add("Satya");
//		
//		for(String str : names) {
//			System.out.println(str);
//		}
		
//		Set<String> names = new HashSet<String>();
		TreeSet<String> names = new TreeSet<String>();
		names.add("Addu");
		names.add("Sujji");
		names.add("Satya");
		names.add("Adrija");
		names.add("Srujana");
		names.add("Satya");
		
		for(String str : names) {
			System.out.println(str);
		}
		
		TreeSet<Item> items = new TreeSet<>(Item :: compareName);
		items.add(new Item(102, "Galaxy", 250));
		items.add( new Item(103, "One Plus", 400));
		items.add( new Item(101, "Samsung", 300));
		items.add(new Item(102, "Galaxys", 500));
		for(Item item : items) {
			System.out.println(item.hashCode());
			System.out.println("Items: " + "id=" + item.getId() + ", item.name=" + item.getName() + ", price=" + item.getPrice());
		}
		
	}

}
