package list.part1.controller;

import java.util.ArrayList;

import list.part1.model.vo.Student;

public class StudentController {

	ArrayList<Student> list = new ArrayList<Student>();
	
	public void method() {
		// 제네릭 타입 제한 테스트
		ArrayList list1 = new ArrayList();
		ArrayList<Student> list2 = new ArrayList<Student>();
		
		// Student 객체 추가
		list1.add(new Student());
		list2.add(new Student());
		
		// String 객체 추가
		list1.add(new String("aaa"));
		//list2.add(new String("aaa"));
		
		// 타입 제한을 왜 하는가?
		// 타입 제한을 안한 상태에서 Student 객체의 setName() 메소드 호출하기
		if(list1.get(0) instanceof Student) {
			((Student)list1.get(0)).setName("aaa");
		}
		// 타입 제한이 된 리스트에서 Student 객체의 setName() 메소드 호출하기
		list2.get(0).setName("aaa"); // 반환형 Student
	}
	
	public void insertStudent(Student std) {
		list.add(std);
	}
	
	public void printStudent() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void removeStudent(int index) {
		list.remove(index);
	}
}
