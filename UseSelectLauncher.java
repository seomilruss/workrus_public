package part_basic.calc;

import java.util.Scanner;

/*
 	Github - https://github.com/seomilruss/workrus_public
*/
class SelectLauncher {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	private int uSelectNum;
	private String function1 = "두 수의 덧셈";
	private String function2 = "부가세와 잔돈을 계산";
	private String function3 = "원의 면적 계산기";
	private String function4 = "달러 환전 계산기";
	
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public int getuSelectNum() {
		return uSelectNum;
	}
	public void setuSelectNum(int uSelectNum) {
		this.uSelectNum = uSelectNum;
	}
	public String getFunction1() {
		return function1;
	}
	public void setFunction1(String function1) {
		this.function1 = function1;
	}
	public String getFunction2() {
		return function2;
	}
	public void setFunction2(String function2) {
		this.function2 = function2;
	}
	public String getFunction3() {
		return function3;
	}
	public void setFunction3(String function3) {
		this.function3 = function3;
	}
	public String getFunction4() {
		return function4;
	}
	public void setFunction4(String function4) {
		this.function4 = function4;
	}
	// ▼UIs
	public void start() {
		outputFunctionList();
		input();
		selectFunction(uSelectNum);
	}
	
	public void outputFunctionList() {
		System.out.print(
			"원하는 기능을 선택해주세요." + "\n" +
			"1. " + getFunction1() + "\n" +
			"2. " + getFunction2() + "\n" +
			"3. " + getFunction3() + "\n" +
			"4. " + getFunction4() + "\n"
		);
	}
	
	public void input() {
		uSelectNum = input.nextInt();
	}
	public void wrong() {
		System.out.println(
			"잘못된 입력입니다."
		);
	}
	// ▼Logics
	public void selectFunction(int selectNum) {
		switch(selectNum) {
			case 1:
				Add add = new Add();
				add.start();
			break;
			case 2:
				Bill bill = new Bill();
				bill.start();
			break;
			case 3:
				CircleArea ca = new CircleArea();
				ca.start();
			break;
			case 4:
				Exchange ex = new Exchange();
				ex.start();
			break;
			
			default:
				wrong();
			break;
		}
	}
}

public class UseSelectLauncher {
	public static void main(String[] args) {
		SelectLauncher sl = new SelectLauncher();
		sl.start();
	}
}
