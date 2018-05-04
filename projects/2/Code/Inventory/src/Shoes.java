
public class Shoes extends Item {
	private double size;

	public Shoes() {
		
	}
	
	public Shoes (String brand, String itemName, double size) {
		this.setBrand(brand);
		this.setItemName(itemName);
		this.setSize(size);
	}
	
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	} 

	@Override
	public String toString() {
		return ("ID: " + this.getItemId() + " - " + this.getBrand() + " " + this.getItemName() + " size " + String.format("%,.1f", this.getSize()));
	}
	
	@Override
	public String toInvent() {
		return ("S!" + this.getBrand() + "!" + this.getItemName() + "!" + this.getSize() + "!" + this.getItemId() + "!");
	}
}
