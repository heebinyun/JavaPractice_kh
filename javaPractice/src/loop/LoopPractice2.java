package loop;

import java.util.Scanner;

public class LoopPractice2 {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice9() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt(); 
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
				if(i%2==0 && i%3==0) {
					count ++;
				}
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}
	
	public void practice10() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		/*
		for(int i=1; i<=num; i++) {
			for(int j=num; j>0; j--) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-1-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice12() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-1-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			for(int l=0; l<i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			if(i==0 || i==num-1) {
				for(int j=0; j<num; j++) {
					System.out.print("*");
				}
			}else {
				for(int j=0; j<num; j++) {
					if(j==0 || j==num-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		boolean isTrue = true;
		if(num<2) System.out.println("잘못 입력하셨습니다.");
		else {
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					isTrue = false;
					System.out.println("소수가 아닙니다.");
					break;
				}
			}
			if(isTrue) System.out.println("소수입니다.");
			isTrue=false;
		}
	}
	
	public void practice15() {
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num<2) {
				System.out.println("잘못 입력하셨습니다."); 
				continue;
			}
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					isTrue = false;
					System.out.println("소수가 아닙니다.");
					break;
				}
			}
			if(isTrue) System.out.println("소수입니다.");
			isTrue=false;
		}
	}
	
	public void practice16() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		boolean isTrue = true;
		int count = 0;
		if(num<2) System.out.println("잘못 입력하셨습니다.");
		else {
			for(int i=2; i<=num; i++) {
				isTrue = true;
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						isTrue = false;
						break;
					}
				}
				if(isTrue) {
					System.out.print(i +" ");
					count ++;
					isTrue = false;
				}
			}
			System.out.println();
			System.out.println("2부터 " + num + "까지 소수의 개수는 " + count + "개 입니다.");
		}
	}
	
	
}
