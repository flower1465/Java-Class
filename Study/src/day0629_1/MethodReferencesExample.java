package day0629_1;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + operator.applyAsInt(1, 2));
		
		operator =  Calculator :: staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));
		
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));
	}
}
