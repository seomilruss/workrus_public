package part_basic.calc;

class Add {
	// ▼Datas
	private int firstNum;
	private int secondNum;
	private int sum;
	
	public Add(
			int firstNum,
			int secondNum
		) {
		setFirstNum(firstNum);
		setSecondNum(secondNum);
		start();
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
//	★ Constructor Do Input values
//	void inputRequest() { // Request UI
//		System.out.print(
//			"input firstNumber & secondNumber." +
//			"[Input example : firstNumber  secondNumber]: "
//		);
//		input();
//	}
	public String toString() { // Response UI
		String result = "";
		result += "sum Number it's " + (int)getSum() + "\n";
		return result;
	}
	
	// ▼Logics
	void start() {
		input(getFirstNum(), getSecondNum());
		toString();
	}
	void input(int sum1, int sum2) {
		process1(getFirstNum(), getSecondNum());
	}
	int process1(int sum1, int sum2) {
		return sum = sum1 + sum2;
	}
}
