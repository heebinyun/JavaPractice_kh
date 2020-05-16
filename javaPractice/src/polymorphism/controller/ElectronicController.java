package polymorphism.controller;

import polymorphism.model.vo.Computer;
import polymorphism.model.vo.Electronic;

public class ElectronicController {

	// 1. 부모 타입 객체배열을 선언 및 할당하여 자식 객체들을 일괄 관리
	private Electronic[] elec = new Electronic[3];
	
	// 객체 배열에 데이터 추가 시 인덱스를 관리해주는 변수 선언
	public static int elecIndex = 0;
	
	
	// 2. 전자 제품 등록
	// 외부에서 생성된 객체의 주소를 전달 받아 필드에 있는 객체 배열에 순서대로 저장하는 메소드 생성
	public void insert(Electronic el) {
		elec[elecIndex] = el;
		elecIndex++;
	}
	
	
	// 3. 전자 제품 정보 조회
	// 전달받은 인덱스에 해당하는 배열 요소의 정보를 출력
	public Electronic select(int index) {
		return elec[index];
			// ㄴ 객체 주소
	}
	
	
	// 4. 상품 판매 가능여부 체크
	public String sell(Electronic e) {
		if(e instanceof Computer) {
			return "품절";
		}else {
			return "판매가능";
		}
	}
}
