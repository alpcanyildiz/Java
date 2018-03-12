/**
 * 
 * @author AlpcanYýldýz-ÝsmailBurakKurhan , 220201049-220201055
 *
 */
public class Employee {

	String name;
	int age;
	private Type type;
	private double number_of_hours_worked;
	private double number_of_hours_overtime_worked;
	private int amount_of_sale;
	private double salary;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
		else
			System.out.println("Please enter a valid name");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (0 < age && age < 80)
			this.age = age;
		else
			System.out.println("Please enter a valid age");

	}

	public double getNumber_of_hours_worked() {
		return number_of_hours_worked;
	}

	public void setNumber_of_hours_worked(double hour) {

		if (0 <= hour)
			this.number_of_hours_worked = hour;
		else
			System.out.println("Please enter a valid hour");
	}

	public double getNumber_of_hours_overtime_worked() {
		return number_of_hours_overtime_worked;
	}

	public void setNumber_of_hours_overtime_worked(double hour) {

		if (0 <= hour)
			this.number_of_hours_overtime_worked = hour;
		else
			System.out.println("Please enter a valid hour");

	}

	public int getAmount_of_sale() {
		return amount_of_sale;
	}

	public void setAmount_of_sale(int sales) {

		if (0 < sales)
			this.amount_of_sale = sales;
		else
			System.out.println("Please enter a valid  amount of sale");

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double number_of_hours_worked, double number_of_hours_overtime_worked, int amount_of_sale) {
		if (type.equals(Type.STAFF)) {
			if (amount_of_sale < 50) {
				this.salary = (number_of_hours_worked * 35.0) + (number_of_hours_overtime_worked * 17.50);
			} else {
				this.salary = (number_of_hours_worked * 35.0) + (number_of_hours_overtime_worked * 17.50) + (100);
			}
		}
		if (type.equals(Type.PART_TIME)) {
			if (amount_of_sale < 70) {
				this.salary = (number_of_hours_worked * 20.0) + (number_of_hours_overtime_worked * 10);
			} else {
				this.salary = (number_of_hours_worked * 20.0) + (number_of_hours_overtime_worked * 10) + (100);
			}
		}
		if (this.type.equals(Type.INTERN)) {
			if (amount_of_sale < 30) {
				this.salary = (number_of_hours_worked * 5) + (number_of_hours_overtime_worked * 2.5);
			} else {
				this.salary = (number_of_hours_worked * 5) + (number_of_hours_overtime_worked * 2.5) + (10);
			}
		}
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;

	}
}