package polymorphism.view;

import polymorphism.controller.ElectronicController;
import polymorphism.model.vo.Computer;
import polymorphism.model.vo.Tablet;

public class ElectronicView {

	public void display() {
		
		// 1. ElectronicController 객체 생성
		ElectronicController ec = new ElectronicController();
		
		// 2. ElectronicController의 insert() 메소드를 이용하여 전자제품을 객체 배열에 추가하기
		ec.insert(new Computer("삼성", "삼성컴퓨터", 2000000, "i9-9700x", "RTX2060"));
		ec.insert(new Tablet("삼성", "갤럭시탭S6", 1000000, true));
		ec.insert(new Tablet("애플", "아이패드7세대", 1200000, false));
		
		// 3. 반복문을 이용하여 객체 배열에 저장된 제품 정보 모두 출력
		for(int i=0; i<ElectronicController.elecIndex; i++) {
			System.out.println(ec.select(i));
								// Electronic Type
			
			// 4. 전달 받은 객체의 타입이 Computer 이면 "품절" 아니면 "판매가능" 출력
			System.out.println(ec.sell(ec.select(i)));
		}
	}
}
