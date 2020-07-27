package part_basic.calc;

/*
	Feedback Code of info
	
	Developer : Cho Young deok(조영덕)
	Deve Started : 2020_07_28
	Github - https://github.com/seomilruss/workruss_public
	E-mail : wde906@naver.com
*/

import java.util.Scanner;

class SelectLauncher {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	private int uSelectNum;
	// ▼Datas is for UI(UserInterface)
	private String function1 = "add two number";
	private String function2 = "calc surtax & balance";
	private String function3 = "calc area circle";
	private String function4 = "calc exchange dollar";
	
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
	void start() {
		outputFunctionList();
		input();
		selectFunction(uSelectNum);
	}
	
	void outputFunctionList() {
		System.out.print(
			"select the function." + "\n" +
			"1. " + getFunction1() + "\n" +
			"2. " + getFunction2() + "\n" +
			"3. " + getFunction3() + "\n" +
			"4. " + getFunction4() + "\n"
		);
	}
	
	void input() {
		uSelectNum = input.nextInt();
	}
	void wrong() {
		System.out.println(
			"input was wrong."
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
