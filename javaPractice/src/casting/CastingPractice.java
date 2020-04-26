package casting;

import java.util.Scanner;

public class CastingPractice {

	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.print("문자 : ");
		char input = sc.nextLine().charAt(0);
		System.out.println(input + " unicode : " + (int)input);
	}
	
	public void method2() {
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(kor + eng + math));
		System.out.println("평균 : " + (int)((kor + eng + math)/3));
	}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int)dNum); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0 
		System.out.println( (double)iNum1 ); // 10.0
		
		System.out.println( (double)iNum1 / iNum2 ); // 2.5 
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int)fNum ); // 3 
		System.out.println( iNum1 / (int)fNum ); // 3
		
		System.out.println( iNum1 / fNum );// 3.3333333 
		System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335
		
		System.out.println( ch ); // 'A' 
		System.out.println( (int)ch ); // 65 
		System.out.println( ch + iNum1 ); // 75 
		System.out.println( (char)(ch + iNum1) ); // 'K
	}
}
