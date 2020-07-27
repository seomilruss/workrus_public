package part_basic.calc;

import java.util.Scanner;

class Bill {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	int cash;
	int total;
	double tax;
	int change;
	
	// ▼UIs
	void inputRequest() { // Request UI
		System.out.print(
			"구입한 상품의 총 가격과  손님께 받은 총 금액을 입력사세요\n" +
			"[입력예 : 상품의 총액  받은 금액] : "
		);
		input();
	}
	void returnResponse() { // Response UI
		System.out.println(
			"부가세는" + tax + "원 입니다." + "\n" +
			"잔돈은 " + change + "원 입니다."
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