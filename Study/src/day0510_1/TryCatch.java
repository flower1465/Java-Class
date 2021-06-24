package day0510_1;

public class TryCatch {
	public static void main(String[] args) {
		//이클립스는 일반 예외가 발생할 가능성이 있는 코드를 작성하면
		// 빨간 밑줄을 그어 예외 처리 코드의 필요성을 알려준다.
		//Class calzz = Class.forName("java.lang.String2");
		
		//Class.forName() 메소드는 매개값으로 주어진 클래스가 존재하면
		//Class 객체를 리턴하지만,
		//존재하지 않으면 ClassNotFoundException 예외를 발생시킨다.

		try {
			Class calzz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
