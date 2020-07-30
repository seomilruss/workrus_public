package part_basic.object;

interface IMove {
	void move();
}
interface IStop {
	void stop();
}
interface IUseWeapon {
	void attack();
}
interface IPatrol {
	void patrol();
}
interface IHold {
	void hold();
}

abstract class Unit implements IMove, IStop, IUseWeapon, IPatrol, IHold {
	String name;
	int hp;
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String toString() {
		String str = "========================" + "\n";
		str += "유닛 정보" + "\n";
		str += "이름 : " + name + "\n";
		str += "체력 : " + hp;
		return str;
	}
}

class Zealot extends Unit {
	int sd;
	public Zealot(String name, int sd, int hp) {
		setName(name);
		setSd(sd);
		setHp(hp);
	}
	public int getSd() {
		return sd;
	}
	public void setSd(int sd) {
		this.sd = sd;
	}
	
	@Override
	public void move() {
		System.out.println("이동");
	}
	@Override
	public void stop() {
		System.out.println("정지");
	}
	@Override
	public void attack() {
		System.out.println(this.name + " : " + "사이오닉 검을 사용한 공격");	
	}
	@Override
	public void patrol() {
		System.out.println("순찰");
	}
	@Override
	public void hold() {
		System.out.println("위치사수");
	}
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		str += "보호막 : " + sd + "\n";
		str += "========================";
		return str;
	}
}
class Medic extends Unit {
	int mp;
	public Medic(String name, int hp, int mp) {
		setName(name);
		setHp(hp);
		setMp(mp);
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}	
	@Override
	public void move() {
		System.out.println("이동");
	}
	@Override
	public void stop() {
		System.out.println("정지");
	}
	@Override
	public void attack() {
		System.out.println("무기 없음! 공격이 불가능합니다.");
	}
	@Override
	public void patrol() {
		System.out.println("순찰");
	}
	@Override
	public void hold() {
		System.out.println("위치사수");
	}
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		str += "(사이오닉)에너지 : " + mp + "\n";
		str += "========================";
		return str;
	}
}
class Mutalisk extends Unit {
	public Mutalisk(String name, int hp) {
		setName(name);
		setHp(hp);
	}
	@Override
	public void move() {
		System.out.println("이동");
	}
	@Override
	public void stop() {
		System.out.println("정지");
	}
	@Override
	public void attack() {
		System.out.println("쐐기벌레를 투척하는 공격!");
	}
	@Override
	public void patrol() {
		System.out.println("순찰");
	}
	@Override
	public void hold() {
		System.out.println("위치사수");
	}
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		str += "========================";
		return str;
	}
}

class UseStarCraft {
	public static void main(String[] args) {
		Zealot zealot = new Zealot("질럿", 60, 100);
		Medic medic = new Medic("메딕", 60, 200);
		Mutalisk mutalisk = new Mutalisk("뮤탈리스크", 120);
		System.out.println(zealot);
		zealot.attack();
		System.out.println(medic);
		medic.attack();
		System.out.println(mutalisk);
		mutalisk.attack();
	}
}