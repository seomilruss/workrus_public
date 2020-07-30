package part_basic.object;

class Zealot {
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

public class StarCraftUse {

}
