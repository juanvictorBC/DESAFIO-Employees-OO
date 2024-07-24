package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();

		System.out.println();

		Address address = new Address(email, phone);

		Department department = new Department(name, payDay, address);

		System.out.print("Quantos funcionários tem o departamento? ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados do funcionário " + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nameEmp = sc.nextLine();
			System.out.print("Salario: ");
			double salEmp = sc.nextDouble();
			
			Employee employee = new Employee(nameEmp, salEmp);
			
			
			department.addEmployee(employee);
		}
		System.out.println();
		System.out.println(department);
		
		
		
		sc.close();
	}
}
