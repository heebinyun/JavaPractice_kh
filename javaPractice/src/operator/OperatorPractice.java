package operator;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() { 
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		String result = (input>0) ? "양수" : "양수 아님";
		System.out.println(result);
	}
	
	public void practice2() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		String result = (num>0) ? "양수" : (num == 0) ? "0이다" : "음수다" ;
		System.out.println(result);
	}
	
	public void practice3() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
	}
	
	public void practice4() {
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + (num2/num1));
		System.out.println("남는 사탕 개수 : " + (num2%num1));
	}
	
	public void practice8() {
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char input = sc.nextLine().charAt(7);
		String result = (input == '2') ? "여자" : "남자";
		System.out.println(result);
	}
	
	public void practice9() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		Boolean result = input <= num1 || input>num2;
		System.out.println(result);
	}
}
