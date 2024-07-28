package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		
		// 스트림의 특징 3가지
		
		// 1. 한번 생성하고 사용한 스트림은 재사용할 수 없다
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3);
		Stream<Integer> stream = list.stream(); // 리스트 -> 스트림
		
		// forEach: 반복적인 작업을 수행하는 연산자
		stream.forEach((t) -> System.out.print(t));
		// count: 요소의 길이를 반환하는 연산자
		// stream은 한번사용 하면 닫혀서 사용불가
//		long count = stream.count();
		System.out.println();
		
		// 2. 스트림 연산은 원본데이터를 변경하지 않는다
		Stream<Integer> stream2 = list.stream(); //스트림 재생성
		
		// sorted: 요소들을 정렬하는 연산자
		// collect: 스트림을 list로 변환하는 연산자
		List<Integer> sortedList = stream2.sorted().collect(Collectors.toList());
				// 중간연산// 최종연산자
		System.out.println(list); //원본데이터 리스트로 변환 된 [5, 1, 2, 4, 3, 3] 
		System.out.println(sortedList); 
		
		// 3. 중간연산은 여러번 할 수 있고, 최종연산은 마지막에 한번만 할 수 있다
		Stream<Integer> stream3 = list.stream();
		
		// filter: 조건을 만족하는 요소만 추출하는 연산자
		// sorted: 순서대로 정렬하는 연산자
		stream3.filter(t -> t>=3).sorted().forEach(t -> System.out.print(t));
		
		Stream<Integer> stream4 = list.stream();
		Stream<Integer> stream5 = stream4.filter(t -> t>=3);
		Stream<Integer> stream6 = stream5.sorted();
		
		System.out.println();
		stream6.forEach(t -> System.out.println(t));
		
	}

}

//void accpet(T t) {
//	System.out.println(t);
//}
  // 값이 3과 같거나 크면 true
//boolean test(T t) {
//	
//////	if(t>=3) {
//////		return true;
//////	} else {
//////		return false;
//////	}
//	
//	return t>=3;
//	
//}

// 추상메소드 구현하기! 반복하고 싶은 작업.. -> 람다만들어서 익명클래스
//(T t) -> {
//	System.out.println(t);
//}
