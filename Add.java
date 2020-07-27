package part_basic.calc;

import java.util.Scanner;

class Add {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	private int firstNum;
	private int secondNum;
	private int sum;
	
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	// ▼UIs
	void inputRequest() { // Request UI
		System.out.print(
			"input firstNumber & secondNumber." +
			"[Input example : firstNumber  secondNumber]: "
		);
		input();
	}
	void returnResponse() { // Response UI
		System.out.print(
			"sum Number it's " + sum + "\n"
		);
	}
	
	// ▼Logics
	void start() {
		inputRequest();
		input();
	}
	void input() {
		firstNum = input.nextInt();
		secondNum = input.nextInt();
		process1(firstNum, secondNum);
		returnResponse();	
	}
	double process1(int sum1, int sum2) {
		return sum = firstNum + secondNum;
	}
}
