package ucuncuGunOdev;

public class Student extends User{
	private int studentNumber;
	private String school;
	
	public Student() {
		
	}

	public Student(int studentNumber, String school) {
		super();
		this.studentNumber = studentNumber;
		this.school = school;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
