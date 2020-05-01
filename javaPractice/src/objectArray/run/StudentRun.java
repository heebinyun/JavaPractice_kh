package objectArray.run;

import java.util.Scanner;

import objectArray.model.vo.Student;

public class StudentRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[10];
		
		int count = 0;
		
		while(true) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			arr[count] = new Student(grade, classroom, name, kor, eng, math);
			count++;
			
			System.out.print("계속 추가하시겠습니까?(y/n) : ");
			String yn = sc.nextLine().toUpperCase();
			
			if(!yn.equals("Y"))	break;
		}
		
		for(Student s : arr) {
			if(s == null)	break;
			int sum = s.getKor() + s.getEng() + s.getMath();
			
			System.out.println(s.toString() + ", avg=" + sum/3);
		}
	}
}
