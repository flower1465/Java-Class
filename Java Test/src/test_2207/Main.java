package test_2207;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("안병헌", 48, 167);
		Rides ride = new Rides(150);
		RollerCoaster rc = new RollerCoaster(130);
		Wheels wheels = new Wheels("롤러코스터 바퀴");
		Bolt bolt = new Bolt(10);
		
		
		//오버로딩
		rc.changeSpeed(180);
		rc.changeSpeed(140, "감속");
		
		//오버라이딩
		ride.rideRides();
		rc.rideRides();
		
	}
}