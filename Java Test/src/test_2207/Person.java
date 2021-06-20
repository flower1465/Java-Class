package test_2207;

public class Person {
	public String name;
	public int age;
	public int tall;
	
	Rides ride = new Rides(160);
	
	Person(String name, int age, int tall){
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	
	public void useRide(Rides ride) {
		if(tall < ride.limit) {
			System.out.println("놀이기구 이용이 불가능합니다.");
		}
		else {
			System.out.println("놀이기구 이용이 가능합니다. ");
		}
	}
}
