
public class Bottom extends Item {
	private int waist;
	private int inseam;
	
	public Bottom() {
		
	}
	
	public Bottom (String brand, String itemName, int waist, int inseam) {
		this.setBrand(brand);
		this.setItemName(itemName);
		this.setWaist(waist);
		this.setInseam(inseam);
	}

	public int getWaist() {
		return waist;
	}

	public void setWaist(int waist) {
		this.waist = waist;
	}

	public int getInseam() {
		return inseam;
	}

	public void setInseam(int inseam) {
		this.inseam = inseam;
	}

	public String getSize() {
		return this.waist + "x" + this.inseam;
	}
	
	@Override
	public String toString() {
		return ("ID: " + this.getItemId() + " - " + this.getBrand() + " " + this.getItemName() + " size " + this.getSize());
	}
	
	@Override
	public String toInvent() {
		return ("B!" + this.getBrand() + "!" + this.getItemName() + "!" + this.getWaist() + "!" + this.getInseam() + "!" + this.getItemId() + "!");
	}
}
