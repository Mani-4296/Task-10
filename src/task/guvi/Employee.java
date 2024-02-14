package task.guvi;

public class Employee {

    private	int id;
    private String firstName;
    private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getid() {
		return id;
	}
	public String getfname() {
		return firstName;
	}
	public String getlname() {
		return lastName;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return firstName + " " + lastName;
	}
	public int getAnnualSal() {
		return salary *12;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int raiseSalary(int percentageraise) {
		double raise = salary * (percentageraise/100.0);
		salary += raise;
		return salary;
	}
}

