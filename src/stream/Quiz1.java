package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 다음과 같이 리스트를 생성하세요
		String[] arr = {"aaa", "aaa", "b", "b", "ccccc"};
		
		// 1. 문자열 목록 중에서 길이가  / 2보다 큰 요소의 개수를 구하세요 (결과 :3)
		Stream<String> stream = Arrays.stream(arr);
		long result = stream.filter(t -> (t.length() > 2))
					 .count();
		
		System.out.println(result);
		
		// 2. 모든 문자열의 길이를 / 더한 합을 구하세요 (결과 : 13)
		Stream<String> stream2 = Arrays.stream(arr);
//		IntStream intStream = stream2
//								.mapToInt(n -> n.intValue()); 
								// mapToInt로 스트림 변환 하고 싶었지만 안됨. . .
		int result2 = stream2
				.mapToInt(n -> n.length())
				.sum();
		
		System.out.println(result2);
		
		// 3. 가장 길이가 짧은 문자열의 길이를 구하세요 (결과 : 1)
		Stream<String> stream3 = Arrays.stream(arr);
//		int result3 = stream3
//				.mapToInt(n -> n.length())
//				.min(); 
				// 숫자타입 스트림은 sum, max, min함수를 사용 가능 하다고 했는데 어째서?
				// mapToInt로 스트림 변환이...................
//      ---------------------------------------------
//				int result3 = Arrays.stream3(arr)
//				.mapToInt(n -> n.length())
//				.min();
		
		OptionalInt result3 = Arrays.stream(arr) // 이클립스에서 OptionalInt로 변환해서 쓰라함
				.mapToInt(n -> n.length())
				.min();
//				.forEach(n -> sysout) // sysout안써짐ㅡㅡ
		
		System.out.println(result3);
		// 4. 중복을 제거한 리스트를 만드세요 (결과 : [aaa, b, ccccc]
		
		List<String> stream4 = Arrays.stream(arr)
			   .distinct()
			   .collect(Collectors.toList());
//			   .forEach(n -> System.out.println(n)); // 타입안맞다고 안됨..하
		
		System.out.println(stream4);
	}

}
