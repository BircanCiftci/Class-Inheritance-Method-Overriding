package ucuncuGunOdev;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirtsName("Bircan");
		student.setLastName("ÇİFTÇİ");
		student.setNationalIdentity("12345678901");
		student.setStudentNumber(45698);
		student.setSchool("BAİBÜ");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirtsName("Engin");
		instructor.setLastName("DEMİROG");
		instructor.setNationalIdentity("98567234568");
		instructor.setBranch("Instructor and Consultant");
		
		UserManager[] userManagers = new UserManager[] {new StudentManager(), new InstructorManager()};
		for (UserManager userManager: userManagers) {
			userManager.add(" -> işlem tamam.");
		}
		
		User[] users = {student, instructor};
		
		UserManager userManager = new UserManager();
		userManager.List(users);

	}

}
