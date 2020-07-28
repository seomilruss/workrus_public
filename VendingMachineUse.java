package part_basic.object;

import java.util.Scanner;

class VendingMachine { // 자판기
	// ▼Datas
	Scanner inputNum = new Scanner(System.in);
	DisplayUserInterface dUI = new DisplayUserInterface();
	public int userSelect; // 사용자 입력값
	public int insertMoney; // 입력값
	public int balance; // 잔액
	public int gorgiaCoffe = 800;
	public int maxwellCoffe = 500;
	public int dAndCafeCoffe = 600;
	
	class DisplayUserInterface {
		// ▼UIs
		void itemList() {
			System.out.println("원하시는 상품의 번호를 선택해주세요" + "\n" +
				"1. 조지아 커피 : " + gorgiaCoffe + "\n" +
				"2. 맥스윌 커피 : " + maxwellCoffe + "\n" +
				"3. D&cafe 커피 : " + dAndCafeCoffe
			);
		}
		void requestMoney() {
			System.out.println("돈을 투입해주세요");
		}
		void selectMoneyUnit() {
			System.out.println("투입할 돈의 단위의 번호를 선택해주세요." + "\n" +
				"1. 10원" + "\n" +
				"2. 50원" + "\n" +
				"3. 100원" + "\n" +
				"4. 500원" + "\n" +
				"5. 1000원" + "\n"
			);
		}
		void checkMomey() { // 금액 확인
			System.out.println("[현재 금액 : " + balance + " 원]");
		}
		void payOk() {
			System.out.println("결제완료, 상품이 배출되었습니다.");
		}
		void askOtherTransaction() {
			System.out.println(
				"추가로 구매하실 것이 있으신가요?" +
				"[입력예 _ 0 : true, 1 : false]"
			);
		}
		void wrong() {
			System.out.println("잘못된 입력입니다.");
		}
		void goodBye() {
			System.out.println(
				"거래가 종료되었습니다.\n" + "안녕히가세요."
			);
		}
	}
	
	
	public int getUserSelect() {
		return userSelect;
	}
	public void setUserSelect(int userSelect) {
		this.userSelect = userSelect;
	}
	public int getInsertMoney() {
		return insertMoney;
	}
	public void setInsertMoney(int insertMoney) {
		this.insertMoney = insertMoney;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	// ▼Logics
	void start() {
		transactionModule();
	}
	public void transactionModule() { // 거래
		selectItem();
		inputMoney();
	}
	public void selectItem() { // 상품선택
		dUI.itemList();
		userSelect = inputNum.nextInt();
		switch (userSelect) {
		case 1:
			insertMoney = gorgiaCoffe;
			System.out.println("조지아 커피를 선택했습니다.");
			break;
		case 2:
			insertMoney = maxwellCoffe;
			System.out.println("맥스윌 커피를 선택했습니다.");
			break;
		case 3:
			insertMoney = dAndCafeCoffe;
			System.out.println("D&cafe 커피를 선택했습니다.");
			break;
		default:
			dUI.wrong();
			break;
		}
	}
	public void inputMoney() { // 금액투입
		if (balance > insertMoney) {
			payMoney();
		} else {
			dUI.requestMoney();
			dUI.checkMomey();
			dUI.selectMoneyUnit();
			userSelect = inputNum.nextInt();
			switch (userSelect) {
			case 1:
				balance += 10;
				break;
			case 2:
				balance += 50;
				break;
			case 3:
				balance += 100;
				break;
			case 4:
				balance += 500;
				break;
			case 5:
				balance += 1000;
				break;
			default:
				dUI.wrong();
				break;
			}
			inputMoney();
		}
	}
	public void payMoney() { // 결제
		if (balance >= insertMoney) {
			balance -= insertMoney;
			dUI.payOk();
			dUI.checkMomey();
			checkOtherTransaction();
			payReturn();
			dUI.goodBye();
		} else {
			inputMoney();
		}
	}
	public void payReturn() { // 잔액 반환
		balance -= balance;
	}
	public void checkOtherTransaction() { // 다른 거래의 유무 확인
		dUI.askOtherTransaction();
		userSelect = inputNum.nextInt();
		switch (userSelect) {
		case 0:
			transactionModule();
			break;
		case 1:
			break;
		default:
			dUI.wrong();
			break;
		}
	}
}
class VendingMachineUse {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.start();
	}
}