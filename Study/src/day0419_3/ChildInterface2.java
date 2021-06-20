package day0419_3;

public interface ChildInterface2 extends ParentInterface {
	
	@Override
	public default void method2() {
		System.out.println("C2_mothod2() 실행");
	}
	
	public void method3();
}
