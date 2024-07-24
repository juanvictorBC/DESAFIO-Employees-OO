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
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address address = new Address(email, phone);
		
		Department department = new Department(name, payDay, address);
		
		System.out.println("");
		
		
		
		sc.close();
		

	}

}
