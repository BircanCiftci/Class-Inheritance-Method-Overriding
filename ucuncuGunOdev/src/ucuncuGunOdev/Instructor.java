package ucuncuGunOdev;

public class Instructor extends User{
	private String branch;
	private double salary;

	public Instructor() {
		
	}
	
	public Instructor(String branch, double salary) {
		super();
		this.branch = branch;
		this.salary = salary;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
