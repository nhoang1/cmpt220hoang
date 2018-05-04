//Every Item in the inventory will extends this class
public abstract class Item {
	private String brand; 
	private String itemName;
	private int itemId = (int)(Math.random()*9000)+1000; //Every item has a 4 digit id number
	
	
	//Getters and Setters
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String toString() {
		return "null";
	}
	
	public boolean isId(int i) {
		if (this.itemId == i) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toInvent() {	
		return null;
	}
	
}
