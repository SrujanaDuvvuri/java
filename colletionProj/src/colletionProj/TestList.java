package colletionProj;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestList {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.add("Addu");
		names.add("Sujji");
		names.add("Satya12");
		names.add("Adrija");
		names.add("Srujana");
		names.add("Satya22");
		names.add("Debu");
		
		Collections.sort(names);
		System.out.println(names);
		
//		System.out.println(names.get(5));
//		names.set(4, "Addubujji");
//		names.add(4, "susi");
//		names.remove(0);
//		System.out.println(names.get(5));
//		System.out.println(names.indexOf("susi"));
//		System.out.println(names.indexOf("Satya"));
//		System.out.println(names.lastIndexOf("Satya"));

//		System.out.println(names);
		
//		Iterator<String> itr= names.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next());
//		}
		
//		ListIterator<String> list = names.listIterator();
//		list.next();
//		list.next();
//		System.out.println(list.previous());
//		while(list.hasNext()) {
//			System.out.print(list.next());
//		}
	}
}
