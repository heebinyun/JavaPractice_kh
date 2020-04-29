package array;

import java.util.Arrays;
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
	
	public void practice9() {
		String[] arr = {"후라이드", "양념", "갈릭"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(str)) {
				System.out.println(arr[i] + "치킨 배달 가능");
				count ++;
			}
		}
		if(count==0) {
			System.out.println(str+"치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		char arr[] = new char[str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		char copy[] = new char[arr.length];
		for(int i=0; i<copy.length; i++) {
			if(i<=7) {
				copy[i] = arr[i];
			}else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
	}
	
	public void practice11() {
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		int arr[] = new int[10];
		int max = 1;
		int min = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			if(max<arr[i]) max = arr[i];
			if(min>arr[i]) min = arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice13() {
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			for(int j=0; j<i; j++) {
				if(arr[j]==arr[i]) i--;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		int arr[] = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(arr[j]==arr[i]) i--;
			}
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice15() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char arr[] = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			boolean flag = true;
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				if(i==0) System.out.print(arr[i]);
				else	 System.out.print(", " + arr[i]);
				count++;
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}
	
	public void practice16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) :");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine();
				
				String newArr[] = new String[arr.length + add];
				
				for(int i=0; i<newArr.length; i++) {
					if(i<arr.length) {
						newArr[i] = arr[i];
					}else {
						System.out.print(i+"번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				// 기존 배열공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
				arr = newArr;
			}else {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
