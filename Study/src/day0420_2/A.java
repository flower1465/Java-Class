package day0420_2;

public class A {
	class B{}
	
	static class C {}
	
	B fild1 = new B();
	C fild2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적필드 초기화
	static C field4 = new C();
	
	//정적 메소드
	static void method2() {
		C var2 = new C();
	}
	
	
}
