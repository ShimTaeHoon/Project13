package innerclass;

class Outer {
	
	private int a = 10;
	private static int b = 20;
	
	// 인스턴스 내부 클래스
	class InClass {
		int i1 = a; // 외부클래스의 private 멤버도 사용 가능
		int i2 = b;
	}
	
	// 정적 내부 클래스
	static class InStaticClass {
		// static이 먼저 생성되어서 상단에 있는 a가 만들어 지기 전에
		// 프로그램 시작과동시에 a를 호출해서 없음
		// int i1 = a; // 정적클래스에서 인스턴스변수 사용 불가
		
		int i2 = b; // static에서 static 사용은 OK // 같은 시점에 생성됨 둘다 static이라
		
	}
	
}