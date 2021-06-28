package day0524_1;

public class MainTest {
	Box<String> box = new Box<String>();
	box.setobj(new Apple());
	String str = (String) box.getobj();
}
