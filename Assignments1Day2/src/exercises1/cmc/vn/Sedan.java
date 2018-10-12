/**
 * 
 */
package exercises1.cmc.vn;

/**
 * @author User
 *
 * Oct 9, 2018
 */
public class Sedan extends Car {
	private int length;

	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public double getSalePrice() {
		if (this.length > 20) {
			return getRegularPrice() - (getRegularPrice() * 0.05);
		} else {
			return getRegularPrice() - (getRegularPrice() * 0.1);
		}
	}


}
