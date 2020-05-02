package polymorphism.view;

import java.util.Scanner;

import polymorphism.controller.LibraryController;
import polymorphism.model.vo.Book;
import polymorphism.model.vo.Member;

public class LibraryMenu {
	
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		lc.insertMember(new Member(name, age, gender));
		
		int menu = 0;
		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : System.out.println(lc.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력했습니다.");
			}
		}while(menu != 9);
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i=0; i<bList.length; i++) {
			System.out.println(i+"번 도서 : " + bList[i]);
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String key = sc.next();
		Book[] searchList = lc.searchBook(key);
		
		for(int i = 0; i<searchList.length; i++) {
			if(searchList[i] != null) {
				System.out.println(searchList[i]);
			}
		}
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		if(result == 0) System.out.println("성공적으로 대여되었습니다.");
		else if(result == 1) System.out.println("나이 제한으로 대여 불가능합니다.");
		else	System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
	}
}
