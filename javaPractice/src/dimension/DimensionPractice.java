package dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		String arr[][] = new String[3][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = "("+i+", "+j+")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int arr[][] = new int[4][4];
		int value = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				value++;
				arr[i][j] = value;
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int arr[][] = new int[4][4];
		int value = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = value;
				value--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int arr[][] = new int[4][4];
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
			}
		}
		
		for(int i=0; i<arr.length-1; i++) {
			arr[3][3] += arr[i][3] + arr[3][i];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("행 크기 : ");
			int num1 = sc.nextInt();
			System.out.print("열 크기 : ");
			int num2 = sc.nextInt();
			
			if(num1<1 || num1>10 || num2<1 || num2>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			char arr[][] = new char[num1][num2];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = (char)(Math.random()*27+65);
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			break;
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
											{"차", "지", "습", "으", "냅"}, 
											{"원", "열", "니", "로", "시"}, 
											{"배", "심", "다", "좀", "다"}, 
											{"열", "히", "! ", "더", "!! "}};
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[j][i]+ " ");
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		for(int i=0; i<row; i++) {
			System.out.print(i + "열의 크기 : ");
			int col = sc.nextInt();
			arr[i] = new char[col];
		}
		
		char value = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		String[] students =  {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		int index = 0;
		System.out.println("== 1분단 ==");
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				seat1[i][j] = students[index++];
				System.out.print(seat1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i=0; i<seat2.length; i++) {
			for(int j=0; j<seat2[i].length; j++) {
				seat2[i][j] = students[index++];
				System.out.print(seat2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] students =  {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		int index = 0;
		System.out.println("== 1분단 ==");
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				seat1[i][j] = students[index++];
				System.out.print(seat1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i=0; i<seat2.length; i++) {
			for(int j=0; j<seat2[i].length; j++) {
				seat2[i][j] = students[index++];
				System.out.print(seat2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("====================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String part = "";
		int row = 0;
		String col = "";
		
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				if(seat1[i][j].equals(name)) {
					part = "1분단";
					row = i+1;
					
					if(j==0) col = "왼쪽";
					else	 col = "오른쪽";
				}
			}
		}
		for(int i=0; i<seat2.length; i++) {
			for(int j=0; j<seat2[i].length; j++) {
				if(seat2[i][j].equals(name)) {
					part = "2분단";
					row = i+1;
					
					if(j==0) col = "왼쪽";
					else	 col = "오른쪽";
				}
			}
		}
		
		System.out.println("검색하신 " + name + " 학생은 " + part + " " + row +"열 " + col +"에 있습니다.");
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		String arr[][] = new String[6][6];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}
		
		for(int i=0; i<arr.length-1; i++) {
			arr[0][i+1] = i + "";
			arr[i+1][0] = i + "";
		}
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i == row && j == col) {
					arr[i+1][j+1] = "X";
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		String arr[][] = new String[6][6];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}
		
		for(int i=0; i<arr.length-1; i++) {
			arr[0][i+1] = i + "";
			arr[i+1][0] = i + "";
		}
		
		int row = 0;
		int col = 0;
		do {
			System.out.print("행 인덱스 입력 : ");
			row = sc.nextInt();
			
			if(row != 99) {
				System.out.print("열 인덱스 입력 : ");
				col = sc.nextInt();
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						if(i == row && j == col) {
							arr[i+1][j+1] = "X";
						}
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
			}
		}while(row != 99);
		System.out.println("프로그램 종료");
	}
}
