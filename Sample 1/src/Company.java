import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * 
 * @author AlpcanYýldýz-ÝsmailBurakKurhan , 220201049-220201055
 *
 */
public class Company {
	ArrayList<Employee> employee_list;

	public Company() {
		employee_list = new ArrayList<Employee>();

	}
	public void addingAnEmployee(String name, int age, Type type) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setAge(age);
		employee.setType(type);
		employee_list.add(employee);
	}

	public void removeAnEmployee(String name) {
		if (name != null)
			for (int i = 0; i < employee_list.size(); i++) {
				if (name.equals(employee_list.get(i).getName())) {
					System.out.println("Employee will be deleted : " + employee_list.get(i).getName());
					employee_list.remove(i);
					i--;
				}
			}
	}

	public void calculateSalary(double number_of_hours_worked, double number_of_hours_overtime_worked, int amount_of_sale,
			String name) {
		for (int i = 0; i < employee_list.size(); i++) {
			if (name.equals(employee_list.get(i).getName())) {
				employee_list.get(i).setSalary(number_of_hours_worked, number_of_hours_overtime_worked, amount_of_sale);
				System.out.println("Salary of " + employee_list.get(i).getName() + " calculated : "
						+ employee_list.get(i).getSalary());
				employee_list.get(i).setNumber_of_hours_worked(number_of_hours_worked);
				employee_list.get(i).setNumber_of_hours_overtime_worked(number_of_hours_overtime_worked);
				employee_list.get(i).setAmount_of_sale(amount_of_sale);
			}
		}
	}

	public void printEmploye() {
		for (int x = 0; x < employee_list.size(); x++) {
			System.out.println("Name of the " + (x + 1) + " . employee : " + employee_list.get(x).getName());
		}
	}

	public void fileWriter(String employee_name) {

		try {
			for (int i = 0; i < employee_list.size(); i++) {

				if (employee_name.equals(employee_list.get(i).getName())) {
					FileWriter filewriter = new FileWriter(
							"C:\\Users\\Ulpcan\\Desktop\\Java Workspace 1\\" + employee_name + ".dot");
					BufferedWriter fileoutput = new BufferedWriter(filewriter);

					fileoutput.write(employee_list.get(i).getName() + ", " + employee_list.get(i).getAge() + ", "
							+ employee_list.get(i).getType() + ", " + employee_list.get(i).getNumber_of_hours_worked()
							+ ", " + employee_list.get(i).getNumber_of_hours_overtime_worked() + ", "
							+ employee_list.get(i).getAmount_of_sale() + ", " + employee_list.get(i).getSalary());
					fileoutput.close();
					filewriter.close();
					System.out.println(employee_list.get(i).getName().toUpperCase() + " has writed to file as "
							+ employee_name + ".dot");
				}

			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void calculateAverageAndSaveIt() {
		double sum_salary = 0;
		for (int i = 0; i < employee_list.size(); i++) {

			FileReader filereader;
			try {
				filereader = new FileReader(
						"C:\\Users\\Ulpcan\\Desktop\\Java Workspace 1\\" + employee_list.get(i).getName() + ".dot");
				BufferedReader bufferreader = new BufferedReader(filereader);
				String line;
				try {
					line = bufferreader.readLine();
					StringTokenizer st = new StringTokenizer(line, ", ");
					bufferreader.close();
					boolean position = true;

					while (position) {
						if (st.countTokens() == 1) {
							sum_salary = (sum_salary + Double.parseDouble(st.nextToken()));
							position = false;
						} else {
							st.nextToken();

						}

					}

				} catch (IOException e) {
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Salary Calculated and writed to the file as a AverageSalary.dot  " + (sum_salary) / (employee_list.size()));
		FileWriter filewriter;
		try {
			filewriter = new FileWriter("C:\\Users\\Ulpcan\\Desktop\\Java Workspace 1\\AverageSalary.dot");
			BufferedWriter fileoutput = new BufferedWriter(filewriter);
			fileoutput.write("Average Salary : $" + (sum_salary) / (employee_list.size()));
			fileoutput.close();
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fileInfoReader() {
		FileReader filereader;
		try {
			filereader = new FileReader("C:\\Users\\Ulpcan\\Desktop\\Java Workspace 1\\employeeInfo.dir");
			BufferedReader bufferreader = new BufferedReader(filereader);

			String line = "";
			try {
				while ((line = bufferreader.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line, ",");
					String username = st.nextToken();
					int age = Integer.parseInt(st.nextToken(", "));
					Type value = Type.valueOf(st.nextToken(", "));
					int hour_worked = Integer.parseInt(st.nextToken(", "));
					int overtime_hour_worked = Integer.parseInt(st.nextToken(", "));
					int amount_of_sale = Integer.parseInt(st.nextToken(", "));
					double salary = Double.parseDouble(st.nextToken(", "));
					addingAnEmployeeFromFile(username, age, value, hour_worked, overtime_hour_worked, amount_of_sale,
							salary);

				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 	catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void addingAnEmployeeFromFile(String name, int age, Type type, int hour_worked, int overtime_hour_worked,
			int amount_of_sale, double salary) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setAge(age);
		employee.setType(type);
		employee.setNumber_of_hours_worked(overtime_hour_worked);
		employee.setNumber_of_hours_overtime_worked(overtime_hour_worked);
		employee.setAmount_of_sale(amount_of_sale);
		employee.setSalary(salary);
		employee_list.add(employee);
	}

}
