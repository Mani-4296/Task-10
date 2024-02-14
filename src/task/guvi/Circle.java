package task.guvi;

import java.util.Scanner;

public class Circle {
	
	private double radius;
	
	public Circle() {
		radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter circle radius to calculate circumference: ");
		double radius = input.nextDouble();
		input.close();
		
		Circle calculateRadius = new Circle(radius);
		double circumference = calculateRadius.calculateCircumference();
		System.out.println("Circumference of the given circle is: " + circumference);
		

	}

}
