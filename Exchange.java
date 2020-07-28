package part_basic.calc;

class Exchange {
	// ▼Datas
	final double won = 1392.83;
	private int inputMoney;
	String result;
	
	public Exchange(int inputMoney) {
		setInputMoney(inputMoney);
		start();
	}
	
	public int getInputMoney() {
		return inputMoney;
	}
	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}
	
	// ▼UIs
//	void inputRequest() { // Request UI
//		System.out.print(
//			"input the sum(unit won) : "
//		);
//		input();
//	}
	public String toString() { // Response UI
		return result  + "dollar.";
	}
	// ▼Logics
	void start() {
		input(getInputMoney());
		toString();
	}
	
	void input(int sum1) {
		result = sum1 / won + " ";
	}
}