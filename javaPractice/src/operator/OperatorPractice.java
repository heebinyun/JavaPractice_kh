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
}
