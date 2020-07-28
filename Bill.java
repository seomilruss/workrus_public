package part_basic.calc;

class Bill {
	// ▼Datas
	private int cash;
	private int total;
	private double tax;
	private int change;
	
	public Bill(int cash, int total) {
		setCash(cash);
		setTotal(total);
		start();
	}
	
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	// ▼UIs
//	★ Constructor Do Input values
//	void inputRequest() { // Request UI
//		System.out.print(
//			"input item of price and guest of receive money\n" +
//			"[Input example : price  receiveMoney]"
//		);
//		input();
//	}
	
	public String toString() { // Response UI
		String result = "";
		result += "cash is " + getCash() + "(unit won)." + "\n";
		result += "total is " + getTotal() + "(unit won)." + "\n";
		result += "surtax is " + getTax() + "(unit won)." + "\n";
		result += "balance is " + getChange() + "(unit won).";
		return result;
	}
	
	// ▼Logics
	void start() {
		input(getCash(), getTotal());
		toString();
	}
	void input(
			int sum1,
			int sum2
		) {
		process1(sum1);
		process2(sum2);
	}
	double process1(int sum1) {
		return tax = sum1 * 0.1;
	}
	int process2(int sum2) {
		return change = getCash() - sum2;
	}
}