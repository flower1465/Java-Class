package test_2207;

public class RollerCoaster extends Rides{
	
	RollerCoaster(int speed){
		super(speed);
	}
	
	int curPeople = 10;
	Wheels wheels = new Wheels("롤러코스터 바퀴");
	Bolt bolt = new Bolt(10);
	
	@Override
	public void rideRides() {
		System.out.println("롤러코스터를 이용하시겠습니까?");
	}
	
	public void changeSpeed(int speed) {
		System.out.println("롤러코스터 속도 : " + speed);
	}
	
	//오버로딩
	public void changeSpeed(int speed, String change) {
		System.out.println("롤러코스터 속도 : " + speed + "으로 " + change + "되었습니다.");
	}
	
	public void coster(Wheels wheels, Bolt bolt) {
		System.out.println("롤러코스터 부품 : " + wheels.kind + ", 나사" + bolt.cm + "cm입니다.");
	}
}
