package part_basic.calc;

import java.util.Scanner;

class CircleArea {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	double radius;
	double area;
	
	// ▼UIs
	void inputRequest() { // Request UI
		System.out.print(
			"반지름을 입력해주세요 : "
		);
		input();
	}
	void returnResponse() { // Response UI
		System.out.print(
			"원의 면적은 " + area + " 입니다." + "\n"
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
