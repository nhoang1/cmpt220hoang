
public class Top extends Item {
	private String size;
	
	public Top() {
		
	}
	
	public Top (String brand, String itemName, String size ) {
		this.setBrand(brand);
		this.setItemName(itemName);
		this.setSize(size);
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return ("ID: " + this.getItemId() + " - " + this.getBrand() + " " + this.getItemName() + " size " + this.getSize());
	}
	
	@Override
	public String toInvent() {
		return ("T!" + this.getBrand() + "!" + this.getItemName() + "!" + this.getSize() + "!" + this.getItemId() + "!");
	}
}
