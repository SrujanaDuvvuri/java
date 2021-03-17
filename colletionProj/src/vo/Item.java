package vo;

public class Item implements Cloneable, Comparable<Item>{
	int id;
	String name;
	float price;
	
	public Item() {
		
	}
	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public static int comparePrice(Item i1, Item i2) {
		if(i1.getPrice()>i2.getPrice())
			return 1;
		else if(i1.getPrice() < i2.getPrice())
			return -1;
		return 0;
	}
	
	public static int compareName(Item i1, Item i2) {
		return i1.getName().compareTo(i2.getName());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
@Override
public Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
	@Override
	public int compareTo(Item i) {
		if(this.id > i.id) {
			return 1;
		}else if(this.id < i.id) {
			return -1;
		}
		return 0;
		
//		return this.name.compareTo(i.name) ;
	}
	
	
}
