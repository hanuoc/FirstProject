package exercises1.cmc.vn;

/**
 * @author User
 *
 * Oct 9, 2018
 */
public class Ford extends Car {
	private int year;
	private int manufacturerDiscount;
	public Ford() {
		super();
	}

	public Ford(int speed, double regularPrice, String color,int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public Ford(int year, int manufacturerDiscount) {
		super();
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}
	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	public double getSalePrice() {
		return super.getSalePrice() - (getRegularPrice() * getManufacturerDiscount() / 100);
	}
	

}
