package task.guvi;

import java.util.Scanner;

public class CallingEmployee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name(first and last): " );
		String name = input.nextLine();
		System.out.println("Enter your id: ");
		int id = input.nextInt();
		System.out.println("Enter your monthly salary: ");
		int sal = input.nextInt();
		System.out.println("Percentage to be increased is: ");
		int newSal = input.nextInt();
		input.close();
	
	Employee raisepay = new Employee(id, name, "" , sal);
	System.out.println("Initial salary is: " + raisepay.getSalary());
	System.out.println("Inital annual sal is: " + raisepay.getAnnualSal());
	
	int newSalary = raisepay.raiseSalary(newSal);
	System.out.println("Your update monthly salary is: " + newSalary);
	System.out.println("Your updated annual sal is: " + raisepay.getAnnualSal());
	
   }
}