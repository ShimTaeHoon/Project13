package lambda;

public class Ex1 {

	public static void main(String[] args) {

		// 객체지향방식
		// 인터페이스는 미완성클래스라 객체화 불가
		// 앞쪽은 부모 클래스 쓰고 new에는 자식으로 객체화 시킴
		// 변수는 둘다 가능!
		StringConcat stringConcat = new StringConcatImpl();
		stringConcat.makeString("Hello", "World");		

		// 함수식방식(람다식)
		// 람다식으로 인터페이스 구현하기
		// 접근제어자 , 리턴타입, 함수이름 지우고 자료형도 지우기가능
		// 중괄호도 지울수 있음(코드 한줄일때)
		StringConcat stringConcat2 = 
				(s1, s2) -> System.out.println(s1 + "," + s2);
		stringConcat2.makeString("Hi", "~~~");
		
	}

}

// 함수형 인터페이스 만들기
interface StringConcat {

	// 인터페이스 안의 메소드는 abstract가 없어도 추상메소드임
	// 추상메소드 하나 만들기 (두 문자열을 연결하는 함수)
	public void makeString(String s1, String s2);

}

// StringConcat의 구현클래스 만들기
class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		
		System.out.println(s1 + "," + s2);
		
	}
	
}

