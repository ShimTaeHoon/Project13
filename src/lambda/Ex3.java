package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {

		// 문자열 리스트 생성
		List<String> list = new ArrayList<>();

		// 문자열 추가
		list.add("aaa");
		list.add("ccc");
		list.add("bbb");

		// @FunctionalInterface : 함수형인터페이스
//		Collections.sort(): 리스트의 요소를 순서대로 정렬하는 메소드
		Collections.sort(list, new Comparator<String>() {

			// 리스트 안에 있는 문자열을 비교하는 로직
			// 하나씩 꺼내서 비교
			// 리턴되는 값에 따라서 정렬하는 방식
			// 더 작은 알파벳이 앞으로 오는 로직( a -> b -> c 순)
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

		});

		System.out.println("리스트 순정렬:" + list);
		// 1. 역순으로
//		Collections.sort(list, new Comparator<String>() {
//
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//
//		});
		
		// 함수형 인터페이스인 경우에만 람다식으로 구현가능
		// 람다식으로 인터페이스 구현하기
		Collections.sort(list, (o1, o2) -> o2.compareTo(o1));

	}

}
