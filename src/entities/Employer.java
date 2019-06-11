package entities;

public class Employer {
	private int Id;
	private String name;
	private double salary;

	public Employer(int id, String name, double salary) {
		this.Id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString() {
		return Id + ", " + name + ", " + String.format("%.2f", salary);
	}
	

	//public String toString (int n) {
	//return ProductVector[n].getName()+ProductVector[n].getEmail()+ProductVector[n].getRoom();
	//}

}
