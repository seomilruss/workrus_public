package part_basic.calc;

import java.util.Scanner;

class CircleArea {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	private double radius;
	private double area;
	
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	// ▼UIs
	void inputRequest() { // Request UI
		System.out.print(
			"input radius : "
		);
		input();
	}
	void returnResponse() { // Response UI
		System.out.print(
			"area circle it's " + area + "(area)" + "\n"
		);
	}
	
	// ▼Logics
	void start() {
		inputRequest();
		input();
	}
	void input() {
		radius = input.nextDouble();
		process1(radius);
		returnResponse();	
	}
	double process1(double sum1) {
		return area = 3.14 * radius * radius;
	}
}
