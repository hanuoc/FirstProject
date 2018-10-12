package exercises1.cmc.vn;

/**
 * @author User
 *
 * Oct 9, 2018
 */
public class Truck extends Car {
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Truck() {
		super();
	}

	public Truck(int weight) {
		super();
		this.weight = weight;
	}

	
	public double getSalePrice() {
		if(this.weight>2000) {
			return getSalePrice() -(getSalePrice()*0.1);
		}
		return getSalePrice() -(getSalePrice()*0.2);
	}
	
	
}
