package entities;

public class Employee {
	public String name;
	public double salary;
	public double tax;
	
	public double salario() {
		return salary-tax;
	}	
	public void addSalary(double percentage) {
		this.salary += salary*percentage/100;
	}
	
	public String toString() {
		return name + ", R$"+salario();
	}
}
