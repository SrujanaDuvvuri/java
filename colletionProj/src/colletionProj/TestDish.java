package colletionProj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import vo.Dish;
import vo.DishType;

public class TestDish {

	public static void main(String[] args) {
		
		ArrayList<Dish> dishes = new ArrayList<Dish>();
		dishes.add(new Dish("Pork fry", false, 800, DishType.MEAT));
		dishes.add(new Dish("Pepper chicken", false, 700, DishType.MEAT));
		dishes.add(new Dish("BBQ ribs", false, 600, DishType.MEAT));
		dishes.add(new Dish("French fries", true, 500, DishType.OTHER));
		dishes.add(new Dish("Double cheese pizza", true, 400, DishType.OTHER));
		dishes.add(new Dish("Season fruit", true, 120, DishType.OTHER));
		dishes.add(new Dish("Salmon", false, 500, DishType.FISH));
		dishes.add(new Dish("Prawns", false, 300, DishType.FISH));
		dishes.add(new Dish("Rice pudding", true, 200, DishType.OTHER));
		dishes.add(new Dish("Milk shake", true, 150, DishType.OTHER));
		
//		Collections.sort(dishes); 
		
//		Anonmous inner classes..
//		Comparator<Dish> comparator = new Comparator<Dish>() {
//			
//			@Override
//			public int compare(Dish o1, Dish o2) {
//				if(o1.getCalories()>o2.getCalories()) {
//					return 1;
//				}else if(o1.getCalories()<o2.getCalories()) {
//					return -1;
//				}
//				return 0;
//			}
//		};
//		
//		Collections.sort(dishes, comparator);
//		Iterator<Dish> iterator = dishes.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
		
		//Using Lambda expressions.. 
		
//		Comparator<Dish> c = (Dish d1, Dish d2) ->{
//			if(d1.getCalories()> d2.getCalories()) {
//				return 1;
//			} else if (d1.getCalories() < d2.getCalories()) {
//				return -1;
//			}
//			return 0;
//		};
//		Collections.sort(dishes, c);
//		
//		Iterator<Dish> itr = dishes.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//-----------------------------------------------
		//using method reference to use it many places..
		
		Collections.sort(dishes, Dish :: compareCalories);
		Iterator<Dish> itr = dishes.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
