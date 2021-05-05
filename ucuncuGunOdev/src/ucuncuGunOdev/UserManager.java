package ucuncuGunOdev;

public class UserManager {
	public void add(String message) {
		System.out.println(message);
	}
	
	public void List(User[] users) {
		for (User user : users) {
			System.out.println("Listelendi\n" + user.getFirtsName() + " " + user.getLastName());
		}
	}
}
