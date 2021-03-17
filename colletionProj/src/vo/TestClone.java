package vo;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {

		Item item1 = new Item(301, "Samsung", 5000);

	Item itemClone = (Item)item1.clone();
	System.out.println(itemClone);
	item1.setId(303);
	item1.setName("OnePlus");
	System.out.println(item1);
	itemClone.setPrice(2000);
	System.out.println(itemClone);
	
	
	}

}
