package part_basic.calc;

import java.util.Scanner;

class Bill {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	private int cash;
	private int total;
	private double tax;
	private int change;
	
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	// ▼UIs
	void inputRequest() { // Request UI
		System.out.print(
			"input item of price and guest of receive money\n" +
			"[Input example : price  receiveMoney]"
		);
		input();
	}
	void returnResponse() { // Response UI
		System.out.println(
			"surtax is " + tax + "(unit won)." + "\n" +
			"balance is " + change + "(unit won)."
		);
	}	
	// ▼Logics
	void start() {
		inputRequest();
		input();
	}
	void input() {
		cash = input.nextInt();
		total = input.nextInt();
		process1(cash);
		process2(total);
		returnResponse();
	}
	double process1(int sum1) {
		return tax = cash * 0.1;
	}
	int process2(int sum2) {
		return change = cash - total;
	}
}