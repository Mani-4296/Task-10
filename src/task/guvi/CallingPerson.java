package task.guvi;

import java.util.Scanner;

public class CallingPerson {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		scanner.close();
		
		Person details = new Person();
		details.setName(name, age);
		System.out.println("Name: " + details.getName() + " Age: " + details.getAge());					
	}
}
