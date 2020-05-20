package map.bingo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

public class BingoController {
	
	private Map<String, String> bingoBoard;
	private int bingoSize;
	public static int goal;

	// 빙고판 크기 지정 및 승리 목표 지정
	public void setBingo(int bingoSize, int goal) {
		
		// 새로운 빙고판을 저장할 LinkedHashMap 객체 선언
		// * LinkedHashMap : 추가되는 순서를 유지하는 Map
		bingoBoard = new LinkedHashMap<String, String>();
		
		// 매개변수로 빙고판의 크기
		this.bingoSize = bingoSize;
		this.goal = goal;
		
		// 빙고판 생성 메소드 호출
		createBingo();
	}
	
	public Map<String, String> getBingo(){
		// 빙고판 정보 리턴
		return bingoBoard;
	}
	
	// 빙고판 생성
	public void createBingo() {
		int random = 0;
		for(int i=0; i<bingoSize * bingoSize;) {
			
			random = (int)(Math.random() * (bingoSize * bingoSize) + 1);
			if(bingoBoard.put(""+random, ""+random) == null) {
				i++;
			}
		}
	}
	
	// 빙고판에 입력된 값을 체크
	// 성립된 빙고 개수 반환
	public int checkBingo(String input) {
		
		// 입력된 값이 빙고판에 있을 경우 "X"로 변경
		if(bingoBoard.containsKey(input)) {
			bingoBoard.replace(input, "X");
		}
		
		return 0;
	}
}
