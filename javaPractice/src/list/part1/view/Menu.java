package list.part1.view;

import java.util.Scanner;

import list.part1.controller.StudentController;
import list.part1.model.vo.Student;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	private StudentController con = new StudentController();
	
	public void display() {
		int sel = 0;
		do {
			System.out.println("=== 학생 관리 프로그램 ===");
			System.out.println("1. 학생 추가");
			System.out.println("2. 전체 조회");
			System.out.println("3. 학생 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 --> ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1 : insertStudent(); break;
			case 2 : printStudent(); break;
			case 3 : removeStudent(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}while(sel != 0);
	}
	
	public void insertStudent() {
		System.out.println("[학생 추가]");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("점수 : ");
		int score = sc.nextInt();
		sc.nextLine();
		
		con.insertStudent(new Student(name, score));
	}
	
	public void printStudent() {
		System.out.println("[전체 학생 정보 출력]");
		con.printStudent();
	}
	
	public void removeStudent() {
		System.out.println("[학생 삭제]");
		System.out.print("인덱스 입력 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		con.removeStudent(index);
	}
}
