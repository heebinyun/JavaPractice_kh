package polymorphism.controller;

import polymorphism.model.vo.Child1;
import polymorphism.model.vo.Child2;
import polymorphism.model.vo.Parent;

public class PolyController {
	
	// 다형성
	// 부모 클래스 타입의 참조변수로 상속 관계에 있는 여러 타입의 자식 객체를 참조할 수 있는 기술
	
	public void method1() {
		
		// 1. 부모 타입 레퍼런스 변수로 부모 객체 다루기
		System.out.println("1. 부모 타입 레퍼런스 변수로 부모 객체 다루기");
		Parent p1 = new Parent();
	//  ㄴ 부모타입 레퍼런스	ㄴ부모타입 객체
		p1.print();
		
		System.out.println();
		
		// 2. 자식 타입 레퍼런스 변수로 자식 객체 다루기
		System.out.println("2. 자식 타입 레퍼런스 변수로 자식 객체 다루기");
		Child1 c1 = new Child1();
	//  ㄴ자식타입 레퍼런스	ㄴ자식타입 객체
		c1.printChild(); // 자식만의 메소드 접근 가능
		c1.print(); // 자식이 상속 받은 부모 메소드 접근 가능
		
		System.out.println();
		
		// 3. 부모 타입의 레퍼런스 변수로 자식 객체 다루기(다형성)
		System.out.println("3. 부모 타입의 레퍼런스 변수로 자식 객체 다루기(다형성)");
		Parent p2 = new Child1();
	//  ㄴ부모타입 레퍼런스	ㄴ자식타입 객체
		// 부모 타입 참조형 변수로 자식 타입 객체를 참조하면 자동으로 업캐스팅(Up Casting)이 진행됨
		p2.print();
		//p2.printChild();
		// 부모 타입 참조형 변수로는 자식 객체 전체 중 부모 객체 부분만 보이므로 자식의 멤버에는 접근할 수 없음
		
		// 다운 캐스팅(Down Casting)
		// 부모 타입 참조형 변수가 자식 객체의 멤버를 참조할 수 있도록 참조형 변수의 타입을 자식으로 강제 형 변환 하는 것
		((Child1)p2).printChild(); // 형변환도 연산자 .도 연산자라 .이 우선순위를 가진다 따라서 ()묶어주기
		
		// 클래스 간의 형 변환은 반드시 상속 관계인 클래스 끼리만 가능
		
		System.out.println();
		
		// 4. 자식 타입의 레퍼런스 변수로 형제 타입 객체 다루기
		System.out.println("4. 자식 타입의 레퍼런스 변수로 형제 타입 객체 다루기");
		//Child2 c2 = new Child1();
		Child2 c2 = (Child2)p1; // 컴파일 에러는 발생하지 않음. 그러나 실행 중 형 변환 관련 문제가 발생함 (-> 런타임 에러)
		
		
		// 객체 배열과 다형성
		// 다형성을 이용하여 상속 관계에 있는 하나의 부모 클래스 타입의 배열 공간에 여러 종류의 자식 클래스 객체 저장 가능
		
		// 매개변수와 다형성
		// 다형성을 이용하여 메소드 호출 시 부모타입의 변수 하나만 사용해 자식 타입의 객체를 받을 수 있음
	}

}
