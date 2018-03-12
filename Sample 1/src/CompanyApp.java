import java.util.Scanner;
/**
 * 
 * @author AlpcanYýldýz-ÝsmailBurakKurhan , 220201049-220201055
 *
 */
 

public class CompanyApp {

	public static void main(String[] args) {
		startTheProgram();
	}

	public static void startTheProgram(){
		Company xcompany = new Company();
		xcompany.fileInfoReader();
		while (true) {
			xcompany.printEmploye();
			printMenu();
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			boolean flag = true;
			switch (number) {
			case 1:
				number = 1;
				String name = "";
				int age = 0;
				Type value = null;

				while (flag) {
					System.out.println("Please enter an employee Name and Surname ");
					Scanner name1 = new Scanner(System.in);
					if (!name1.hasNextInt()) {
						name = name1.next();
						name += name1.nextLine();
						flag = true;
						break;
					} else {
						System.out.println("please enter a valid name");
					}
				}
				while (flag) {
					System.out.println("Please enter an employee age");
					Scanner age1 = new Scanner(System.in);
					if (age1.hasNextInt()) {
						age = age1.nextInt();
						flag = true;
						break;

					} else {
						System.out.println("please enter a valid age");
					}
				}
				while (flag) {
					System.out.println("Please enter an employee type");
					Scanner type1 = new Scanner(System.in);
					if (!type1.hasNextInt()) {
						
						try{ value = Type.valueOf(type1.next().toUpperCase());
						flag = true;
						break;
					}
						catch(IllegalArgumentException e){
							continue;
						}		
						}
						else {

						System.out.println("please enter a valid type");
					}
				}

				xcompany.addingAnEmployee(name, age, value);
				break;
			case 2:
				number = 2;
				xcompany.printEmploye();
				while (flag) {
					System.out.println("Which employee do you want to remove");
					String deleting_name = input.next();
					deleting_name += input.nextLine();
					for (int i = 0; i < xcompany.employee_list.size(); i++) {
						if (deleting_name.equals(xcompany.employee_list.get(i).getName())) {
							xcompany.removeAnEmployee(deleting_name);
							flag = false;
							break;
						} else {
							continue;
						}
					}
				}
				flag=true;
				break;
			case 3:
				number = 3;
				xcompany.printEmploye();
				while(flag){
				System.out.println("Which employee do you want to calculate ");
				String calculating_name = input.next();
				calculating_name += input.nextLine();
				for (int i = 0; i < xcompany.employee_list.size(); i++) {
					if (calculating_name.equals(xcompany.employee_list.get(i).getName())) {
						System.out.println(
								"Employee will be calculated soon : " + xcompany.employee_list.get(i).getName());
						System.out.println("Please enter an  number of hours worked");
						double a = input.nextDouble();
						System.out.println("Please enter an number of hours overtime worked ");
						double b = input.nextDouble();
						System.out.println("Please enter an number of amount of sale");
						int c = input.nextInt();
						xcompany.calculateSalary(a, b, c, calculating_name);
						flag=false;
						break;
					}else
						continue;
				}
				}
				flag=true;
				break;
			case 4:
				number = 4;
				xcompany.printEmploye();
				while(flag){
				System.out.println("Which employee's information do you want to save ");
				String employee_name = input.next();
				employee_name += input.nextLine();
				for (int i = 0; i < xcompany.employee_list.size(); i++) {
					if (employee_name.equals(xcompany.employee_list.get(i).getName())) {
						xcompany.fileWriter(employee_name);
						flag=false;
						break;
					}
					else
						continue;
				}
				}
				flag=true;
				break;
			case 5:
				number = 5;
				xcompany.calculateAverageAndSaveIt();
				System.out.println();	
				break;
			}
			}
		}
		
	public static void printMenu() {
		System.out.println("1. Add employee");
		System.out.println("2. Remove employee");
		System.out.println("3. Calculate salary");
		System.out.println("4. Save employee information");
		System.out.println("5. Save average of the salaries");

	}
}