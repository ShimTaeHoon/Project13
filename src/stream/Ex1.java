package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {

		// 리스트로부터 스트림 생성하기
		// 인자는 원본 , 반환은 스트림
		// 원본데이터에 따라서 함수 선택
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); //리스트 생성
		Stream<Integer> stream1 = list.stream();
		
		// 객체 배열로부터 스트림 생성하기
		String[] strArr = { "a", "b", "c" };
		Stream<String> stream2 = Stream.of(strArr);
		Stream<String> stream3 = Arrays.stream(strArr);
		
		// 기초 배열로부터 기본형 스트림 생성하기
		int[] intArr = { 1, 2, 3, 4, 5 };
		IntStream stream4 = Arrays.stream(intArr);

	}

}
