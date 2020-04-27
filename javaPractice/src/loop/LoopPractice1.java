package loop;

import java.util.Scanner;

public class LoopPractice1 {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i=num; i>0; i--) {
				System.out.print(i + " ");
			}
		}	
	}
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		/*
		for(int i=1; i<=num; i++) {
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print(" + " + i);
			}
			sum += i;
		}
		System.out.print(" = " + sum);
		*/
		for(int i=1; i<=num; i++) {
			System.out.print(i);
			sum += i;
			if(i<num) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);
	}
	
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		/*
		if(num1 > 0 && num2 > 0) {
			if(num1>num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i);
				}
			}else {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i);
				}
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		*/
		if(num1>num2) {
			int temp = num1;
				num1 = num2;
				num2 = temp;
		}
		if(num1 > 0 && num2 > 0) {
			for(int i=num1; i<=num2; i++) {
				System.out.print(i);
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice5() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.println("===== " + dan + "단 =====");
		for(int i=1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
	
	public void practice6() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		if(dan>=10) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}else {
			for(int i=dan; i<10; i++) {
				for(int j=1; j<10; j++) {
					System.out.println(dan + " * " + i + " = " + dan*i);
				}
			}
		}
	}
	
	public void practice7() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
