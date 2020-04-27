package control;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 7 : System.out.println("프로그램이 종료됩니다."); break;
		}
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num>0 && num%2==0) {
			System.out.println("짝수");
		}else if(num>0 && num%2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		System.out.print("국어점수 :");
		int kor = sc.nextInt();
		System.out.print("수학점수 :");
		int math = sc.nextInt();
		System.out.print("영어점수 :");
		int eng = sc.nextInt();
		int avg = (kor + math + eng)/3;
		if(kor>=40 && math>=40 && eng>=40 && avg>=60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + avg * 3);
			System.out.println("평균 : " + (double)avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int season = sc.nextInt();
		switch(season) {
		case 1 : case 2 : case 12 : System.out.println(season + "월은 겨울입니다."); break;
		case 3 : case 4 : case 5 : System.out.println(season + "월은 봄입니다."); break;
		case 6 : case 7 : case 8 : System.out.println(season + "월은 여름입니다."); break;
		case 9 : case 10 : case 11 : System.out.println(season + "월은 가을입니다."); break;
		default : System.out.println(season + "월은 잘못 입력된 달입니다."); break;
		}
	}
	
	public void practice5() {
		String id = "user01";
		String pwd = "pass01";
		
		System.out.print("아이디 : ");
		String input1 = sc.nextLine();
		System.out.print("비밀번호 : ");
		String input2 = sc.nextLine();
		
		if(id.equals(input1) && pwd.equals(input2)) {
			System.out.println("로그인 성공");
		}else if(!pwd.equals(input2)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String mem = sc.nextLine();
		switch(mem) {
		case "관리자" : System.out.println("회원관리, 게시글 관리"); 
		case "회원" : System.out.println("게시글 작성, 댓글 작성"); 
		case "비회원" : System.out.println("게시글 조회"); break;
		}
	}
	
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height*height);
		System.out.println("BMI 지수 : " + bmi);
		if(bmi>=30) {
			System.out.println("고도 비만");
		}else if(bmi>=25) {
			System.out.println("비만");
		}else if(bmi>=23) {
			System.out.println("과체중");
		}else if(bmi>=18.5) {
			System.out.println("정상체중");
		}else {
			System.out.println("저체중");
		}
	}
	
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,% : ");
		char op = sc.nextLine().charAt(0);
		switch(op) {
		case '+' : System.out.println(num1 +" " + op + " " + num2 + " = " + (double)(num1+num2)); break;
		case '-' : System.out.println(num1 +" " + op + " " + num2 + " = " + (double)(num1-num2)); break;
		case '*' : System.out.println(num1 +" " + op + " " + num2 + " = " + (double)(num1*num2)); break;
		case '/' : System.out.println(num1 +" " + op + " " + num2 + " = " + (double)(num1/num2)); break;
		case '%' : System.out.println(num1 +" " + op + " " + num2 + " = " + (double)(num1%num2)); break;
		}
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int work = sc.nextInt();
		System.out.print("출석 점수 : ");
		int attendance = sc.nextInt();
		System.out.println("========= 결과 =========");
		if(attendance > 14) {
			double sum = mid * 0.2 + fin * 0.3 + work * 0.3 + (double)attendance;
			System.out.println("중간 고사 점수(20) : " + mid * 0.2);
			System.out.println("기말 고사 점수(30) : " + fin * 0.3);
			System.out.println("과제 점수(30) : " + work * 0.3);
			System.out.println("출석 점수(20) : " + (double)attendance);
			System.out.println("총점 : " + sum);
			if(sum>=70) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [점수 미달]");
			}
		}else {
			System.out.println("Fail [출석 회수 부족 (" + attendance+"/20) ]");
		}
	}
	
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		}
	}
}
