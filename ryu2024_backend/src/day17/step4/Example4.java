package day17.step4;

public class Example4 {
	public static void main(String[] args) {

		// [1] Customer customer = new Customer();
		Customer customer = new Customer();

		// [2] customer 인스턴스가 Buy 타입 형변환
		Buy buyer = customer;
		buyer.buy();// 구매하기

		// [3] customer 인스턴스가 Sell 타입 형변환
		Sell seller = customer;
		seller.sell();// 판매하기

		// [4] 변수명 instanceof 타입: 변수가 참조하는 인스턴스의 타입 조회
		if (seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
		}

	}
}
