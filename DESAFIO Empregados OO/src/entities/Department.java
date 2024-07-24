package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;
	
	private Employee employee;
	
	private Address address;
	
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Employee getEmployee() {
		return employee;
	}

	/*public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public double payroll() {
		double sum = 0;
		for (Employee e : employees) {
			sum += e.getSalary();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("FOLHA DE PAGAMENTO: \n");
		sb.append("Departamento " +  getName() + " = R$ " + payroll() + "\n");
		sb.append("Pagamento realizado no dia " + payDay + "\n");
		sb.append("Funcionários: \n");
		sb.append("---------------------------------------------------------\n");
		for (Employee e : employees) {
			sb.append(e.getName() + "\n");
		}
		
		sb.append("---------------------------------------------------------\n");
		sb.append("Para dúvidas favor entrar em contato: " + address.getEmail());
		
		return sb.toString();
		
	}
	
}
