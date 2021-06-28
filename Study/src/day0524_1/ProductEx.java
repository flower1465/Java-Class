package day0524_1;

public class ProductEx {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		//<> 다이아몬드 연산자 를 사용해 자동으로 설정해 줄 수 잇다.
		
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
