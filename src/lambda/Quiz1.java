package lambda;

public class Quiz1 {

	public static void main(String[] args) {

		// 구현 클래스 사용
		MyNumber number1 = new MyNumberImpl();
		System.out.println(number1.max(10, 20));
		
		// 익명 클래스를 사용하여 구현
		MyNumber number2 = new MyNumber() {
			
			public int max(int x, int y) {
				return x > y ? x : y;
			}
		};
		
		int result = number2.max(10, 30);
		System.out.println("number2 : " + result);
//		System.out.println(number2.max(11, 22));
		
		// 람다식 함수를 사용하여 구현(람다식은 간단하게 사용하기 위해)
		MyNumber number3 = (x, y) -> x > y ? x : y;
		System.out.println("number 3 : " + number3.max(10, 20));

	}

}

// 함수형 인터페이스
@FunctionalInterface
interface MyNumber {
	// 두 숫자 중에 더 큰 값을 반환하는 함수
	int max(int x, int y);
}

// Q.MyNumber의 구현 클래스 만들기!
class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		// 삼항 연산자 : ? 앞의 식이 true면 x 반환 false면 y반환
		return x > y ? x : y;
	}
	
}