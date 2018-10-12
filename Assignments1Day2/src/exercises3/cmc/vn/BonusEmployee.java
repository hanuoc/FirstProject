/**
 * 
 */
package exercises3.cmc.vn;

/**
 * @author User
 *
 * Oct 9, 2018
 */
abstract class Employee {
	private String name;
	private String address;
	private int basicSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public abstract int getMonthSalary();

}

class NormalEmployee extends BonusEmployee {

	@Override
	public int getMonthSalary() {
		return getBasicSalary() * 30;
	}

}
public class BonusEmployee extends Employee {
	private int bonus;
	@Override
	public int getMonthSalary() {
		
		return getBasicSalary() * 30 + this.bonus;
	}
	
}

