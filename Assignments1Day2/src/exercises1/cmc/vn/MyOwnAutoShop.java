/**
 * 
 */
package exercises1.cmc.vn;

/**
 * @author User
 *
 *         Oct 9, 2018
 */
public class MyOwnAutoShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create an instance of Sedan
		Sedan sedan = new Sedan(430, 2345567, "Blue", 4);
		// create two instances of Ford
		Ford ford1 = new Ford(367, 7654321, "While", 2018, 5);
		Ford ford2 = new Ford(214, 5000000, "RedBlack", 2019, 7);

		Car car = new Car(231, 321111, "Yellow");

		System.out.println("Sale price of sedan : " + sedan.getSalePrice());
		System.out.println(sedan.getSpeed());
		System.out.println("Sale price of ford 1 : " + ford1.getSalePrice());
		System.out.println("Sale price of ford 2 : " + ford2.getSalePrice());
		System.out.println("Sale price of car : " + car.getSalePrice());

	}

}
