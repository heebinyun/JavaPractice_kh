package array;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int arr[] = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice2() {
		int arr[] = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		String arr[] = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char arr[] = new char[str.length()]; 
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count ++;
			}
		}
		System.out.println();
		System.out.println(ch+" 개수 : " + count);
	}
	
	public void practice6() {
		char[] arr = {'월', '화', '수', '목', '금', '토', '일'};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 0 : case 1 : case 2 : case 3 : case 4 : 
		case 5 : case 6 : System.out.println(arr[input] +"요일"); break;
		default : System.out.println("잘못 입력하셨습니다."); break;
		}
	}
	
	public void practice7() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num%2==0 || num<3) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			int arr[] = new int[num];
			int value = 0;
			for(int i=0; i<arr.length; i++) {
				if(i<=arr.length/2) {
					value ++;
				}else {
					value --;
				}
				arr[i] = value;
				System.out.print(arr[i] + " ");
			}
			break;
		}
	}
}
