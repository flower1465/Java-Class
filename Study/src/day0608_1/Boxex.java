package day0608_1;

public class Boxex {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.setT("hello");
		String str = box1.getT();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(6);
		int value = box2.getT();
	}
}
