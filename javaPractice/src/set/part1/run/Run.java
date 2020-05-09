package set.part1.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import set.part1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// Set --> 순서 유지 X, 중복 저장 X
		Set<String> testSet = new HashSet<>();
		
		testSet.add(new String("아침"));
		testSet.add(new String("점심"));
		testSet.add(new String("저녁"));
		testSet.add(new String("고기"));
		
		System.out.println(testSet.toString());
		
		testSet.add(new String("점심"));
		System.out.println(testSet.toString());
		// String은 이미 hashCode(), equals()가 오버라이딩 되어 있음
		
		Set<Student> hs = new LinkedHashSet<>();
							// ㄴ 순서가 유지되는 HashSet
		hs.add(new Student("동동주", 20, 100));
		hs.add(new Student("전녹두", 21, 90));
		hs.add(new Student("차율무", 21, 80));
		hs.add(new Student("동동주", 20, 100));
		
		System.out.println(hs);
		// 1) 오버라이딩 전 --> 중복 제거가 이루어지지 않음
		// 2) equals() 오버라이딩 후 --> 중복제거가 되지 않음
		//		왜? HashSet은 먼저 hashCode()값이 같은지부터 판별을 하기 때문에
		//		equals() 결과가 true여도 hashCode() 값이 다르면 서로 다른 객체로 인식
		// 3) hashCode() 오버라이딩
		
		
		// Set에 저장된 객체를 하나씩 접근하는 방법
		// 1. Set을 List에 담아 준 후 접근하기
		List<Student> list = new ArrayList<Student>(hs);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("================================================================");
		
		// 2. 반복자 Iterator 사용하여 접근
		Iterator<Student> it = hs.iterator(); // set을 반복해서 접근하는 방법으로 나열을 해서 it를 이용해 참조하겠다.
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("================================================================");
		
		// 3. 향상된 for문(for-each문)
		// for(참조형 : 배열 또는 Collection){}
		// --> 참조형이 배열 또는 Collection의 요소를 하나씩 순차적으로 참조하는 형태의 반복문
		for(Student s : hs) {
			System.out.println(s);
		}
	}
}
