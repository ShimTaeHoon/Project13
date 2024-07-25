package lambda;

public class Ex2 {

	public static void main(String[] args) {

		// 객체방식
//		Calc calc = new CalcImpl();
//		
//		int result = calc.add(1, 2);
//		System.out.println(result);
		
		// 람다식
		// 인터페이스를 람다식으로 구현
		Calc calc = (num1, num2) -> num1 + num2;		
		System.out.println(calc.add(3, 5));
		
		// 람다식의 동작 원리
		// 컴파일러가 람다식을 익명클래스로 변환하고, 클래스의 인스턴스를 생성함
		// 앞에있는 인터페이스를 상속받는 익명 클래스
		// 위의 람다식은 아래의 식을 포함
		// 익명클래스로 인스턴스 생성되는것
		Calc calc2 = new Calc() {

			@Override
			public int add(int num1, int num2) {
				return 0;
			}
			
		};
		
		System.out.println(calc2.add(3, 4));
		
	}

}

  
@FunctionalInterface
//함수형 어노테이션을 나타내는 어노테이션. 추상메소드가 한개 이상 추가 되는 것을 막음
//어노테이션(인터페이스를 만들때) : 인터페이스 안에 메소드가 추가되면 에러남

//함수형 인터페이스 만들기
interface Calc {
	
	// 추상메소드 만들기 (두 숫자를 더해서 합을 반환하는 함수)
	int add(int num1, int num2);
	
}

// Calc의 구현클래스 만들기
//class CalcImpl implements Calc {
//
//	@Override
//	public int add(int num1, int num2) {
//		return num1 + num2;
//	}
//	
//}
