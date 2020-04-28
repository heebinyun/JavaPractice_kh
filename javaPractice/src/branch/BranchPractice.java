package branch;

import java.util.Scanner;

public class BranchPractice {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
			break;
		}
	}
	
	public void practice2() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			for(int i=num; i>0; i--) {
				System.out.print(i + " ");
			}
			break;
		}
	}
	
	public void practice3() {
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			int temp = 0;
			if(num1>num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			if(num1<1 || num2<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			for(int i=num1; i<=num2; i++) {
				System.out.print(i + " ");
			}
			break;
		}
	}
	
	public void practice4() {
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num>9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			for(int i=num; i<=9; i++) {
				System.out.println("===== " + i + "단 =====");
				for(int j=1; j<=9; j++) {
					System.out.println(i + " X " + j + " = " + i*j);
				}
			}
			break;
		}
	}
	
	public void practice5() {
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		/*
		for(int i=num1; i<=num2*9+num1; i+=num2) {
			System.out.print(i + " ");
		}
		*/
		int count = 0;
		for(int i=num1; ; i+=num2) {
			System.out.print(i + " ");
			count++;
			
			if(count == 10) {
				break;
			}
		}
	}
	
	public void practice6() {
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
			case "+" : System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); break;
			case "-" : System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); break;
			case "*" : System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); break;
			case "/" : if(num1 == 0 || num2 == 0) {
							System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
							continue;
						};
						System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); break;
			case "%" : System.out.println(num1 + " % " + num2 + " = " + (num1%num2)); break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요."); 
			}
		}
	}
}
