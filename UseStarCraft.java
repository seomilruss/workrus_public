package part_basic.object;

class Zealot {
	String name = "질럿";
	int sd = 60;
	int hp = 100;
	
	public void attack() {
		System.out.println("공격");
	}
	public void hold() {
		System.out.println("위치사수");
	}
	public void stop() {
		System.out.println("정지");
	}
	public void move() {
		System.out.println("이동");
	}
	public void patrol() {
		System.out.println("순찰");
	}
}
class Medic {
	String name = "메딕";
	int hp = 60;
	int mp = 200;
	
	public void hold() {
		System.out.println("위치사수");
	}
	public void stop() {
		System.out.println("정지");
	}
	public void move() {
		System.out.println("이동");
	}
	public void patrol() {
		System.out.println("순찰");
	}
}
class Mutalisk {
	String name = "뮤탈리스크";
	int hp = 120;
	
	public void attack() {
		System.out.println("공격");
	}
	public void hold() {
		System.out.println("위치사수");
	}
	public void stop() {
		System.out.println("정지");
	}
	public void move() {
		System.out.println("이동");
	}
	public void patrol() {
		System.out.println("순찰");
	}
}

class UseStarCraft {
	public static void main(String[] args) {
		Zealot zealot = new Zealot();
		Medic medic = new Medic();
		Mutalisk mutalisk = new Mutalisk();
		System.out.println(zealot.name);
		zealot.attack();
		System.out.println(medic.name);
		medic.move();
		System.out.println(mutalisk.name);
		mutalisk.hold();
	}
}
