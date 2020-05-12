package polymorphism.model.vo;

public class Child2 extends Parent{

	private char ch;
	
	public Child2() {	}

	public Child2(int num1, int num2, char ch) {
		super(num1, num2);
		this.ch = ch;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}
	
	public void printChild2() {
		System.out.println("Child2 객체의 printChild2() 메소드 호출");
	}
}
