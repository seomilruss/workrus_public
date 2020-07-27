package part_basic.calc;

import java.util.Scanner;

class Exchange {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	final double won = 1392.83;
	private int inputMoney;
	
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	
	public int getInputMoney() {
		return inputMoney;
	}
	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}
	
	// ▼UIs
	void inputRequest() { // Request UI
		System.out.print(
			"input the sum(unit won) : "
		);
		input();
	}
	void returnResponse() { // Response UI
		System.out.print(
			(getInputMoney()/won) + "dollar."
		);
	}
	// ▼Logics
	void start() {
		inputRequest();
		input();
	}
	
	void input() {
		inputMoney = input.nextInt();
		returnResponse();	
	}
}