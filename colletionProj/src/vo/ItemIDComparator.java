package vo;

import java.util.Comparator;

public class ItemIDComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		if(o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		}
		return 0;
	}

	

}
