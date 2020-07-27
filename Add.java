package part_basic.calc;

import java.util.Scanner;

class Add {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	int firstNum;
	int secondNum;
	int sum;
	
	// ▼UIs
	void inputRequest() { // Request UI
		System.out.print(
			"첫 번째 숫자와 두 번째 숫자를 입력하시오" +
			"[입력예 : 첫 번째 숫자  두 번째 숫자]: "
		);
		input();
	}
	void returnResponse() { // Response UI
		System.out.print(
			"두 수의 합은 " + sum + " 입니다." + "\n"
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
