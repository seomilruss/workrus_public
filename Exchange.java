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
			"원화를 입력해주세요 : "
		);
		input();
	}
	void returnResponse() { // Response UI
		System.out.print(
			(getInputMoney()/won) + "달러"
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