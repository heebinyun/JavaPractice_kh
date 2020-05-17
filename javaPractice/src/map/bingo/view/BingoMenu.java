package map.bingo.view;

import java.util.Scanner;

import map.bingo.controller.BingoController;

public class BingoMenu {
	private Scanner sc = new Scanner(System.in);
	private BingoController bc = new BingoController();
	
	public void mainMenu() {
		int sel = 0;
		do {
			System.out.println("========= 빙고 게임 =========");
			System.out.println("1. 게임 시작");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1 : initGame(); break;
			case 2 : System.out.println("게임 종료"); break;
			default : System.out.println("다시 입력해주세요.");
			}
			System.out.println();
		}while(sel != 0);
	}

	// 게임 시작 전 설정 메소드
	private void initGame() {
		
		// 빙고 크기 입력
		System.out.print("빙고 크기 입력 ( ex. 5X5 빙고 --> 5) : ");
		int bingoSize = sc.nextInt();
		
		// 빙고 승리 목표 입력
		System.out.print("승리 목표 (빙고 개수) : ");
		int goal = sc.nextInt();
		sc.nextLine();
		
		// 빙고판 생성
		bc.setBingo(bingoSize, goal);
	}
}
