package lambda;

public class Quiz3 {

	public static void main(String[] args) {

		// 구현
		StringConverter stringC1 = new StringConverterImpl();
		String result = stringC1.convert("a");
		System.out.println(result);

		// 익명
		StringConverter stringC = new StringConverter() {
			
			@Override
			public String convert(String s) {
				return s.toUpperCase();
			}
		};
		
		String result2 = stringC.convert("a"); 
		System.out.println(result2);

		// 람다식
		StringConverter convert3 = s -> s.toUpperCase();
		StringConverter result3 = convert3;
		System.out.println(result3.convert("b"));
		
		StringConverter convert4 = (String s) -> {
			return s.toUpperCase();
		};
		
		
	}
	
		
		
}

//함수형 인터페이스 선언
interface StringConverter {
	
	// 문자열을 대문자로 변환해서 반환하는 함수
	String convert(String s);
	
}

class StringConverterImpl implements StringConverter{

	@Override
	public String convert(String s) {
		return s.toUpperCase();
	}
	
}

// 1.StringConverter의 구현 클래스를 만들고, convert()를 호출하세요
// 2.StringConverter의 익명 클래스로 구현하고, convert()를 호출하세요
// 3.StringConverter의 람다식 함수로 구현하고, convert()를 호출하세요