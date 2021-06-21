package day0420_2;

public class D {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class E {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class F {
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
