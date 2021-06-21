package day0420_3;

public class MainTest {
	
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.serOnClickListener(new CallListener());
		btn.touch();
		
		btn.serOnClickListener(new MessageListener());
		btn.touch();
	}
}
