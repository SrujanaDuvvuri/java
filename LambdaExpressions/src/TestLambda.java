import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestLambda {

	public static void main(String[] args) {
		

		ArrayList<Item> items = new ArrayList<>();
		items.add(new Item(102, "Galaxy", 250));
		items.add( new Item(103, "One Plus", 400));
		items.add( new Item(101, "Samsung", 300));
		items.add(new Item(102, "Galaxy", 250));
		
		Comparator<Item> comparator = (Item i1, Item i2) -> {
			return i1.getName().compareTo(i2.getName());
		};

		Collections.sort(items, comparator);
		
		Iterator<Item> itr = items.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//it should be functional interface
//		IArthimetic ia  = (int a, int b) -> {
//			return a + b;
//		};
//		System.out.println(ia.sum(37,56));
		
		Runnable run = () -> {
			System.out.println("Testing Lambda expressions..");
		};
//		Thread t = new Thread();
//		t.start();
//		t.run();
		IArthimetic ia1= new IArthimetic() {
			
			@Override
			public int sum(int a, int b) {
				return a + b ;
			}

			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		
		System.out.println(ia1.sum(25, 50));
	}
	
	

}
