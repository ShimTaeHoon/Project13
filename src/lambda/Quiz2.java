package lambda;

public class Quiz2 {

	public static void main(String[] args) {

		// 구현클래스
		Hello hello = new HelloImpl(); // 인터페이스타입
//		HelloImpl hellompl = new HelloImpl(); // 자식타입 둘 다 써도 됨
		
		hello.helloPrint();

		// 익명클래스로 인터페이스 구현 + 인스턴스 생성
		Hello hello2 = new Hello() {

			@Override
			public void helloPrint() {
				System.out.println("안녕하세요");
				
			}
			
		};
		
		hello2.helloPrint();
		
		// 람다식으로 인터페이스 구현
		Hello hello3 = () -> {
			System.out.println("안녕하세요");
		};
		hello3.helloPrint();
		
		Hello hello4 = () -> System.out.println("안녕하세요");
		hello4.helloPrint();
		
	}

}

// 함수형 인터페이스 선언
interface Hello {
	
	// "안녕하세요"를 출력하는 함수
	void helloPrint();
}

class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요");
		
	}
	
}

// Hello의 구현 클래스를 만들고, helloPrint()를 호출하세요
// Hello를 익명클래스로 구현하고, helloPrint()를 호출하세요
// Hello를 람다식 함수로 구현하고, helloPrint()를 호출하세요