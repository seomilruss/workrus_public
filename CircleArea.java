package part_basic.calc;

class CircleArea {
	// ▼Datas
	private double radius;
	private double area;
	
	public CircleArea(
			double radius
			) {
		setRadius(radius);
		start();
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	// ▼UIs
//	void inputRequest() { // Request UI
//		System.out.print(
//			"input radius : "
//		);
//	}
	public String toString() { // Response UI
		String result = "";
		result += "radius it's " + getRadius() +"(cm)\n";
		result += "area circle it's " + getArea() + "(area)" + "\n";
		return result;
	}
	
	// ▼Logics
	void start() {
		input(getRadius());
		toString();
	}
	void input(double sumNum) {
		process1(radius);	
	}
	double process1(double sum1) {
		return area = 3.14 * radius * radius;
	}
}
