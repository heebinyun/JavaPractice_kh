package list.view;

import java.util.List;
import java.util.Scanner;

import list.controller.MusicController;
import list.model.vo.Music;

public class MusicView {
	
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		int menu = 0;
		do {
			System.out.println("****** 메인 메뉴 ******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll(); break;
			case 4 : searchMusic(); break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : ascTitle(); break;
			case 8 : descSinger(); break;
			case 9 : System.out.println("종료"); return;
			default : System.out.println("잘못입력하셨습니다.");
			}
		}while(menu != 9);
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title,singer);
		boolean result = mc.addList(music);
		
		if(result) System.out.println("추가 성공");
		else	   System.out.println("추가 실패");
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title,singer);
		int result = mc.addAtZero(music);
		
		if(result == 1) System.out.println("추가 성공");
		else	   System.out.println("추가 실패");
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		List list = mc.printAll();
		if(list != null) System.out.println(list);
		else			System.out.println("곡 목록이 없습니다.");
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		Music music = mc.searchMusic(title);
		if(music != null) System.out.println("검색한 곡은 " + music + " 입니다.");
		else			System.out.println("검색한 곡이 없습니다.");
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		Music music = mc.removeMusic(title);
		if(music != null) System.out.println(music + " 을 삭제했습니다.");
		else			System.out.println("삭제할 곡이 없습니다.");
	}
	
	public void setMusic() {
		System.out.println("****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String searchTitle = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		Music result = mc.setMusic(title, music);
		if(result != null) System.out.println(result + "가 값이 변경되었습니다.");
		else				System.out.println("수정할 곡이 업습니다.");
	}
	
	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int result = mc.acsTitle();
		if(result == 1) System.out.println("정렬 성공");
		else			System.out.println("정렬 실패");
	}
	
	public void descSinger() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		int result = mc.descSinger();
		if(result == 1) System.out.println("정렬 성공");
		else			System.out.println("정렬 실패");
	}
}
