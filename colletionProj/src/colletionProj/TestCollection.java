package colletionProj;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {
	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Addu");
		names.add("Sujji");
		names.add("Satya");
		
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Satya");
		names1.add("Addu");
		names1.add("Sujji");
	
		
		System.out.println(names.size());
		System.out.println(names.contains("Sujji"));
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Adrija");
		names2.add("Srujana");
		names2.add("Debu");
		names2.add("Addu");
		
//		names.addAll(names2);
//		System.out.println(names);
//		System.out.println(names.size());
//		names.remove("Addu");
//		System.out.println(names);
//		System.out.println(names.size());
//		names.removeAll(names2);
//		System.out.println(names);
//		names.retainAll(names2);
		System.out.println(names);
		System.out.println(names.equals(names1));
		System.out.println(names.containsAll(names1));
		System.out.println(names.hashCode());
		names.addAll(names2);
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
//			String str = itr.next();
			System.out.println(itr.next());
		}
		
//		names.clear();
//		System.out.println(names);
//		System.out.println(names.size());
//		Object[] namesArray = names.toArray();
//		for (Object object : namesArray) {
//			System.out.println(object);
//
//		}
//		LinkedList<String> names2 = new LinkedList<String>();
//		names2.add("Addu");
//		names2.add("Sujji");
//		names2.add("Satya");
//		
//		System.out.println(names2.size());
//		System.out.println(names2.contains("Sujji"));
//		Object[] namesArray2 = names2.toArray();
//		for (Object object : namesArray2) {
//			System.out.println(object);
//		}
		
//		String[] namesArr = new String[names.size()];
//		names.toArray(namesArr);
//		System.out.println(names2.size());
		
	}
	
	
	
}
