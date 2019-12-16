package ex7;

public class RepairalbeTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Tank hurtTank = new Tank(100);
		DropShip dropShip = new DropShip();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(hurtTank);
		scv.repair(dropShip);
//		scv.repair(marine);

	}
}

interface Repairable {
};

class Unit {
	int hitpoint;
	final int MAX_HP;

	public Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	public GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	public Tank() {
		super(150);
		hitpoint = MAX_HP;
	}
	public Tank(int hp) {
		super(150);
		hitpoint = hp;
	}

	@Override
	public String toString() {
		return "Tank";
	} 
}

class DropShip extends AirUnit implements Repairable {
	public DropShip() {
		super(125);
		hitpoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "DropShip";
	}

}

class Marine extends GroundUnit {
	public Marine() {
		super(40);
		hitpoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {

	public SCV() {
		super(60);
		hitpoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit unit = (Unit) r;
			while (unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint++;
				System.out.println("치료중..");
			}
			System.out.println(unit.toString() + "의 수리가 끝났습니다.");
		}
	}
}